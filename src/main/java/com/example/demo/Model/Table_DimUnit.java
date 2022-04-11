package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Dim_Unit", schema = "dbo", catalog = "Invoice Management")
public class Table_DimUnit {
    private Integer unitId;
    private String unitName;
    private String unitDescription;
    private Integer unitActiveFlag;
    private Integer companyId;
    private Table_DimCompany dimCompanyByCompanyId;
    private Collection<Table_ProductUom> productUomsByUnitId;
    private Collection<Table_ProductUom> productUomsByUnitId_0;

    @Id
    @Column(name = "unit_id", nullable = false)
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "unit_name", nullable = false, length = 100)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "unit_description", nullable = true, length = 300)
    public String getUnitDescription() {
        return unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    @Basic
    @Column(name = "unit_active_flag", nullable = false)
    public Integer getUnitActiveFlag() {
        return unitActiveFlag;
    }

    public void setUnitActiveFlag(Integer unitActiveFlag) {
        this.unitActiveFlag = unitActiveFlag;
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

        Table_DimUnit that = (Table_DimUnit) o;

        if (unitId != null ? !unitId.equals(that.unitId) : that.unitId != null) return false;
        if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;
        if (unitDescription != null ? !unitDescription.equals(that.unitDescription) : that.unitDescription != null)
            return false;
        if (unitActiveFlag != null ? !unitActiveFlag.equals(that.unitActiveFlag) : that.unitActiveFlag != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitId != null ? unitId.hashCode() : 0;
        result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
        result = 31 * result + (unitDescription != null ? unitDescription.hashCode() : 0);
        result = 31 * result + (unitActiveFlag != null ? unitActiveFlag.hashCode() : 0);
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

    @OneToMany(mappedBy = "dimUnitByUnitBoxPiece")
    public Collection<Table_ProductUom> getProductUomsByUnitId() {
        return productUomsByUnitId;
    }

    public void setProductUomsByUnitId(Collection<Table_ProductUom> productUomsByUnitId) {
        this.productUomsByUnitId = productUomsByUnitId;
    }

    @OneToMany(mappedBy = "dimUnitByUnitId")
    public Collection<Table_ProductUom> getProductUomsByUnitId_0() {
        return productUomsByUnitId_0;
    }

    public void setProductUomsByUnitId_0(Collection<Table_ProductUom> productUomsByUnitId_0) {
        this.productUomsByUnitId_0 = productUomsByUnitId_0;
    }
}
