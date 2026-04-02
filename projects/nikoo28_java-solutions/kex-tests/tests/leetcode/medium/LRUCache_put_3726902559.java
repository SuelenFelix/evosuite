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
import java.lang.Integer;

public class LRUCache_put_3726902559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2173;
     Object term2175;
     Object term2177;

    public LRUCache_put_3726902559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2173 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        setField(term2173, term2173.getClass(), "head", null);
        setField(term2173, term2173.getClass(), "tail", null);
        setField(term2173, term2173.getClass(), "keyNodeAddressMap", null);
        setIntField(term2173, term2173.getClass(), "maxCapacity", 0);
        term2175 = new Integer(0);
        term2177 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2175;
        args[1] = term2177;
        callMethod(klass, "put", argTypes, term2173, args);
    }

};


