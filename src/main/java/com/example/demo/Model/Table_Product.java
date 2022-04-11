package com.example.demo.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Product", schema = "dbo", catalog = "Invoice Management")
public class Table_Product {
    private Integer productId;
    private Integer companyId;
    private Integer brandId;
    private Integer categoryId;
    private String productBarcode;
    private String productName;
    private String productDescription;
    private Integer productModelYear;
    private Integer productActiveFlag;
    private Integer productOrServiceFlag;
    private String productColor;
    private Date productDateCreated;
    private Date productDateModified;
    private Table_DimCompany dimCompanyByCompanyId;
    private Table_DimBrand dimBrandByBrandId;
    private Table_DimCategory dimCategoryByCategoryId;
    private Collection<Table_ProductUom> productUomsByProductId;

    @Id
    @Column(name = "product_id", nullable = false)
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "brand_id", nullable = true)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "category_id", nullable = false)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "product_barcode", nullable = false, length = 100)
    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode;
    }

    @Basic
    @Column(name = "product_name", nullable = false, length = 100)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_description", nullable = true, length = 300)
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Basic
    @Column(name = "product_model_year", nullable = true)
    public Integer getProductModelYear() {
        return productModelYear;
    }

    public void setProductModelYear(Integer productModelYear) {
        this.productModelYear = productModelYear;
    }

    @Basic
    @Column(name = "product_active_flag", nullable = true)
    public Integer getProductActiveFlag() {
        return productActiveFlag;
    }

    public void setProductActiveFlag(Integer productActiveFlag) {
        this.productActiveFlag = productActiveFlag;
    }

    @Basic
    @Column(name = "product_or_service_flag", nullable = false)
    public Integer getProductOrServiceFlag() {
        return productOrServiceFlag;
    }

    public void setProductOrServiceFlag(Integer productOrServiceFlag) {
        this.productOrServiceFlag = productOrServiceFlag;
    }

    @Basic
    @Column(name = "product_color", nullable = true, length = 100)
    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    @Basic
    @Column(name = "product_date_created", nullable = true)
    public Date getProductDateCreated() {
        return productDateCreated;
    }

    public void setProductDateCreated(Date productDateCreated) {
        this.productDateCreated = productDateCreated;
    }

    @Basic
    @Column(name = "product_date_modified", nullable = true)
    public Date getProductDateModified() {
        return productDateModified;
    }

    public void setProductDateModified(Date productDateModified) {
        this.productDateModified = productDateModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_Product that = (Table_Product) o;

        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (productBarcode != null ? !productBarcode.equals(that.productBarcode) : that.productBarcode != null)
            return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productDescription != null ? !productDescription.equals(that.productDescription) : that.productDescription != null)
            return false;
        if (productModelYear != null ? !productModelYear.equals(that.productModelYear) : that.productModelYear != null)
            return false;
        if (productActiveFlag != null ? !productActiveFlag.equals(that.productActiveFlag) : that.productActiveFlag != null)
            return false;
        if (productOrServiceFlag != null ? !productOrServiceFlag.equals(that.productOrServiceFlag) : that.productOrServiceFlag != null)
            return false;
        if (productColor != null ? !productColor.equals(that.productColor) : that.productColor != null) return false;
        if (productDateCreated != null ? !productDateCreated.equals(that.productDateCreated) : that.productDateCreated != null)
            return false;
        if (productDateModified != null ? !productDateModified.equals(that.productDateModified) : that.productDateModified != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (productBarcode != null ? productBarcode.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        result = 31 * result + (productModelYear != null ? productModelYear.hashCode() : 0);
        result = 31 * result + (productActiveFlag != null ? productActiveFlag.hashCode() : 0);
        result = 31 * result + (productOrServiceFlag != null ? productOrServiceFlag.hashCode() : 0);
        result = 31 * result + (productColor != null ? productColor.hashCode() : 0);
        result = 31 * result + (productDateCreated != null ? productDateCreated.hashCode() : 0);
        result = 31 * result + (productDateModified != null ? productDateModified.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
    public Table_DimCompany getDimCompanyByCompanyId() {
        return dimCompanyByCompanyId;
    }

    public void setDimCompanyByCompanyId(Table_DimCompany dimCompanyByCompanyId) {
        this.dimCompanyByCompanyId = dimCompanyByCompanyId;
    }

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    public Table_DimBrand getDimBrandByBrandId() {
        return dimBrandByBrandId;
    }

    public void setDimBrandByBrandId(Table_DimBrand dimBrandByBrandId) {
        this.dimBrandByBrandId = dimBrandByBrandId;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
    public Table_DimCategory getDimCategoryByCategoryId() {
        return dimCategoryByCategoryId;
    }

    public void setDimCategoryByCategoryId(Table_DimCategory dimCategoryByCategoryId) {
        this.dimCategoryByCategoryId = dimCategoryByCategoryId;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<Table_ProductUom> getProductUomsByProductId() {
        return productUomsByProductId;
    }

    public void setProductUomsByProductId(Collection<Table_ProductUom> productUomsByProductId) {
        this.productUomsByProductId = productUomsByProductId;
    }
}
