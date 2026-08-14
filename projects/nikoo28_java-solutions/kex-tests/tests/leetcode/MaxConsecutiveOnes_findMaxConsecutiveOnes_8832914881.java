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

public class MaxConsecutiveOnes_findMaxConsecutiveOnes_8832914881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10670;
     Object term10671;

    public MaxConsecutiveOnes_findMaxConsecutiveOnes_8832914881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10670 = newInstance(Class.forName("leetcode.MaxConsecutiveOnes"));
        term10671 = (int[]) newIntArray(2);
        setIntElement(term10671, 0, 2060624021);
        setIntElement(term10671, 1, -1853309523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MaxConsecutiveOnes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10671;
        callMethod(klass, "findMaxConsecutiveOnes", argTypes, term10670, args);
    }

};


