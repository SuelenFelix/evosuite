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
import java.util.LinkedHashMap;
import java.lang.Integer;

public class BinaryTreeFromPreorderInOrderTraversal_splitTree_15004940552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444;
     Object term1445;
     Object term1447;
     Object term1502;
     Object term1504;
     Object term1506;

    public BinaryTreeFromPreorderInOrderTraversal_splitTree_15004940552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1444 = newInstance(Class.forName("leetcode.medium.BinaryTreeFromPreorderInOrderTraversal"));
        term1445 = (int[]) newIntArray(1);
        setIntElement(term1445, 0, 1116576792);
        term1447 = new LinkedHashMap();
        term1502 = new Integer(-942194446);
        term1504 = new Integer(-938508470);
        term1506 = new Integer(1242676024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.BinaryTreeFromPreorderInOrderTraversal");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term1445;
        args[1] = term1447;
        args[2] = term1502;
        args[3] = term1504;
        args[4] = term1506;
        callMethod(klass, "splitTree", argTypes, term1444, args);
    }

};


