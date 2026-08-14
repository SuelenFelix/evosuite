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

public class Candy_candy_5935483731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628;
     Object term629;

    public Candy_candy_5935483731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term628 = newInstance(Class.forName("leetcode.hard.Candy"));
        term629 = (int[]) newIntArray(1);
        setIntElement(term629, 0, 1555897383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.Candy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term629;
        callMethod(klass, "candy", argTypes, term628, args);
    }

};


