package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MaxConsecutiveOnes_findMaxConsecutiveOnes_13065077831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1782;
     Object term1783;

    public MaxConsecutiveOnes_findMaxConsecutiveOnes_13065077831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1782 = newInstance(Class.forName("leetcode.easy.MaxConsecutiveOnes"));
        term1783 = (int[]) newIntArray(9);
        setIntElement(term1783, 0, -1865023308);
        setIntElement(term1783, 1, 1698510819);
        setIntElement(term1783, 2, -1553893255);
        setIntElement(term1783, 3, 1303442927);
        setIntElement(term1783, 4, 794568325);
        setIntElement(term1783, 5, -434468428);
        setIntElement(term1783, 6, 1559605714);
        setIntElement(term1783, 7, 1146601902);
        setIntElement(term1783, 8, -1938881385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MaxConsecutiveOnes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1783;
        callMethod(klass, "findMaxConsecutiveOnes", argTypes, term1782, args);
    }

};


