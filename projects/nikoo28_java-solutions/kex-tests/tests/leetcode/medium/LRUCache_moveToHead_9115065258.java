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

public class LRUCache_moveToHead_9115065258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171;

    public LRUCache_moveToHead_9115065258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2171 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        setField(term2171, term2171.getClass(), "head", null);
        setField(term2171, term2171.getClass(), "tail", null);
        setField(term2171, term2171.getClass(), "keyNodeAddressMap", null);
        setIntField(term2171, term2171.getClass(), "maxCapacity", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "moveToHead", argTypes, term2171, args);
    }

};


