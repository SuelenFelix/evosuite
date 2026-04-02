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

public class MaximumSumTwoNonOverlappingSubarrays_maxSumTwoNoOverlap_2768379154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4748;
     Object term4749;
     Object term4751;

    public MaximumSumTwoNonOverlappingSubarrays_maxSumTwoNoOverlap_2768379154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4748 = newInstance(Class.forName("leetcode.MaximumSumTwoNonOverlappingSubarrays"));
        term4749 = new Integer(0);
        term4751 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MaximumSumTwoNonOverlappingSubarrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4749;
        args[2] = term4751;
        callMethod(klass, "maxSumTwoNoOverlap", argTypes, term4748, args);
    }

};


