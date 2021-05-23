package main;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest {
	@Test
	public void testAgeHasDiscount() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        String dateTime = sdf.format(new Date());

        Identity identity = new Identity(10, false, false);
		Discount discount = new Discount(identity, dateTime);
        Payment payment = new Payment(discount, dateTime);

        float expected = (float) (200 * 0.8);
		float result = payment.getTotalCharge();
		assertEquals(expected, result);
	}
	
	@Test	
	public void testAgeHasNoDiscount() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        String dateTime = sdf.format(new Date());

        Identity identity = new Identity(40, false, false);
        Discount discount = new Discount(identity, dateTime);
        Payment payment = new Payment(discount, dateTime);
		
		float expected = (float) (250 * 0.8);
		float result = payment.getTotalCharge();
		assertEquals(expected, result);
	}
	
	@Test
	public void testAgeLessThan() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        String dateTime = sdf.format(new Date());

        Identity identity = new Identity(2, false, true);
        Discount discount = new Discount(identity, dateTime);
        Payment payment = new Payment(discount, dateTime);
		
		float expected = (float) (0);
		float result = payment.getTotalCharge();
		assertEquals(expected, result);
	}
	
	@Test
	public void testAgeMoreThan() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        String dateTime = sdf.format(new Date());

        Identity identity = new Identity(80, true, false);
        Discount discount = new Discount(identity, dateTime);
        Payment payment = new Payment(discount, dateTime);
		
		float expected = (float) (0);
		float result = payment.getTotalCharge();
		assertEquals(expected, result);
	}
}
