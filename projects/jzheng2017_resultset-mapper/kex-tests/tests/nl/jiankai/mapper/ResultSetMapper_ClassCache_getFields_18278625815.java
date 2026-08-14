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

public class ResultSetMapper_ClassCache_getFields_18278625815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3140;

    public ResultSetMapper_ClassCache_getFields_18278625815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3141 = new HashMap();
        HashMap term3146 = new HashMap();
        HashMap term3151 = new HashMap();
        term3140 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term3140, term3140.getClass(), "logger", null);
        setField(term3140, term3140.getClass(), "cachedClassFields", term3141);
        setField(term3140, term3140.getClass(), "cachedClassAnnotations", term3146);
        setField(term3140, term3140.getClass(), "cachedFieldAnnotations", term3151);
        setField(term3140, term3140.getClass(), "cachedPrimitiveFields", null);
        setField(term3140, term3140.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFields", argTypes, term3140, args);
    }

};


