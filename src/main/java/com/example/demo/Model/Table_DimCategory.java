package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Dim_Category", schema = "dbo", catalog = "Invoice Management")
public class Table_DimCategory {
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;
    private Integer categoryActiveFlag;
    private Integer companyId;
    private Table_DimCompany dimCompanyByCompanyId;
    private Collection<Table_Product> productsByCategoryId;

    @Id
    @Column(name = "category_id", nullable = false)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name", nullable = false, length = 100)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_description", nullable = true, length = 300)
    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Basic
    @Column(name = "category_active_flag", nullable = false)
    public Integer getCategoryActiveFlag() {
        return categoryActiveFlag;
    }

    public void setCategoryActiveFlag(Integer categoryActiveFlag) {
        this.categoryActiveFlag = categoryActiveFlag;
    }

    @Basic
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_DimCategory that = (Table_DimCategory) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryDescription != null ? !categoryDescription.equals(that.categoryDescription) : that.categoryDescription != null)
            return false;
        if (categoryActiveFlag != null ? !categoryActiveFlag.equals(that.categoryActiveFlag) : that.categoryActiveFlag != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryDescription != null ? categoryDescription.hashCode() : 0);
        result = 31 * result + (categoryActiveFlag != null ? categoryActiveFlag.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    public Table_DimCompany getDimCompanyByCompanyId() {
        return dimCompanyByCompanyId;
    }

    public void setDimCompanyByCompanyId(Table_DimCompany dimCompanyByCompanyId) {
        this.dimCompanyByCompanyId = dimCompanyByCompanyId;
    }

    @OneToMany(mappedBy = "dimCategoryByCategoryId")
    public Collection<Table_Product> getProductsByCategoryId() {
        return productsByCategoryId;
    }

    public void setProductsByCategoryId(Collection<Table_Product> productsByCategoryId) {
        this.productsByCategoryId = productsByCategoryId;
    }
}
