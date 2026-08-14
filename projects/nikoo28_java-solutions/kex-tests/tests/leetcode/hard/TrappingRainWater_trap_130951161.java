package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TrappingRainWater_trap_130951161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;
     Object term601;

    public TrappingRainWater_trap_130951161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600 = newInstance(Class.forName("leetcode.hard.TrappingRainWater"));
        term601 = (int[]) newIntArray(5);
        setIntElement(term601, 0, 71190297);
        setIntElement(term601, 1, 1202361360);
        setIntElement(term601, 2, -2015048153);
        setIntElement(term601, 3, -2063457669);
        setIntElement(term601, 4, -1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.TrappingRainWater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term601;
        callMethod(klass, "trap", argTypes, term600, args);
    }

};


