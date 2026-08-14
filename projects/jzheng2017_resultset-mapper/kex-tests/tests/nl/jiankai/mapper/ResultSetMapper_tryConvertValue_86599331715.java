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

public class ResultSetMapper_tryConvertValue_86599331715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2264;

    public ResultSetMapper_tryConvertValue_86599331715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2264 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        setField(term2264, term2264.getClass(), "logger", null);
        setField(term2264, term2264.getClass(), "classCache", null);
        setField(term2264, term2264.getClass(), "fieldNamingStrategy", null);
        setField(term2264, term2264.getClass(), "attributeConvertersBySourceAndTarget", null);
        setField(term2264, term2264.getClass(), "attributeConvertersByClass", null);
        setBooleanField(term2264, term2264.getClass(), "hasClassLevelWarningSuppression", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "tryConvertValue", argTypes, term2264, args);
    }

};


