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

public class LRUCache_addToHead_165937550110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2179;

    public LRUCache_addToHead_165937550110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2179 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        setField(term2179, term2179.getClass(), "head", null);
        setField(term2179, term2179.getClass(), "tail", null);
        setField(term2179, term2179.getClass(), "keyNodeAddressMap", null);
        setIntField(term2179, term2179.getClass(), "maxCapacity", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addToHead", argTypes, term2179, args);
    }

};


