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
import java.lang.Object;
import java.lang.Integer;

public class FloodFill_fill_12163329112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4580;
     Object term4581;
     Object term4594;
     Object term4596;
     Object term4598;
     Object term4600;

    public FloodFill_fill_12163329112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4580 = newInstance(Class.forName("leetcode.FloodFill"));
        term4581 = (Object[]) newArray("[I", 2);
        int[] term4582 = (int[]) newIntArray(7);
        int[] term4590 = (int[]) newIntArray(3);
        setIntElement(term4582, 0, 1478914037);
        setIntElement(term4582, 1, 1630231519);
        setIntElement(term4582, 2, 1460702778);
        setIntElement(term4582, 3, -1398142433);
        setIntElement(term4582, 4, -1112119058);
        setIntElement(term4582, 5, 2073858334);
        setIntElement(term4582, 6, -1693535639);
        setElement(term4581, 0, term4582);
        setIntElement(term4590, 0, 1344744036);
        setIntElement(term4590, 1, -98060427);
        setIntElement(term4590, 2, -1272268399);
        setElement(term4581, 1, term4590);
        term4594 = new Integer(1120271104);
        term4596 = new Integer(-128435804);
        term4598 = new Integer(2136158480);
        term4600 = new Integer(2118747457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FloodFill");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term4581;
        args[1] = term4594;
        args[2] = term4596;
        args[3] = term4598;
        args[4] = term4600;
        callMethod(klass, "fill", argTypes, term4580, args);
    }

};


