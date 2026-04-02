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

public class NumbersSmallerThanTheCurrentNumber_smallerNumbersThanCurrent_2581961481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1774;
     Object term1775;

    public NumbersSmallerThanTheCurrentNumber_smallerNumbersThanCurrent_2581961481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1774 = newInstance(Class.forName("leetcode.easy.NumbersSmallerThanTheCurrentNumber"));
        term1775 = (int[]) newIntArray(1);
        setIntElement(term1775, 0, 1242676024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.NumbersSmallerThanTheCurrentNumber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1775;
        callMethod(klass, "smallerNumbersThanCurrent", argTypes, term1774, args);
    }

};


