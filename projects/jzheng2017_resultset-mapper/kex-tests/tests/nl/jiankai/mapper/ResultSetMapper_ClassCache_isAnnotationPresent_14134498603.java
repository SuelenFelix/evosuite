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

public class ResultSetMapper_ClassCache_isAnnotationPresent_14134498603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2852;

    public ResultSetMapper_ClassCache_isAnnotationPresent_14134498603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2853 = new HashMap();
        HashMap term2858 = new HashMap();
        HashMap term2863 = new HashMap();
        term2852 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term2852, term2852.getClass(), "logger", null);
        setField(term2852, term2852.getClass(), "cachedClassFields", term2853);
        setField(term2852, term2852.getClass(), "cachedClassAnnotations", term2858);
        setField(term2852, term2852.getClass(), "cachedFieldAnnotations", term2863);
        setField(term2852, term2852.getClass(), "cachedPrimitiveFields", null);
        setField(term2852, term2852.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isAnnotationPresent", argTypes, term2852, args);
    }

};


