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

public class HouseRobberII_robHelper_5225105382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3606;
     Object term3607;

    public HouseRobberII_robHelper_5225105382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3606 = newInstance(Class.forName("leetcode.medium.HouseRobberII"));
        term3607 = (int[]) newIntArray(7);
        setIntElement(term3607, 0, 1523261232);
        setIntElement(term3607, 1, -428988337);
        setIntElement(term3607, 2, 48047085);
        setIntElement(term3607, 3, 1902784843);
        setIntElement(term3607, 4, 2021136615);
        setIntElement(term3607, 5, 1778570695);
        setIntElement(term3607, 6, -1142164411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.HouseRobberII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3607;
        callMethod(klass, "robHelper", argTypes, term3606, args);
    }

};


