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

public class MaximumBinaryTree_constructMaximumBinaryTree_10549304231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207;
     Object term2208;

    public MaximumBinaryTree_constructMaximumBinaryTree_10549304231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207 = newInstance(Class.forName("leetcode.medium.MaximumBinaryTree"));
        term2208 = (int[]) newIntArray(8);
        setIntElement(term2208, 0, -1518419301);
        setIntElement(term2208, 1, 674879025);
        setIntElement(term2208, 2, -1538936030);
        setIntElement(term2208, 3, -752870423);
        setIntElement(term2208, 4, -1698809299);
        setIntElement(term2208, 5, 401512128);
        setIntElement(term2208, 6, -2069930777);
        setIntElement(term2208, 7, 1543696412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MaximumBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2208;
        callMethod(klass, "constructMaximumBinaryTree", argTypes, term2207, args);
    }

};


