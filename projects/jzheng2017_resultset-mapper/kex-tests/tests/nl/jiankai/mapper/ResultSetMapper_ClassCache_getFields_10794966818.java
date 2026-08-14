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
import java.util.LinkedList;

public class ResultSetMapper_ClassCache_getFields_10794966818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3700;
     Object term3716;

    public ResultSetMapper_ClassCache_getFields_10794966818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3701 = new HashMap();
        HashMap term3706 = new HashMap();
        HashMap term3711 = new HashMap();
        term3700 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term3700, term3700.getClass(), "logger", null);
        setField(term3700, term3700.getClass(), "cachedClassFields", term3701);
        setField(term3700, term3700.getClass(), "cachedClassAnnotations", term3706);
        setField(term3700, term3700.getClass(), "cachedFieldAnnotations", term3711);
        setField(term3700, term3700.getClass(), "cachedPrimitiveFields", null);
        setField(term3700, term3700.getClass(), "this$0", null);
        term3716 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term3716;
        args[1] = null;
        callMethod(klass, "getFields", argTypes, term3700, args);
    }

};


