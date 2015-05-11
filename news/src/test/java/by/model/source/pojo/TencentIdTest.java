package by.model.source.pojo;

import org.junit.Test;

import by.model.BaseModelI;

public class TencentIdTest {
	@Test
	public void testBooleanShow() {
		boolean isTrue = true;
		assert (isTrue == true);
		// assert(isTrue!=1);
		// 这里如果为true会显示为true，而不是1，
		// 所以应该在exist和hidepic等标志位上使用int，而不是boolean

		TencentIdModel tencentId = new TencentIdModel();
		tencentId.setId("testid");
		
	}
}
