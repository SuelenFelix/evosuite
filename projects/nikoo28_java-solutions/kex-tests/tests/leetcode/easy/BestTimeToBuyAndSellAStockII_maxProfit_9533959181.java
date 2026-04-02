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

public class BestTimeToBuyAndSellAStockII_maxProfit_9533959181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;
     Object term277;

    public BestTimeToBuyAndSellAStockII_maxProfit_9533959181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276 = newInstance(Class.forName("leetcode.easy.BestTimeToBuyAndSellAStockII"));
        term277 = (int[]) newIntArray(6);
        setIntElement(term277, 0, -112921587);
        setIntElement(term277, 1, 933028652);
        setIntElement(term277, 2, 287287233);
        setIntElement(term277, 3, 962840079);
        setIntElement(term277, 4, 1540719661);
        setIntElement(term277, 5, 1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.BestTimeToBuyAndSellAStockII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term277;
        callMethod(klass, "maxProfit", argTypes, term276, args);
    }

};


