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

public class MiddleOfTheLinkedList_middleNode_7472729133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1997;

    public MiddleOfTheLinkedList_middleNode_7472729133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1997 = newInstance(Class.forName("leetcode.easy.MiddleOfTheLinkedList"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MiddleOfTheLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "middleNode", argTypes, term1997, args);
    }

};


