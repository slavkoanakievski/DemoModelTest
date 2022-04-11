package com.example.demo.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Invoice", schema = "dbo", catalog = "Invoice Management")
public class Table_Invoice {
    private String invoiceNumber;
    private Integer companyId;
    private Integer clientId;
    private String currencyCode;
    private String invoiceStatus1;
    private String invoiceStatus2;
    private String invoiceStatus3;
    private Date invoiceIssueDate;
    private Date invoiceDueDate;
    private Date invoicePeriodFromDate;
    private Date invoicePeriodToDate;
    private Integer invoiceTotalPrice;
    private Integer invoiceTotalDiscountPrice;
    private String invoiceShippingStreet;
    private String invoiceShippingCity;
    private String invoiceShippingCountry;
    private Integer invoiceShippingPostalCode;
    private String invoicePaymentMethod;
    private String invoiceComment;
    private Integer invoiceActiveFlag;
    private Integer shippingId;
    private Table_DimCompany dimCompanyByCompanyId;
    private Table_DimClient dimClientByClientId;
    private Table_ExchangeRate exchangeRateByCurrencyCode;
    private Table_ShippingCalculations shippingCalculationsByShippingId;
    private Collection<Table_InvoiceProduct> invoiceProductsByInvoiceNumber;

    @Id
    @Column(name = "invoice_number", nullable = false, length = 50)
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
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
    @Column(name = "client_id", nullable = false)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "currency_code", nullable = false, length = 5)
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "invoice_status1", nullable = false, length = 30)
    public String getInvoiceStatus1() {
        return invoiceStatus1;
    }

    public void setInvoiceStatus1(String invoiceStatus1) {
        this.invoiceStatus1 = invoiceStatus1;
    }

    @Basic
    @Column(name = "invoice_status2", nullable = true, length = 30)
    public String getInvoiceStatus2() {
        return invoiceStatus2;
    }

    public void setInvoiceStatus2(String invoiceStatus2) {
        this.invoiceStatus2 = invoiceStatus2;
    }

    @Basic
    @Column(name = "invoice_status3", nullable = true, length = 30)
    public String getInvoiceStatus3() {
        return invoiceStatus3;
    }

    public void setInvoiceStatus3(String invoiceStatus3) {
        this.invoiceStatus3 = invoiceStatus3;
    }

    @Basic
    @Column(name = "invoice_issue_date", nullable = false)
    public Date getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    public void setInvoiceIssueDate(Date invoiceIssueDate) {
        this.invoiceIssueDate = invoiceIssueDate;
    }

    @Basic
    @Column(name = "invoice_due_date", nullable = false)
    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    @Basic
    @Column(name = "invoice_period_from_date", nullable = true)
    public Date getInvoicePeriodFromDate() {
        return invoicePeriodFromDate;
    }

    public void setInvoicePeriodFromDate(Date invoicePeriodFromDate) {
        this.invoicePeriodFromDate = invoicePeriodFromDate;
    }

    @Basic
    @Column(name = "invoice_period_to_date", nullable = true)
    public Date getInvoicePeriodToDate() {
        return invoicePeriodToDate;
    }

    public void setInvoicePeriodToDate(Date invoicePeriodToDate) {
        this.invoicePeriodToDate = invoicePeriodToDate;
    }

    @Basic
    @Column(name = "invoice_total_price", nullable = false)
    public Integer getInvoiceTotalPrice() {
        return invoiceTotalPrice;
    }

    public void setInvoiceTotalPrice(Integer invoiceTotalPrice) {
        this.invoiceTotalPrice = invoiceTotalPrice;
    }

    @Basic
    @Column(name = "invoice_total_discount_price", nullable = false)
    public Integer getInvoiceTotalDiscountPrice() {
        return invoiceTotalDiscountPrice;
    }

    public void setInvoiceTotalDiscountPrice(Integer invoiceTotalDiscountPrice) {
        this.invoiceTotalDiscountPrice = invoiceTotalDiscountPrice;
    }

    @Basic
    @Column(name = "invoice_shipping_street", nullable = true, length = 50)
    public String getInvoiceShippingStreet() {
        return invoiceShippingStreet;
    }

    public void setInvoiceShippingStreet(String invoiceShippingStreet) {
        this.invoiceShippingStreet = invoiceShippingStreet;
    }

    @Basic
    @Column(name = "invoice_shipping_city", nullable = true, length = 50)
    public String getInvoiceShippingCity() {
        return invoiceShippingCity;
    }

    public void setInvoiceShippingCity(String invoiceShippingCity) {
        this.invoiceShippingCity = invoiceShippingCity;
    }

    @Basic
    @Column(name = "invoice_shipping_country", nullable = true, length = 50)
    public String getInvoiceShippingCountry() {
        return invoiceShippingCountry;
    }

    public void setInvoiceShippingCountry(String invoiceShippingCountry) {
        this.invoiceShippingCountry = invoiceShippingCountry;
    }

    @Basic
    @Column(name = "invoice_shipping_postal_code", nullable = true)
    public Integer getInvoiceShippingPostalCode() {
        return invoiceShippingPostalCode;
    }

    public void setInvoiceShippingPostalCode(Integer invoiceShippingPostalCode) {
        this.invoiceShippingPostalCode = invoiceShippingPostalCode;
    }

    @Basic
    @Column(name = "invoice_payment_method", nullable = false, length = 50)
    public String getInvoicePaymentMethod() {
        return invoicePaymentMethod;
    }

    public void setInvoicePaymentMethod(String invoicePaymentMethod) {
        this.invoicePaymentMethod = invoicePaymentMethod;
    }

    @Basic
    @Column(name = "invoice_comment", nullable = true, length = 200)
    public String getInvoiceComment() {
        return invoiceComment;
    }

    public void setInvoiceComment(String invoiceComment) {
        this.invoiceComment = invoiceComment;
    }

    @Basic
    @Column(name = "invoice_active_flag", nullable = true)
    public Integer getInvoiceActiveFlag() {
        return invoiceActiveFlag;
    }

    public void setInvoiceActiveFlag(Integer invoiceActiveFlag) {
        this.invoiceActiveFlag = invoiceActiveFlag;
    }

    @Basic
    @Column(name = "shipping_id", nullable = true)
    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_Invoice that = (Table_Invoice) o;

        if (invoiceNumber != null ? !invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        if (invoiceStatus1 != null ? !invoiceStatus1.equals(that.invoiceStatus1) : that.invoiceStatus1 != null)
            return false;
        if (invoiceStatus2 != null ? !invoiceStatus2.equals(that.invoiceStatus2) : that.invoiceStatus2 != null)
            return false;
        if (invoiceStatus3 != null ? !invoiceStatus3.equals(that.invoiceStatus3) : that.invoiceStatus3 != null)
            return false;
        if (invoiceIssueDate != null ? !invoiceIssueDate.equals(that.invoiceIssueDate) : that.invoiceIssueDate != null)
            return false;
        if (invoiceDueDate != null ? !invoiceDueDate.equals(that.invoiceDueDate) : that.invoiceDueDate != null)
            return false;
        if (invoicePeriodFromDate != null ? !invoicePeriodFromDate.equals(that.invoicePeriodFromDate) : that.invoicePeriodFromDate != null)
            return false;
        if (invoicePeriodToDate != null ? !invoicePeriodToDate.equals(that.invoicePeriodToDate) : that.invoicePeriodToDate != null)
            return false;
        if (invoiceTotalPrice != null ? !invoiceTotalPrice.equals(that.invoiceTotalPrice) : that.invoiceTotalPrice != null)
            return false;
        if (invoiceTotalDiscountPrice != null ? !invoiceTotalDiscountPrice.equals(that.invoiceTotalDiscountPrice) : that.invoiceTotalDiscountPrice != null)
            return false;
        if (invoiceShippingStreet != null ? !invoiceShippingStreet.equals(that.invoiceShippingStreet) : that.invoiceShippingStreet != null)
            return false;
        if (invoiceShippingCity != null ? !invoiceShippingCity.equals(that.invoiceShippingCity) : that.invoiceShippingCity != null)
            return false;
        if (invoiceShippingCountry != null ? !invoiceShippingCountry.equals(that.invoiceShippingCountry) : that.invoiceShippingCountry != null)
            return false;
        if (invoiceShippingPostalCode != null ? !invoiceShippingPostalCode.equals(that.invoiceShippingPostalCode) : that.invoiceShippingPostalCode != null)
            return false;
        if (invoicePaymentMethod != null ? !invoicePaymentMethod.equals(that.invoicePaymentMethod) : that.invoicePaymentMethod != null)
            return false;
        if (invoiceComment != null ? !invoiceComment.equals(that.invoiceComment) : that.invoiceComment != null)
            return false;
        if (invoiceActiveFlag != null ? !invoiceActiveFlag.equals(that.invoiceActiveFlag) : that.invoiceActiveFlag != null)
            return false;
        if (shippingId != null ? !shippingId.equals(that.shippingId) : that.shippingId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invoiceNumber != null ? invoiceNumber.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (invoiceStatus1 != null ? invoiceStatus1.hashCode() : 0);
        result = 31 * result + (invoiceStatus2 != null ? invoiceStatus2.hashCode() : 0);
        result = 31 * result + (invoiceStatus3 != null ? invoiceStatus3.hashCode() : 0);
        result = 31 * result + (invoiceIssueDate != null ? invoiceIssueDate.hashCode() : 0);
        result = 31 * result + (invoiceDueDate != null ? invoiceDueDate.hashCode() : 0);
        result = 31 * result + (invoicePeriodFromDate != null ? invoicePeriodFromDate.hashCode() : 0);
        result = 31 * result + (invoicePeriodToDate != null ? invoicePeriodToDate.hashCode() : 0);
        result = 31 * result + (invoiceTotalPrice != null ? invoiceTotalPrice.hashCode() : 0);
        result = 31 * result + (invoiceTotalDiscountPrice != null ? invoiceTotalDiscountPrice.hashCode() : 0);
        result = 31 * result + (invoiceShippingStreet != null ? invoiceShippingStreet.hashCode() : 0);
        result = 31 * result + (invoiceShippingCity != null ? invoiceShippingCity.hashCode() : 0);
        result = 31 * result + (invoiceShippingCountry != null ? invoiceShippingCountry.hashCode() : 0);
        result = 31 * result + (invoiceShippingPostalCode != null ? invoiceShippingPostalCode.hashCode() : 0);
        result = 31 * result + (invoicePaymentMethod != null ? invoicePaymentMethod.hashCode() : 0);
        result = 31 * result + (invoiceComment != null ? invoiceComment.hashCode() : 0);
        result = 31 * result + (invoiceActiveFlag != null ? invoiceActiveFlag.hashCode() : 0);
        result = 31 * result + (shippingId != null ? shippingId.hashCode() : 0);
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
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    public Table_DimClient getDimClientByClientId() {
        return dimClientByClientId;
    }

    public void setDimClientByClientId(Table_DimClient dimClientByClientId) {
        this.dimClientByClientId = dimClientByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "currency_code", referencedColumnName = "currency_code", nullable = false)
    public Table_ExchangeRate getExchangeRateByCurrencyCode() {
        return exchangeRateByCurrencyCode;
    }

    public void setExchangeRateByCurrencyCode(Table_ExchangeRate exchangeRateByCurrencyCode) {
        this.exchangeRateByCurrencyCode = exchangeRateByCurrencyCode;
    }

    @ManyToOne
    @JoinColumn(name = "shipping_id", referencedColumnName = "shipping_id")
    public Table_ShippingCalculations getShippingCalculationsByShippingId() {
        return shippingCalculationsByShippingId;
    }

    public void setShippingCalculationsByShippingId(Table_ShippingCalculations shippingCalculationsByShippingId) {
        this.shippingCalculationsByShippingId = shippingCalculationsByShippingId;
    }

    @OneToMany(mappedBy = "invoiceByInvoiceNumber")
    public Collection<Table_InvoiceProduct> getInvoiceProductsByInvoiceNumber() {
        return invoiceProductsByInvoiceNumber;
    }

    public void setInvoiceProductsByInvoiceNumber(Collection<Table_InvoiceProduct> invoiceProductsByInvoiceNumber) {
        this.invoiceProductsByInvoiceNumber = invoiceProductsByInvoiceNumber;
    }
}
