package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MaximumSumTwoNonOverlappingSubarrays_maxSumTwoNoOverlap_2768379151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4707;
     Object term4708;
     Object term4715;
     Object term4717;

    public MaximumSumTwoNonOverlappingSubarrays_maxSumTwoNoOverlap_2768379151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4707 = newInstance(Class.forName("leetcode.MaximumSumTwoNonOverlappingSubarrays"));
        term4708 = (int[]) newIntArray(6);
        setIntElement(term4708, 0, -932147928);
        setIntElement(term4708, 1, 487369012);
        setIntElement(term4708, 2, -179238712);
        setIntElement(term4708, 3, -2018735535);
        setIntElement(term4708, 4, -658524954);
        setIntElement(term4708, 5, -2009613557);
        term4715 = new Integer(654195547);
        term4717 = new Integer(1622857008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MaximumSumTwoNonOverlappingSubarrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4708;
        args[1] = term4715;
        args[2] = term4717;
        callMethod(klass, "maxSumTwoNoOverlap", argTypes, term4707, args);
    }

};


