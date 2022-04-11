package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Dim_Company", schema = "dbo", catalog = "Invoice Management")
public class Table_DimCompany {
    private Integer companyId;
    private String companyName;
    private String companyAddress;
    private String companyWebsite;
    private String companyEmail;
    private Collection<Table_DimBrand> dimBrandsByCompanyId;
    private Collection<Table_DimCategory> dimCategoriesByCompanyId;
    private Collection<Table_DimClient> dimClientsByCompanyId;
    private Collection<Table_DimUnit> dimUnitsByCompanyId;
    private Collection<Table_Invoice> invoicesByCompanyId;
    private Collection<Table_Product> productsByCompanyId;
    private Collection<Table_ProductUom> productUomsByCompanyId;
    private Collection<Table_ProductUomHistory> productUomHistoriesByCompanyId;
    private Collection<Table_ShippingCalculations> shippingCalculationsByCompanyId;
    private Collection<Table_User> usersByCompanyId;

    @Id
    @Column(name = "company_id", nullable = false)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_name", nullable = false, length = 100)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_address", nullable = true, length = 100)
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "company_website", nullable = true, length = 100)
    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    @Basic
    @Column(name = "company_email", nullable = true, length = 100)
    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_DimCompany that = (Table_DimCompany) o;

        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (companyAddress != null ? !companyAddress.equals(that.companyAddress) : that.companyAddress != null)
            return false;
        if (companyWebsite != null ? !companyWebsite.equals(that.companyWebsite) : that.companyWebsite != null)
            return false;
        if (companyEmail != null ? !companyEmail.equals(that.companyEmail) : that.companyEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyId != null ? companyId.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyAddress != null ? companyAddress.hashCode() : 0);
        result = 31 * result + (companyWebsite != null ? companyWebsite.hashCode() : 0);
        result = 31 * result + (companyEmail != null ? companyEmail.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_DimBrand> getDimBrandsByCompanyId() {
        return dimBrandsByCompanyId;
    }

    public void setDimBrandsByCompanyId(Collection<Table_DimBrand> dimBrandsByCompanyId) {
        this.dimBrandsByCompanyId = dimBrandsByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_DimCategory> getDimCategoriesByCompanyId() {
        return dimCategoriesByCompanyId;
    }

    public void setDimCategoriesByCompanyId(Collection<Table_DimCategory> dimCategoriesByCompanyId) {
        this.dimCategoriesByCompanyId = dimCategoriesByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_DimClient> getDimClientsByCompanyId() {
        return dimClientsByCompanyId;
    }

    public void setDimClientsByCompanyId(Collection<Table_DimClient> dimClientsByCompanyId) {
        this.dimClientsByCompanyId = dimClientsByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_DimUnit> getDimUnitsByCompanyId() {
        return dimUnitsByCompanyId;
    }

    public void setDimUnitsByCompanyId(Collection<Table_DimUnit> dimUnitsByCompanyId) {
        this.dimUnitsByCompanyId = dimUnitsByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_Invoice> getInvoicesByCompanyId() {
        return invoicesByCompanyId;
    }

    public void setInvoicesByCompanyId(Collection<Table_Invoice> invoicesByCompanyId) {
        this.invoicesByCompanyId = invoicesByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_Product> getProductsByCompanyId() {
        return productsByCompanyId;
    }

    public void setProductsByCompanyId(Collection<Table_Product> productsByCompanyId) {
        this.productsByCompanyId = productsByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_ProductUom> getProductUomsByCompanyId() {
        return productUomsByCompanyId;
    }

    public void setProductUomsByCompanyId(Collection<Table_ProductUom> productUomsByCompanyId) {
        this.productUomsByCompanyId = productUomsByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_ProductUomHistory> getProductUomHistoriesByCompanyId() {
        return productUomHistoriesByCompanyId;
    }

    public void setProductUomHistoriesByCompanyId(Collection<Table_ProductUomHistory> productUomHistoriesByCompanyId) {
        this.productUomHistoriesByCompanyId = productUomHistoriesByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_ShippingCalculations> getShippingCalculationsByCompanyId() {
        return shippingCalculationsByCompanyId;
    }

    public void setShippingCalculationsByCompanyId(Collection<Table_ShippingCalculations> shippingCalculationsByCompanyId) {
        this.shippingCalculationsByCompanyId = shippingCalculationsByCompanyId;
    }

    @OneToMany(mappedBy = "dimCompanyByCompanyId")
    public Collection<Table_User> getUsersByCompanyId() {
        return usersByCompanyId;
    }

    public void setUsersByCompanyId(Collection<Table_User> usersByCompanyId) {
        this.usersByCompanyId = usersByCompanyId;
    }
}
