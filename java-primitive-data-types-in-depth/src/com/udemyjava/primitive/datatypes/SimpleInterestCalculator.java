package com.udemyjava.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator
{

	private BigDecimal principal; // 인자는 String으로 받되,
	private BigDecimal interest; // 생성자에서 BigDecimal로 변환
	
	public SimpleInterestCalculator(String principal, String interest)
	{
		// 부동소수는 값이 정확하지 않으므로 string으로 받음
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears)
	{
		// 정수는 그대로 넣어도 정확히 변환됨
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		
		BigDecimal totalValue = principal.add(
				principal.multiply(interest
				.multiply(noOfYearsBigDecimal)));
		
		return totalValue;
	}

}
