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

public class ResultSetMapper_map_50460909313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2260;

    public ResultSetMapper_map_50460909313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2260 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        setField(term2260, term2260.getClass(), "logger", null);
        setField(term2260, term2260.getClass(), "classCache", null);
        setField(term2260, term2260.getClass(), "fieldNamingStrategy", null);
        setField(term2260, term2260.getClass(), "attributeConvertersBySourceAndTarget", null);
        setField(term2260, term2260.getClass(), "attributeConvertersByClass", null);
        setBooleanField(term2260, term2260.getClass(), "hasClassLevelWarningSuppression", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "map", argTypes, term2260, args);
    }

};


