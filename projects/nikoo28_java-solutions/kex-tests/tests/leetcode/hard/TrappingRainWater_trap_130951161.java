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
     Object term484;
     Object term485;

    public TrappingRainWater_trap_130951161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484 = newInstance(Class.forName("leetcode.hard.TrappingRainWater"));
        term485 = (int[]) newIntArray(9);
        setIntElement(term485, 0, -1347665717);
        setIntElement(term485, 1, -1888585309);
        setIntElement(term485, 2, 683666002);
        setIntElement(term485, 3, 1596213415);
        setIntElement(term485, 4, -268815336);
        setIntElement(term485, 5, -1210583429);
        setIntElement(term485, 6, -663691365);
        setIntElement(term485, 7, 339854490);
        setIntElement(term485, 8, -615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.TrappingRainWater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term485;
        callMethod(klass, "trap", argTypes, term484, args);
    }

};


