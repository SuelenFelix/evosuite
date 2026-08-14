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

public class GriddedTile_getMean_51155650336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896;

    public GriddedTile_getMean_51155650336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term896, term896.getClass(), "id", 0L);
        setField(term896, term896.getClass(), "contents", null);
        setField(term896, term896.getClass(), "tableName", null);
        setLongField(term896, term896.getClass(), "tableId", 0L);
        setDoubleField(term896, term896.getClass(), "scale", 0.0);
        setDoubleField(term896, term896.getClass(), "offset", 0.0);
        setField(term896, term896.getClass(), "min", null);
        setField(term896, term896.getClass(), "max", null);
        setField(term896, term896.getClass(), "mean", null);
        setField(term896, term896.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMean", argTypes, term896, args);
    }

};


