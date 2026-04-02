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

public class TwoSumII_twoSum_16717614091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4755;
     Object term4756;
     Object term4764;

    public TwoSumII_twoSum_16717614091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4755 = newInstance(Class.forName("leetcode.medium.TwoSumII"));
        term4756 = (int[]) newIntArray(7);
        setIntElement(term4756, 0, -1174440096);
        setIntElement(term4756, 1, -679614653);
        setIntElement(term4756, 2, -561851867);
        setIntElement(term4756, 3, -1809928454);
        setIntElement(term4756, 4, -191639503);
        setIntElement(term4756, 5, -1563700756);
        setIntElement(term4756, 6, -208314837);
        term4764 = new Integer(697841387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TwoSumII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4756;
        args[1] = term4764;
        callMethod(klass, "twoSum", argTypes, term4755, args);
    }

};


