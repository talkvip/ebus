package de.ebus.emarket.camel.entities;

import javax.persistence.Entity;
import javax.persistence.Transient;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity
@CsvRecord(separator = ";")
public class StockItem extends AEntity {

	private static final long serialVersionUID = 8724417543214530634L;
	@DataField(pos = 1, required = true)
	@Transient
	private String stockName;
	private long stock_id;
	@DataField(pos = 2, required = true)
	private String productSerialNumber;
	@DataField(pos = 3, required = true)
	private int count;

	public StockItem() {
	}

	public StockItem(long stock_id, String productSerialNumber) {
		setStock_id(stock_id);
		setProductSerialNumber(productSerialNumber);
	}

	public String getStockName() {
		return stockName;
	}

	public long getStock_id() {
		return stock_id;
	}

	public void setStock_id(long stock_id) {
		this.stock_id = stock_id;
	}

	public String getProductSerialNumber() {
		return productSerialNumber;
	}

	public void setProductSerialNumber(String productSerialNumber) {
		this.productSerialNumber = productSerialNumber;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "stock id: " + stock_id + " stockname " + getStockName() + " SerialNumber:" + productSerialNumber + "amount: " + count;
	}
}
