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

public class ResultSetMapper_ClassCache_isFieldAnnotationPresent_17275413304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2868;
     Object term2884;

    public ResultSetMapper_ClassCache_isFieldAnnotationPresent_17275413304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2869 = new HashMap();
        HashMap term2874 = new HashMap();
        HashMap term2879 = new HashMap();
        term2868 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term2868, term2868.getClass(), "logger", null);
        setField(term2868, term2868.getClass(), "cachedClassFields", term2869);
        setField(term2868, term2868.getClass(), "cachedClassAnnotations", term2874);
        setField(term2868, term2868.getClass(), "cachedFieldAnnotations", term2879);
        setField(term2868, term2868.getClass(), "cachedPrimitiveFields", null);
        setField(term2868, term2868.getClass(), "this$0", null);
        Class<? extends Object> term3017 = Class.forName((String) "java.util.EnumMap$Values");
        term2884 = ((Class) term3017).getDeclaredField((String) "this$0");
        ((Field) term2884).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term2884;
        args[1] = null;
        callMethod(klass, "isFieldAnnotationPresent", argTypes, term2868, args);
    }

};


