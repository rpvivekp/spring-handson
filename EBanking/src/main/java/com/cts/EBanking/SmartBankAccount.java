package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount  {
	
	SmartBankAccount(int customerId,String name, double balance, List<String> accounts){
		super(customerId, name, balance, accounts);
	}
	
   // type  your code here
	@Override
	   public double calculateFixedAccount(double amount,int months){
	       
	       if((amount > 9999 && amount < 1000001) && (months <121 && months > 0)){
	           double fixed = amount * Math.pow((1.0+(0.1/12.0)),12.0*(months/12.0));
	           return Double.parseDouble(new DecimalFormat("0.00").format(fixed));
	       }
	       return -1;
	   }
		
		@Override
		public double calculateRecurringAccount(double amount,int months){
		    if((amount > 999 && amount < 50001) && (months < 61 && months > 0)){
		        double recurr = (amount*months)+(amount*((months*(months+1.0))/(2.0*12.0))*0.07);
//		        double recurr = (amount*months)+(amount(months(months+1)/(2.0*12.0))*(7/100));
		        return Double.parseDouble(new DecimalFormat("0.00").format(recurr));
		    }
		    return -1;
		}
   
   
	

	
}
