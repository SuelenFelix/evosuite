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

public class ResultSetMapper_ClassCache_mapFieldName_203102008919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4281;

    public ResultSetMapper_ClassCache_mapFieldName_203102008919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4281 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term4281, term4281.getClass(), "logger", null);
        setField(term4281, term4281.getClass(), "cachedClassFields", null);
        setField(term4281, term4281.getClass(), "cachedClassAnnotations", null);
        setField(term4281, term4281.getClass(), "cachedFieldAnnotations", null);
        setField(term4281, term4281.getClass(), "cachedPrimitiveFields", null);
        setField(term4281, term4281.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "mapFieldName", argTypes, term4281, args);
    }

};


