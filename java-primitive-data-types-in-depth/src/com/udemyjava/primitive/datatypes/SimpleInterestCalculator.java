package com.udemyjava.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator
{

	private BigDecimal principal; // ���ڴ� String���� �޵�,
	private BigDecimal interest; // �����ڿ��� BigDecimal�� ��ȯ
	
	public SimpleInterestCalculator(String principal, String interest)
	{
		// �ε��Ҽ��� ���� ��Ȯ���� �����Ƿ� string���� ����
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears)
	{
		// ������ �״�� �־ ��Ȯ�� ��ȯ��
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		
		BigDecimal totalValue = principal.add(
				principal.multiply(interest
				.multiply(noOfYearsBigDecimal)));
		
		return totalValue;
	}

}
