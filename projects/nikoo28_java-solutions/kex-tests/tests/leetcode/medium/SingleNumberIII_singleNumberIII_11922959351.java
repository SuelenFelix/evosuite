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

public class SingleNumberIII_singleNumberIII_11922959351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612;
     Object term613;

    public SingleNumberIII_singleNumberIII_11922959351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612 = newInstance(Class.forName("leetcode.medium.SingleNumberIII"));
        term613 = (int[]) newIntArray(5);
        setIntElement(term613, 0, -2014576105);
        setIntElement(term613, 1, 1296895584);
        setIntElement(term613, 2, 628918458);
        setIntElement(term613, 3, -1274456137);
        setIntElement(term613, 4, 1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SingleNumberIII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term613;
        callMethod(klass, "singleNumberIII", argTypes, term612, args);
    }

};


