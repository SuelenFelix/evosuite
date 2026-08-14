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

public class GriddedTile_getStandardDeviation_48978530238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;

    public GriddedTile_getStandardDeviation_48978530238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term906, term906.getClass(), "id", 0L);
        setField(term906, term906.getClass(), "contents", null);
        setField(term906, term906.getClass(), "tableName", null);
        setLongField(term906, term906.getClass(), "tableId", 0L);
        setDoubleField(term906, term906.getClass(), "scale", 0.0);
        setDoubleField(term906, term906.getClass(), "offset", 0.0);
        setField(term906, term906.getClass(), "min", null);
        setField(term906, term906.getClass(), "max", null);
        setField(term906, term906.getClass(), "mean", null);
        setField(term906, term906.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardDeviation", argTypes, term906, args);
    }

};


