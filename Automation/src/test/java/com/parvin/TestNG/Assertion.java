package com.parvin.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void testMethod(){
        int actual = 5;
        int expected = 5;
        Object obj1 = null;
        Object obj2 = new Object();
        Object obj3 = obj2;

       // Assert.assertEquals(actual,expected,"Actual and expected result are not equal");
       // Assert.assertNotEquals(actual,expected,"Actual and expected result are same");
      // Assert.assertTrue(actual== 5,"Actual result is 5");
      // Assert.assertFalse(expected== 6,"Expected result is ");
      // Assert.assertNull(obj1, "Object is not null");
      // Assert.assertNotNull(obj2, "Object is null");
       // Assert.assertSame(obj2, obj3, "Objects do not point to the same reference");
        Assert.assertNotSame(obj1, obj2, "Objects point to the same reference");

    }
}
