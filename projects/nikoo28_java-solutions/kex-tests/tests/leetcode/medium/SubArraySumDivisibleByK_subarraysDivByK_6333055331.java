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

public class SubArraySumDivisibleByK_subarraysDivByK_6333055331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2817;
     Object term2818;
     Object term2823;

    public SubArraySumDivisibleByK_subarraysDivByK_6333055331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2817 = newInstance(Class.forName("leetcode.medium.SubArraySumDivisibleByK"));
        term2818 = (int[]) newIntArray(4);
        setIntElement(term2818, 0, 1092038167);
        setIntElement(term2818, 1, 1879729823);
        setIntElement(term2818, 2, 1443855558);
        setIntElement(term2818, 3, -1933419449);
        term2823 = new Integer(-1804322375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SubArraySumDivisibleByK");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2818;
        args[1] = term2823;
        callMethod(klass, "subarraysDivByK", argTypes, term2817, args);
    }

};


