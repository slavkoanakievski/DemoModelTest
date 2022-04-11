package com.example.demo.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Dim_Brand", schema = "dbo", catalog = "Invoice Management")
public class Table_DimBrand {
    private Integer brandId;
    private String brandName;
    private String brandManufacturer;
    private String brandDescription;
    private Integer brandActiveFlag;
    private Date brandDateCreated;
    private Date brandDateModified;
    private Integer companyId;
    private Table_DimCompany dimCompanyByCompanyId;
    private Collection<Table_Product> productsByBrandId;

    @Id
    @Column(name = "brand_id", nullable = false)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "brand_name", nullable = false, length = 100)
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "brand_manufacturer", nullable = true, length = 100)
    public String getBrandManufacturer() {
        return brandManufacturer;
    }

    public void setBrandManufacturer(String brandManufacturer) {
        this.brandManufacturer = brandManufacturer;
    }

    @Basic
    @Column(name = "brand_description", nullable = true, length = 500)
    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    @Basic
    @Column(name = "brand_active_flag", nullable = false)
    public Integer getBrandActiveFlag() {
        return brandActiveFlag;
    }

    public void setBrandActiveFlag(Integer brandActiveFlag) {
        this.brandActiveFlag = brandActiveFlag;
    }

    @Basic
    @Column(name = "brand_date_created", nullable = true)
    public Date getBrandDateCreated() {
        return brandDateCreated;
    }

    public void setBrandDateCreated(Date brandDateCreated) {
        this.brandDateCreated = brandDateCreated;
    }

    @Basic
    @Column(name = "brand_date_modified", nullable = true)
    public Date getBrandDateModified() {
        return brandDateModified;
    }

    public void setBrandDateModified(Date brandDateModified) {
        this.brandDateModified = brandDateModified;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
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

        Table_DimBrand that = (Table_DimBrand) o;

        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (brandManufacturer != null ? !brandManufacturer.equals(that.brandManufacturer) : that.brandManufacturer != null)
            return false;
        if (brandDescription != null ? !brandDescription.equals(that.brandDescription) : that.brandDescription != null)
            return false;
        if (brandActiveFlag != null ? !brandActiveFlag.equals(that.brandActiveFlag) : that.brandActiveFlag != null)
            return false;
        if (brandDateCreated != null ? !brandDateCreated.equals(that.brandDateCreated) : that.brandDateCreated != null)
            return false;
        if (brandDateModified != null ? !brandDateModified.equals(that.brandDateModified) : that.brandDateModified != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brandId != null ? brandId.hashCode() : 0;
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (brandManufacturer != null ? brandManufacturer.hashCode() : 0);
        result = 31 * result + (brandDescription != null ? brandDescription.hashCode() : 0);
        result = 31 * result + (brandActiveFlag != null ? brandActiveFlag.hashCode() : 0);
        result = 31 * result + (brandDateCreated != null ? brandDateCreated.hashCode() : 0);
        result = 31 * result + (brandDateModified != null ? brandDateModified.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
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

    @OneToMany(mappedBy = "dimBrandByBrandId")
    public Collection<Table_Product> getProductsByBrandId() {
        return productsByBrandId;
    }

    public void setProductsByBrandId(Collection<Table_Product> productsByBrandId) {
        this.productsByBrandId = productsByBrandId;
    }
}
