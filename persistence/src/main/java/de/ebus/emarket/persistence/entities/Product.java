package de.ebus.emarket.persistence.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@Entity
@CsvRecord(separator = "\\|", skipFirstLine=true)
public class Product extends AEntity {
	private static final long serialVersionUID = -4503595932183481371L;

	@ManyToOne(fetch = FetchType.LAZY)
	private Company company;
	@DataField(pos = 1, required=true)
	private String serialNumber;
	@DataField(pos = 2, required=true)
	private String name;
	@DataField(pos = 3, precision = 2, required=true)
	@Column(name = "amount", precision = 19, scale = 2)
	private BigDecimal price;
	
	public Product(String serialNumber, String name, BigDecimal price, Company company){
		setSerialNumber(serialNumber);
		setName(name);
		setPrice(price);
		setCompany(company);
	}
	
	public Product(){}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
