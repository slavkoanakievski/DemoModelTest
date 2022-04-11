package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Invoice_Product", schema = "dbo", catalog = "Invoice Management")
@IdClass(Table_InvoiceProductPK.class)
public class Table_InvoiceProduct {
    private String invoiceNumber;
    private Integer productOrder;
    private Integer productQuantity;
    private Integer invoiceProductActiveFlag;
    private Integer productUomId;
    private Table_Invoice invoiceByInvoiceNumber;
    private Table_ProductUom productUomByProductUomId;

    @Id
    @Column(name = "invoice_number", nullable = false, length = 50)
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Basic
    @Column(name = "product_order", nullable = false)
    public Integer getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(Integer productOrder) {
        this.productOrder = productOrder;
    }

    @Basic
    @Column(name = "product_quantity", nullable = false)
    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Basic
    @Column(name = "invoice_product_active_flag", nullable = false)
    public Integer getInvoiceProductActiveFlag() {
        return invoiceProductActiveFlag;
    }

    public void setInvoiceProductActiveFlag(Integer invoiceProductActiveFlag) {
        this.invoiceProductActiveFlag = invoiceProductActiveFlag;
    }

    @Id
    @Column(name = "product_uom_id", nullable = false)
    public Integer getProductUomId() {
        return productUomId;
    }

    public void setProductUomId(Integer productUomId) {
        this.productUomId = productUomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_InvoiceProduct that = (Table_InvoiceProduct) o;

        if (invoiceNumber != null ? !invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber != null)
            return false;
        if (productOrder != null ? !productOrder.equals(that.productOrder) : that.productOrder != null) return false;
        if (productQuantity != null ? !productQuantity.equals(that.productQuantity) : that.productQuantity != null)
            return false;
        if (invoiceProductActiveFlag != null ? !invoiceProductActiveFlag.equals(that.invoiceProductActiveFlag) : that.invoiceProductActiveFlag != null)
            return false;
        if (productUomId != null ? !productUomId.equals(that.productUomId) : that.productUomId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invoiceNumber != null ? invoiceNumber.hashCode() : 0;
        result = 31 * result + (productOrder != null ? productOrder.hashCode() : 0);
        result = 31 * result + (productQuantity != null ? productQuantity.hashCode() : 0);
        result = 31 * result + (invoiceProductActiveFlag != null ? invoiceProductActiveFlag.hashCode() : 0);
        result = 31 * result + (productUomId != null ? productUomId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "invoice_number", referencedColumnName = "invoice_number", nullable = false)
    public Table_Invoice getInvoiceByInvoiceNumber() {
        return invoiceByInvoiceNumber;
    }

    public void setInvoiceByInvoiceNumber(Table_Invoice invoiceByInvoiceNumber) {
        this.invoiceByInvoiceNumber = invoiceByInvoiceNumber;
    }

    @ManyToOne
    @JoinColumn(name = "product_uom_id", referencedColumnName = "product_uom_id", nullable = false)
    public Table_ProductUom getProductUomByProductUomId() {
        return productUomByProductUomId;
    }

    public void setProductUomByProductUomId(Table_ProductUom productUomByProductUomId) {
        this.productUomByProductUomId = productUomByProductUomId;
    }
}
