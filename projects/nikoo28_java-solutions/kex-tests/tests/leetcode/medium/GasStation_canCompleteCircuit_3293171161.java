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

public class GasStation_canCompleteCircuit_3293171161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term207;
     Object term211;

    public GasStation_canCompleteCircuit_3293171161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("leetcode.medium.GasStation"));
        term207 = (int[]) newIntArray(3);
        setIntElement(term207, 0, -1145578966);
        setIntElement(term207, 1, 679763016);
        setIntElement(term207, 2, 1962444399);
        term211 = (int[]) newIntArray(5);
        setIntElement(term211, 0, 767834723);
        setIntElement(term211, 1, -602026508);
        setIntElement(term211, 2, -157887805);
        setIntElement(term211, 3, 1876565163);
        setIntElement(term211, 4, -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.GasStation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term207;
        args[1] = term211;
        callMethod(klass, "canCompleteCircuit", argTypes, term206, args);
    }

};


