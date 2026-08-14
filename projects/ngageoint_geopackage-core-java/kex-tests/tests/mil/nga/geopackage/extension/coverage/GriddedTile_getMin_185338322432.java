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

public class GriddedTile_getMin_185338322432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;

    public GriddedTile_getMin_185338322432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term876 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term876, term876.getClass(), "id", 0L);
        setField(term876, term876.getClass(), "contents", null);
        setField(term876, term876.getClass(), "tableName", null);
        setLongField(term876, term876.getClass(), "tableId", 0L);
        setDoubleField(term876, term876.getClass(), "scale", 0.0);
        setDoubleField(term876, term876.getClass(), "offset", 0.0);
        setField(term876, term876.getClass(), "min", null);
        setField(term876, term876.getClass(), "max", null);
        setField(term876, term876.getClass(), "mean", null);
        setField(term876, term876.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMin", argTypes, term876, args);
    }

};


