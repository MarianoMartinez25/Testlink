package jenkins.plugins.testlink.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testAgregarAlCarrito
{
	@Test
	public void testAgregarAlCarrito()
	{
		Assert.assertNotNull(System.currentTimeMillis());
		Assert.assertTrue(System.currentTimeMillis()>0);
	}
}