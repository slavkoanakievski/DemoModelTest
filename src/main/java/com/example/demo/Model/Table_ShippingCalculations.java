package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Shipping_Calculations", schema = "dbo", catalog = "Invoice Management")
public class Table_ShippingCalculations {
    private Integer shippingId;
    private String shippingName;
    private String shippingToCountry;
    private String shippingToState;
    private String shippingClass;
    private String shippingPackageWeight;
    private String shippingCostBasedOn;
    private Integer shippingCost;
    private Integer shippingActiveFlag;
    private Integer companyId;
    private Collection<Table_Invoice> invoicesByShippingId;
    private Table_DimCompany dimCompanyByCompanyId;

    @Id
    @Column(name = "shipping_id", nullable = false)
    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    @Basic
    @Column(name = "shipping_name", nullable = false, length = 100)
    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    @Basic
    @Column(name = "shipping_to_country", nullable = true, length = 100)
    public String getShippingToCountry() {
        return shippingToCountry;
    }

    public void setShippingToCountry(String shippingToCountry) {
        this.shippingToCountry = shippingToCountry;
    }

    @Basic
    @Column(name = "shipping_to_state", nullable = true, length = 100)
    public String getShippingToState() {
        return shippingToState;
    }

    public void setShippingToState(String shippingToState) {
        this.shippingToState = shippingToState;
    }

    @Basic
    @Column(name = "shipping_class", nullable = true, length = 100)
    public String getShippingClass() {
        return shippingClass;
    }

    public void setShippingClass(String shippingClass) {
        this.shippingClass = shippingClass;
    }

    @Basic
    @Column(name = "shipping_package_weight", nullable = true, length = 200)
    public String getShippingPackageWeight() {
        return shippingPackageWeight;
    }

    public void setShippingPackageWeight(String shippingPackageWeight) {
        this.shippingPackageWeight = shippingPackageWeight;
    }

    @Basic
    @Column(name = "shipping_cost_based_on", nullable = true, length = 200)
    public String getShippingCostBasedOn() {
        return shippingCostBasedOn;
    }

    public void setShippingCostBasedOn(String shippingCostBasedOn) {
        this.shippingCostBasedOn = shippingCostBasedOn;
    }

    @Basic
    @Column(name = "shipping_cost", nullable = false)
    public Integer getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Basic
    @Column(name = "shipping_active_flag", nullable = false)
    public Integer getShippingActiveFlag() {
        return shippingActiveFlag;
    }

    public void setShippingActiveFlag(Integer shippingActiveFlag) {
        this.shippingActiveFlag = shippingActiveFlag;
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

        Table_ShippingCalculations that = (Table_ShippingCalculations) o;

        if (shippingId != null ? !shippingId.equals(that.shippingId) : that.shippingId != null) return false;
        if (shippingName != null ? !shippingName.equals(that.shippingName) : that.shippingName != null) return false;
        if (shippingToCountry != null ? !shippingToCountry.equals(that.shippingToCountry) : that.shippingToCountry != null)
            return false;
        if (shippingToState != null ? !shippingToState.equals(that.shippingToState) : that.shippingToState != null)
            return false;
        if (shippingClass != null ? !shippingClass.equals(that.shippingClass) : that.shippingClass != null)
            return false;
        if (shippingPackageWeight != null ? !shippingPackageWeight.equals(that.shippingPackageWeight) : that.shippingPackageWeight != null)
            return false;
        if (shippingCostBasedOn != null ? !shippingCostBasedOn.equals(that.shippingCostBasedOn) : that.shippingCostBasedOn != null)
            return false;
        if (shippingCost != null ? !shippingCost.equals(that.shippingCost) : that.shippingCost != null) return false;
        if (shippingActiveFlag != null ? !shippingActiveFlag.equals(that.shippingActiveFlag) : that.shippingActiveFlag != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shippingId != null ? shippingId.hashCode() : 0;
        result = 31 * result + (shippingName != null ? shippingName.hashCode() : 0);
        result = 31 * result + (shippingToCountry != null ? shippingToCountry.hashCode() : 0);
        result = 31 * result + (shippingToState != null ? shippingToState.hashCode() : 0);
        result = 31 * result + (shippingClass != null ? shippingClass.hashCode() : 0);
        result = 31 * result + (shippingPackageWeight != null ? shippingPackageWeight.hashCode() : 0);
        result = 31 * result + (shippingCostBasedOn != null ? shippingCostBasedOn.hashCode() : 0);
        result = 31 * result + (shippingCost != null ? shippingCost.hashCode() : 0);
        result = 31 * result + (shippingActiveFlag != null ? shippingActiveFlag.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "shippingCalculationsByShippingId")
    public Collection<Table_Invoice> getInvoicesByShippingId() {
        return invoicesByShippingId;
    }

    public void setInvoicesByShippingId(Collection<Table_Invoice> invoicesByShippingId) {
        this.invoicesByShippingId = invoicesByShippingId;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
    public Table_DimCompany getDimCompanyByCompanyId() {
        return dimCompanyByCompanyId;
    }

    public void setDimCompanyByCompanyId(Table_DimCompany dimCompanyByCompanyId) {
        this.dimCompanyByCompanyId = dimCompanyByCompanyId;
    }
}
