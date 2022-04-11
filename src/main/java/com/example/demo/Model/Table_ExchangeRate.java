package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Exchange_rate", schema = "dbo", catalog = "Invoice Management")
public class Table_ExchangeRate {
    private String currencyCode;
    private String curencyName;
    private Double buyRate;
    private Double middleRate;
    private Double sellRate;
    private Collection<Table_Invoice> invoicesByCurrencyCode;

    @Id
    @Column(name = "currency_code", nullable = false, length = 5)
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "curency_name", nullable = false, length = 100)
    public String getCurencyName() {
        return curencyName;
    }

    public void setCurencyName(String curencyName) {
        this.curencyName = curencyName;
    }

    @Basic
    @Column(name = "buy_rate", nullable = false, precision = 0)
    public Double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(Double buyRate) {
        this.buyRate = buyRate;
    }

    @Basic
    @Column(name = "middle_rate", nullable = false, precision = 0)
    public Double getMiddleRate() {
        return middleRate;
    }

    public void setMiddleRate(Double middleRate) {
        this.middleRate = middleRate;
    }

    @Basic
    @Column(name = "sell_rate", nullable = false, precision = 0)
    public Double getSellRate() {
        return sellRate;
    }

    public void setSellRate(Double sellRate) {
        this.sellRate = sellRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_ExchangeRate that = (Table_ExchangeRate) o;

        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        if (curencyName != null ? !curencyName.equals(that.curencyName) : that.curencyName != null) return false;
        if (buyRate != null ? !buyRate.equals(that.buyRate) : that.buyRate != null) return false;
        if (middleRate != null ? !middleRate.equals(that.middleRate) : that.middleRate != null) return false;
        if (sellRate != null ? !sellRate.equals(that.sellRate) : that.sellRate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = currencyCode != null ? currencyCode.hashCode() : 0;
        result = 31 * result + (curencyName != null ? curencyName.hashCode() : 0);
        result = 31 * result + (buyRate != null ? buyRate.hashCode() : 0);
        result = 31 * result + (middleRate != null ? middleRate.hashCode() : 0);
        result = 31 * result + (sellRate != null ? sellRate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "exchangeRateByCurrencyCode")
    public Collection<Table_Invoice> getInvoicesByCurrencyCode() {
        return invoicesByCurrencyCode;
    }

    public void setInvoicesByCurrencyCode(Collection<Table_Invoice> invoicesByCurrencyCode) {
        this.invoicesByCurrencyCode = invoicesByCurrencyCode;
    }
}
