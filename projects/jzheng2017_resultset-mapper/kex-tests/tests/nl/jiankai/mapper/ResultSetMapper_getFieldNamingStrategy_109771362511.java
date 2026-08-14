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

public class ResultSetMapper_getFieldNamingStrategy_109771362511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2256;

    public ResultSetMapper_getFieldNamingStrategy_109771362511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2256 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        setField(term2256, term2256.getClass(), "logger", null);
        setField(term2256, term2256.getClass(), "classCache", null);
        setField(term2256, term2256.getClass(), "fieldNamingStrategy", null);
        setField(term2256, term2256.getClass(), "attributeConvertersBySourceAndTarget", null);
        setField(term2256, term2256.getClass(), "attributeConvertersByClass", null);
        setBooleanField(term2256, term2256.getClass(), "hasClassLevelWarningSuppression", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldNamingStrategy", argTypes, term2256, args);
    }

};


