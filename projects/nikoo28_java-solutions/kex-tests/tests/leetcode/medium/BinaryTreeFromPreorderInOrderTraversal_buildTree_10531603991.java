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

public class BinaryTreeFromPreorderInOrderTraversal_buildTree_10531603991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1427;
     Object term1428;
     Object term1429;

    public BinaryTreeFromPreorderInOrderTraversal_buildTree_10531603991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1427 = newInstance(Class.forName("leetcode.medium.BinaryTreeFromPreorderInOrderTraversal"));
        term1428 = (int[]) newIntArray(0);
        term1429 = (int[]) newIntArray(7);
        setIntElement(term1429, 0, 844222656);
        setIntElement(term1429, 1, -18216811);
        setIntElement(term1429, 2, -1813280137);
        setIntElement(term1429, 3, 719656595);
        setIntElement(term1429, 4, -1516995753);
        setIntElement(term1429, 5, -390501023);
        setIntElement(term1429, 6, -1667482829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.BinaryTreeFromPreorderInOrderTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1428;
        args[1] = term1429;
        callMethod(klass, "buildTree", argTypes, term1427, args);
    }

};


