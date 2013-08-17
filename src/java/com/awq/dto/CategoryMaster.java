package com.awq.dto;

import com.awq.interfaces.CategoryHandler;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;

@Entity
@Table(name = "awq_category_master")
@NamedQuery(name = "CategoryID.byName", query = "from CategoryMaster where category = ?")
public class CategoryMaster implements CategoryHandler, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int category_id;
    private String category;

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the category_id
     */
    public int getCategory_id() {
        return category_id;
    }

    /**
     * @param category_id the category_id to set
     */
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public boolean checkIfCategoryExists(Session session, String category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCategoryID(Session session, String category) {
        Query query = session.getNamedQuery("CategoryID.byName");
        query.setString(0, category);
        List<CategoryMaster> lists = (List<CategoryMaster>) query.list();
        if (lists.size() > 0) {
            return lists.get(0).getCategory_id();
        } else {
            return -1;
        }
    }

    public boolean setCategoryID(Session session, String category) {

        CategoryMaster ct = new CategoryMaster();
        ct.setCategory(category);

        try {
            session.saveOrUpdate(ct);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
