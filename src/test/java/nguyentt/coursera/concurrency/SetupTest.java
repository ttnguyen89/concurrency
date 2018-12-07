package nguyentt.coursera.concurrency;

import junit.framework.TestCase;

public class SetupTest extends TestCase {

	public void testSetup() {
		final int result = Setup.setup(42);
		assertEquals(42, result);
	}
}
