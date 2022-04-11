package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Table_InvoiceProductPK implements Serializable {
    private String invoiceNumber;
    private Integer productUomId;

    @Column(name = "invoice_number", nullable = false, length = 50)
    @Id
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Column(name = "product_uom_id", nullable = false)
    @Id
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

        Table_InvoiceProductPK that = (Table_InvoiceProductPK) o;

        if (invoiceNumber != null ? !invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber != null)
            return false;
        if (productUomId != null ? !productUomId.equals(that.productUomId) : that.productUomId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invoiceNumber != null ? invoiceNumber.hashCode() : 0;
        result = 31 * result + (productUomId != null ? productUomId.hashCode() : 0);
        return result;
    }
}
