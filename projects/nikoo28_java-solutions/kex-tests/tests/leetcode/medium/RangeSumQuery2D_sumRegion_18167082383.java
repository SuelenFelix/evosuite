package leetcode.medium;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RangeSumQuery2D_sumRegion_18167082383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4662;
     Object term4663;
     Object term4665;
     Object term4667;
     Object term4669;

    public RangeSumQuery2D_sumRegion_18167082383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4662 = newInstance(Class.forName("leetcode.medium.RangeSumQuery2D"));
        setField(term4662, term4662.getClass(), "prefix", null);
        term4663 = new Integer(0);
        term4665 = new Integer(0);
        term4667 = new Integer(0);
        term4669 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.RangeSumQuery2D");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4663;
        args[1] = term4665;
        args[2] = term4667;
        args[3] = term4669;
        callMethod(klass, "sumRegion", argTypes, term4662, args);
    }

};


