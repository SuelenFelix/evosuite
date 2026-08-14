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

public class CoverageDataSourcePixel_setOffset_18672390328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term55;

    public CoverageDataSourcePixel_setOffset_18672390328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataSourcePixel"));
        setFloatField(term50, term50.getClass(), "pixel", 0.6608425F);
        setIntField(term50, term50.getClass(), "min", 1622346318);
        setIntField(term50, term50.getClass(), "max", 1048535127);
        setFloatField(term50, term50.getClass(), "offset", 0.37773192F);
        term55 = new Float(0.24413109F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataSourcePixel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term55;
        callMethod(klass, "setOffset", argTypes, term50, args);
    }

};


