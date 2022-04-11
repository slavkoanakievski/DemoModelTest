package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class Table_ProductUomHistoryPK implements Serializable {
    private Integer productUomId;
    private Date productUomDateModified;

    @Column(name = "product_uom_id", nullable = false)
    @Id
    public Integer getProductUomId() {
        return productUomId;
    }

    public void setProductUomId(Integer productUomId) {
        this.productUomId = productUomId;
    }

    @Column(name = "product_uom_date_modified", nullable = false)
    @Id
    public Date getProductUomDateModified() {
        return productUomDateModified;
    }

    public void setProductUomDateModified(Date productUomDateModified) {
        this.productUomDateModified = productUomDateModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_ProductUomHistoryPK that = (Table_ProductUomHistoryPK) o;

        if (productUomId != null ? !productUomId.equals(that.productUomId) : that.productUomId != null) return false;
        if (productUomDateModified != null ? !productUomDateModified.equals(that.productUomDateModified) : that.productUomDateModified != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productUomId != null ? productUomId.hashCode() : 0;
        result = 31 * result + (productUomDateModified != null ? productUomDateModified.hashCode() : 0);
        return result;
    }
}
