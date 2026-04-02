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

public class BestTimeToBuyAndSellAStock_maxProfit_11440884301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;
     Object term1382;

    public BestTimeToBuyAndSellAStock_maxProfit_11440884301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381 = newInstance(Class.forName("leetcode.easy.BestTimeToBuyAndSellAStock"));
        term1382 = (int[]) newIntArray(6);
        setIntElement(term1382, 0, 1074848808);
        setIntElement(term1382, 1, -146054762);
        setIntElement(term1382, 2, 798043553);
        setIntElement(term1382, 3, 533197381);
        setIntElement(term1382, 4, 1048271679);
        setIntElement(term1382, 5, -1529797673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.BestTimeToBuyAndSellAStock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1382;
        callMethod(klass, "maxProfit", argTypes, term1381, args);
    }

};


