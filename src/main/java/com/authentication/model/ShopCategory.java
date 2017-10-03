package com.authentication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class ShopCategory {
	@Id
	@GeneratedValue(generator="SHOP_CAT_ID",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize=1,name="SHOP_CAT_ID",sequenceName="shop_cat_id_sequence")
	private long cid;
	private String cname;
	private boolean isSubCategory;
	private long cidRefid;
	
	
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public boolean isSubCategory() {
		return isSubCategory;
	}
	public void setSubCategory(boolean isSubCategory) {
		this.isSubCategory = isSubCategory;
	}
	public long getCidRefid() {
		return cidRefid;
	}
	public void setCidRefid(long cidRefid) {
		this.cidRefid = cidRefid;
	}
	
	

}
