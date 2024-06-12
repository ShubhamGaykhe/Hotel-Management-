package com.Project.HotelManagement.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentDTO 
{
	private int PayNo;
	private String PayMethod;
	private String PayDate;
	private long PayAmt;
}
