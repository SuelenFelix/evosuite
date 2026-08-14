package nl.jiankai.mapper;

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
import static nl.jiankai.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class ResultSetMapper_ClassCache_getFieldAnnotation_11352778802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2491;
     Object term2507;

    public ResultSetMapper_ClassCache_getFieldAnnotation_11352778802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2492 = new HashMap();
        HashMap term2497 = new HashMap();
        HashMap term2502 = new HashMap();
        term2491 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term2491, term2491.getClass(), "logger", null);
        setField(term2491, term2491.getClass(), "cachedClassFields", term2492);
        setField(term2491, term2491.getClass(), "cachedClassAnnotations", term2497);
        setField(term2491, term2491.getClass(), "cachedFieldAnnotations", term2502);
        setField(term2491, term2491.getClass(), "cachedPrimitiveFields", null);
        setField(term2491, term2491.getClass(), "this$0", null);
        Class<? extends Object> term2633 = Class.forName((String) "java.nio.channels.Channels$ReadableByteChannelImpl");
        term2507 = ((Class) term2633).getDeclaredField((String) "in");
        ((Field) term2507).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term2507;
        args[1] = null;
        callMethod(klass, "getFieldAnnotation", argTypes, term2491, args);
    }

};


