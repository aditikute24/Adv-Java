package entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity

public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long ac_no;
	private String accountHolderName;
	@ManyToOne 
	@JoinColumn(name="b_id")
	
	private Bank bank;
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Account()
	{
		
	}

	public long getAc_no() {
		return ac_no;
	}

	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Account(long ac_no, String accountHolderName) {
		super();
		this.ac_no = ac_no;
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", ac_no=" + ac_no + ", accountHolderName=" + accountHolderName + "]";
	}
	
	
	

}
