package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Product_UOM", schema = "dbo", catalog = "Invoice Management")
public class Table_ProductUom {
    private Integer productId;
    private Integer unitBoxPiece;
    private String productUomName;
    private Integer unitId;
    private String productUomMeasure;
    private String productUomSize;
    private Integer prouctQuantityPerUnit;
    private Integer productUomUnitPrice;
    private Integer productUomUnitDiscount;
    private String productUomDescription;
    private String productUomStatus;
    private Integer productUomActiveFlag;
    private Integer companyId;
    private Integer productUomId;
    private Integer productUomIdUnitInBox;
    private Collection<Table_InvoiceProduct> invoiceProductsByProductUomId;
    private Table_Product productByProductId;
    private Table_DimUnit dimUnitByUnitBoxPiece;
    private Table_DimUnit dimUnitByUnitId;
    private Table_DimCompany dimCompanyByCompanyId;
    private Table_ProductUom productUomByProductUomIdUnitInBox;
    private Collection<Table_ProductUom> productUomsByProductUomId;

    @Basic
    @Column(name = "product_id", nullable = false)
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "unit_box_piece", nullable = false)
    public Integer getUnitBoxPiece() {
        return unitBoxPiece;
    }

    public void setUnitBoxPiece(Integer unitBoxPiece) {
        this.unitBoxPiece = unitBoxPiece;
    }

    @Basic
    @Column(name = "product_uom_name", nullable = true, length = 200)
    public String getProductUomName() {
        return productUomName;
    }

    public void setProductUomName(String productUomName) {
        this.productUomName = productUomName;
    }

    @Basic
    @Column(name = "unit_id", nullable = true)
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "product_uom_measure", nullable = true, length = 100)
    public String getProductUomMeasure() {
        return productUomMeasure;
    }

    public void setProductUomMeasure(String productUomMeasure) {
        this.productUomMeasure = productUomMeasure;
    }

    @Basic
    @Column(name = "product_uom_size", nullable = true, length = 100)
    public String getProductUomSize() {
        return productUomSize;
    }

    public void setProductUomSize(String productUomSize) {
        this.productUomSize = productUomSize;
    }

    @Basic
    @Column(name = "prouct_quantity_per_unit", nullable = true)
    public Integer getProuctQuantityPerUnit() {
        return prouctQuantityPerUnit;
    }

    public void setProuctQuantityPerUnit(Integer prouctQuantityPerUnit) {
        this.prouctQuantityPerUnit = prouctQuantityPerUnit;
    }

    @Basic
    @Column(name = "product_uom_unit_price", nullable = true)
    public Integer getProductUomUnitPrice() {
        return productUomUnitPrice;
    }

    public void setProductUomUnitPrice(Integer productUomUnitPrice) {
        this.productUomUnitPrice = productUomUnitPrice;
    }

    @Basic
    @Column(name = "product_uom_unit_discount", nullable = true)
    public Integer getProductUomUnitDiscount() {
        return productUomUnitDiscount;
    }

    public void setProductUomUnitDiscount(Integer productUomUnitDiscount) {
        this.productUomUnitDiscount = productUomUnitDiscount;
    }

    @Basic
    @Column(name = "product_uom_description", nullable = true, length = 300)
    public String getProductUomDescription() {
        return productUomDescription;
    }

    public void setProductUomDescription(String productUomDescription) {
        this.productUomDescription = productUomDescription;
    }

    @Basic
    @Column(name = "product_uom_status", nullable = true, length = 100)
    public String getProductUomStatus() {
        return productUomStatus;
    }

    public void setProductUomStatus(String productUomStatus) {
        this.productUomStatus = productUomStatus;
    }

    @Basic
    @Column(name = "product_uom_active_flag", nullable = true)
    public Integer getProductUomActiveFlag() {
        return productUomActiveFlag;
    }

    public void setProductUomActiveFlag(Integer productUomActiveFlag) {
        this.productUomActiveFlag = productUomActiveFlag;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Id
    @Column(name = "product_uom_id", nullable = false)
    public Integer getProductUomId() {
        return productUomId;
    }

    public void setProductUomId(Integer productUomId) {
        this.productUomId = productUomId;
    }

    @Basic
    @Column(name = "product_uom_id_unit_in_box", nullable = true)
    public Integer getProductUomIdUnitInBox() {
        return productUomIdUnitInBox;
    }

    public void setProductUomIdUnitInBox(Integer productUomIdUnitInBox) {
        this.productUomIdUnitInBox = productUomIdUnitInBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_ProductUom that = (Table_ProductUom) o;

        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (unitBoxPiece != null ? !unitBoxPiece.equals(that.unitBoxPiece) : that.unitBoxPiece != null) return false;
        if (productUomName != null ? !productUomName.equals(that.productUomName) : that.productUomName != null)
            return false;
        if (unitId != null ? !unitId.equals(that.unitId) : that.unitId != null) return false;
        if (productUomMeasure != null ? !productUomMeasure.equals(that.productUomMeasure) : that.productUomMeasure != null)
            return false;
        if (productUomSize != null ? !productUomSize.equals(that.productUomSize) : that.productUomSize != null)
            return false;
        if (prouctQuantityPerUnit != null ? !prouctQuantityPerUnit.equals(that.prouctQuantityPerUnit) : that.prouctQuantityPerUnit != null)
            return false;
        if (productUomUnitPrice != null ? !productUomUnitPrice.equals(that.productUomUnitPrice) : that.productUomUnitPrice != null)
            return false;
        if (productUomUnitDiscount != null ? !productUomUnitDiscount.equals(that.productUomUnitDiscount) : that.productUomUnitDiscount != null)
            return false;
        if (productUomDescription != null ? !productUomDescription.equals(that.productUomDescription) : that.productUomDescription != null)
            return false;
        if (productUomStatus != null ? !productUomStatus.equals(that.productUomStatus) : that.productUomStatus != null)
            return false;
        if (productUomActiveFlag != null ? !productUomActiveFlag.equals(that.productUomActiveFlag) : that.productUomActiveFlag != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (productUomId != null ? !productUomId.equals(that.productUomId) : that.productUomId != null) return false;
        if (productUomIdUnitInBox != null ? !productUomIdUnitInBox.equals(that.productUomIdUnitInBox) : that.productUomIdUnitInBox != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (unitBoxPiece != null ? unitBoxPiece.hashCode() : 0);
        result = 31 * result + (productUomName != null ? productUomName.hashCode() : 0);
        result = 31 * result + (unitId != null ? unitId.hashCode() : 0);
        result = 31 * result + (productUomMeasure != null ? productUomMeasure.hashCode() : 0);
        result = 31 * result + (productUomSize != null ? productUomSize.hashCode() : 0);
        result = 31 * result + (prouctQuantityPerUnit != null ? prouctQuantityPerUnit.hashCode() : 0);
        result = 31 * result + (productUomUnitPrice != null ? productUomUnitPrice.hashCode() : 0);
        result = 31 * result + (productUomUnitDiscount != null ? productUomUnitDiscount.hashCode() : 0);
        result = 31 * result + (productUomDescription != null ? productUomDescription.hashCode() : 0);
        result = 31 * result + (productUomStatus != null ? productUomStatus.hashCode() : 0);
        result = 31 * result + (productUomActiveFlag != null ? productUomActiveFlag.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (productUomId != null ? productUomId.hashCode() : 0);
        result = 31 * result + (productUomIdUnitInBox != null ? productUomIdUnitInBox.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "productUomByProductUomId")
    public Collection<Table_InvoiceProduct> getInvoiceProductsByProductUomId() {
        return invoiceProductsByProductUomId;
    }

    public void setInvoiceProductsByProductUomId(Collection<Table_InvoiceProduct> invoiceProductsByProductUomId) {
        this.invoiceProductsByProductUomId = invoiceProductsByProductUomId;
    }

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", nullable = false)
    public Table_Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Table_Product productByProductId) {
        this.productByProductId = productByProductId;
    }

    @ManyToOne
    @JoinColumn(name = "unit_box_piece", referencedColumnName = "unit_id", nullable = false)
    public Table_DimUnit getDimUnitByUnitBoxPiece() {
        return dimUnitByUnitBoxPiece;
    }

    public void setDimUnitByUnitBoxPiece(Table_DimUnit dimUnitByUnitBoxPiece) {
        this.dimUnitByUnitBoxPiece = dimUnitByUnitBoxPiece;
    }

    @ManyToOne
    @JoinColumn(name = "unit_id", referencedColumnName = "unit_id")
    public Table_DimUnit getDimUnitByUnitId() {
        return dimUnitByUnitId;
    }

    public void setDimUnitByUnitId(Table_DimUnit dimUnitByUnitId) {
        this.dimUnitByUnitId = dimUnitByUnitId;
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
    @JoinColumn(name = "product_uom_id_unit_in_box", referencedColumnName = "product_uom_id")
    public Table_ProductUom getProductUomByProductUomIdUnitInBox() {
        return productUomByProductUomIdUnitInBox;
    }

    public void setProductUomByProductUomIdUnitInBox(Table_ProductUom productUomByProductUomIdUnitInBox) {
        this.productUomByProductUomIdUnitInBox = productUomByProductUomIdUnitInBox;
    }

    @OneToMany(mappedBy = "productUomByProductUomIdUnitInBox")
    public Collection<Table_ProductUom> getProductUomsByProductUomId() {
        return productUomsByProductUomId;
    }

    public void setProductUomsByProductUomId(Collection<Table_ProductUom> productUomsByProductUomId) {
        this.productUomsByProductUomId = productUomsByProductUomId;
    }
}
