package com.tcs.evaluation.profileEvaluation.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Evaluator {
	@Id
    private int eval_id;
	private String eval_name;
	private Long mobileNo;
	private String mail;
	public int getEval_id() {
		return eval_id;
	}
	public void setEval_id(int eval_id) {
		this.eval_id = eval_id;
	}
	public String getEval_name() {
		return eval_name;
	}
	public void setEval_name(String eval_name) {
		this.eval_name = eval_name;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
}
