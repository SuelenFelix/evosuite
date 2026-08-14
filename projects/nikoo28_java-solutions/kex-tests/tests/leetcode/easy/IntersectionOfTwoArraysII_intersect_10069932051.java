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

public class IntersectionOfTwoArraysII_intersect_10069932051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094;
     Object term1095;
     Object term1098;

    public IntersectionOfTwoArraysII_intersect_10069932051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1094 = newInstance(Class.forName("leetcode.easy.IntersectionOfTwoArraysII"));
        term1095 = (int[]) newIntArray(2);
        setIntElement(term1095, 0, 880977281);
        setIntElement(term1095, 1, 371943306);
        term1098 = (int[]) newIntArray(1);
        setIntElement(term1098, 0, 982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.IntersectionOfTwoArraysII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1095;
        args[1] = term1098;
        callMethod(klass, "intersect", argTypes, term1094, args);
    }

};


