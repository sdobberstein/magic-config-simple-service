package org.bluemagic.config.service.utils;

import junit.framework.Assert;

import org.junit.Test;

public class TagUtilsTest {
	
	@Test
	public void testReorderSingleTags() {
		String rval = TagUtils.reorder("tags=ui,development,rest");
		
		Assert.assertEquals("tags=development,rest,ui", rval);
	}
	
	@Test
	public void testReorderComplexTags() {
		String rval = TagUtils.reorder("test=boom&system=development&geo:lat=50.3&tags=test,rest,ui");
		
		Assert.assertEquals("geo:lat=50.3&system=development&tags=rest,test,ui&test=boom", rval);
	}
}
