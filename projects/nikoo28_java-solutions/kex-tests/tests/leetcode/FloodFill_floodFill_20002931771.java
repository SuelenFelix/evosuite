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

public class FloodFill_floodFill_20002931771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4556;
     Object term4557;
     Object term4567;
     Object term4569;
     Object term4571;

    public FloodFill_floodFill_20002931771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4556 = newInstance(Class.forName("leetcode.FloodFill"));
        term4557 = (Object[]) newArray("[I", 2);
        int[] term4558 = (int[]) newIntArray(6);
        int[] term4565 = (int[]) newIntArray(1);
        setIntElement(term4558, 0, 2109912812);
        setIntElement(term4558, 1, 1841286431);
        setIntElement(term4558, 2, -1723168189);
        setIntElement(term4558, 3, -675283917);
        setIntElement(term4558, 4, -2093862988);
        setIntElement(term4558, 5, 1337828646);
        setElement(term4557, 0, term4558);
        setIntElement(term4565, 0, 532666604);
        setElement(term4557, 1, term4565);
        term4567 = new Integer(-13725716);
        term4569 = new Integer(-1695750603);
        term4571 = new Integer(63677360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FloodFill");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4557;
        args[1] = term4567;
        args[2] = term4569;
        args[3] = term4571;
        callMethod(klass, "floodFill", argTypes, term4556, args);
    }

};


