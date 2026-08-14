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
import java.lang.Object;
import java.lang.Integer;

public class RangeSumQuery2D_sumRegion_18167082381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4652;
     Object term4654;
     Object term4656;
     Object term4658;
     Object term4660;

    public RangeSumQuery2D_sumRegion_18167082381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4652 = newInstance(Class.forName("leetcode.medium.RangeSumQuery2D"));
        Object[] term4653 = (Object[]) newArray("[I", 0);
        setField(term4652, term4652.getClass(), "prefix", term4653);
        term4654 = new Integer(1677994069);
        term4656 = new Integer(-439999692);
        term4658 = new Integer(924095007);
        term4660 = new Integer(1302110708);
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
        args[0] = term4654;
        args[1] = term4656;
        args[2] = term4658;
        args[3] = term4660;
        callMethod(klass, "sumRegion", argTypes, term4652, args);
    }

};


