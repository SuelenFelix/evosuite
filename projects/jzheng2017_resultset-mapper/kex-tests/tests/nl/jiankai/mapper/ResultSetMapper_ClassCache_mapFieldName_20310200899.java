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
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Object;

public class ResultSetMapper_ClassCache_mapFieldName_20310200899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3719;
     Object term3735;
     Object term3918;

    public ResultSetMapper_ClassCache_mapFieldName_20310200899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3720 = new HashMap();
        HashMap term3725 = new HashMap();
        HashMap term3730 = new HashMap();
        term3719 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        setField(term3719, term3719.getClass(), "logger", null);
        setField(term3719, term3719.getClass(), "cachedClassFields", term3720);
        setField(term3719, term3719.getClass(), "cachedClassAnnotations", term3725);
        setField(term3719, term3719.getClass(), "cachedFieldAnnotations", term3730);
        setField(term3719, term3719.getClass(), "cachedPrimitiveFields", null);
        setField(term3719, term3719.getClass(), "this$0", null);
        term3735 = new LinkedHashMap();
        Class<? extends Object> term4056 = Class.forName((String) "java.nio.file.attribute.PosixFilePermissions$1");
        term3918 = ((Class) term4056).getDeclaredField((String) "val$value");
        ((Field) term3918).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[2];
        args[0] = term3735;
        args[1] = term3918;
        callMethod(klass, "mapFieldName", argTypes, term3719, args);
    }

};


