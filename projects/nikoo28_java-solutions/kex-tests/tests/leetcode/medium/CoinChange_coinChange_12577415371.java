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

public class CoinChange_coinChange_12577415371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1517;
     Object term1518;
     Object term1528;

    public CoinChange_coinChange_12577415371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1517 = newInstance(Class.forName("leetcode.medium.CoinChange"));
        term1518 = (int[]) newIntArray(9);
        setIntElement(term1518, 0, -1865023308);
        setIntElement(term1518, 1, 1698510819);
        setIntElement(term1518, 2, -1553893255);
        setIntElement(term1518, 3, 1303442927);
        setIntElement(term1518, 4, 794568325);
        setIntElement(term1518, 5, -434468428);
        setIntElement(term1518, 6, 1559605714);
        setIntElement(term1518, 7, 1146601902);
        setIntElement(term1518, 8, -1938881385);
        term1528 = new Integer(-1629418973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.CoinChange");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1518;
        args[1] = term1528;
        callMethod(klass, "coinChange", argTypes, term1517, args);
    }

};


