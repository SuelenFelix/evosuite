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

public class ResultSetMapper_ClassCache_isFieldOfPrimitiveType_6141237226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3156;
     Object term3172;

    public ResultSetMapper_ClassCache_isFieldOfPrimitiveType_6141237226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3157 = new HashMap();
        HashMap term3162 = new HashMap();
        HashMap term3167 = new HashMap();
        term3156 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term3156, term3156.getClass(), "logger", null);
        setField(term3156, term3156.getClass(), "cachedClassFields", term3157);
        setField(term3156, term3156.getClass(), "cachedClassAnnotations", term3162);
        setField(term3156, term3156.getClass(), "cachedFieldAnnotations", term3167);
        setField(term3156, term3156.getClass(), "cachedPrimitiveFields", null);
        setField(term3156, term3156.getClass(), "this$0", null);
        Class<? extends Object> term3307 = Class.forName((String) "java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntrySetSpliterator");
        term3172 = ((Class) term3307).getDeclaredField((String) "s");
        ((Field) term3172).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term3172;
        callMethod(klass, "isFieldOfPrimitiveType", argTypes, term3156, args);
    }

};


