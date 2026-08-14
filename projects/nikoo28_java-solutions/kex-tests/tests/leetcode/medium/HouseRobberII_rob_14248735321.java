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

public class HouseRobberII_rob_14248735321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3592;
     Object term3593;

    public HouseRobberII_rob_14248735321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3592 = newInstance(Class.forName("leetcode.medium.HouseRobberII"));
        term3593 = (int[]) newIntArray(6);
        setIntElement(term3593, 0, -1452324619);
        setIntElement(term3593, 1, -1121709274);
        setIntElement(term3593, 2, -532304223);
        setIntElement(term3593, 3, 666218293);
        setIntElement(term3593, 4, 1737876343);
        setIntElement(term3593, 5, -897937940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.HouseRobberII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3593;
        callMethod(klass, "rob", argTypes, term3592, args);
    }

};


