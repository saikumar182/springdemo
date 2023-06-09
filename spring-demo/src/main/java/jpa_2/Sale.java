package jpa_2;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class Sale {
	
	@Id
	@Column(name="invno")
	private int invoiceNumber;
	
	@Column(name="prodid")
	private int productId;
	
	@Column(name="transdate")
	private Date TransactionDate;
	
	@Column(name="qty")
	private int quantity;
	
	@Column(name="amount")
	private double amount;

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sale [invoiceNumber=" + invoiceNumber + ", productId=" + productId + ", TransactionDate="
				+ TransactionDate + ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
	
}
