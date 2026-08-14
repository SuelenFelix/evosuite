package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class CoverageDataSourcePixel_setOffset_186723903217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term111;

    public CoverageDataSourcePixel_setOffset_186723903217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataSourcePixel"));
        setFloatField(term106, term106.getClass(), "pixel", 0.0F);
        setIntField(term106, term106.getClass(), "min", 0);
        setIntField(term106, term106.getClass(), "max", 0);
        setFloatField(term106, term106.getClass(), "offset", 0.0F);
        term111 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataSourcePixel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term111;
        callMethod(klass, "setOffset", argTypes, term106, args);
    }

};


