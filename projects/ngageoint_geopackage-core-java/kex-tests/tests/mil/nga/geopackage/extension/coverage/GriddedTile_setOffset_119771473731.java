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
import java.lang.Double;

public class GriddedTile_setOffset_119771473731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;
     Object term874;

    public GriddedTile_setOffset_119771473731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term869 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term869, term869.getClass(), "id", 0L);
        setField(term869, term869.getClass(), "contents", null);
        setField(term869, term869.getClass(), "tableName", null);
        setLongField(term869, term869.getClass(), "tableId", 0L);
        setDoubleField(term869, term869.getClass(), "scale", 0.0);
        setDoubleField(term869, term869.getClass(), "offset", 0.0);
        setField(term869, term869.getClass(), "min", null);
        setField(term869, term869.getClass(), "max", null);
        setField(term869, term869.getClass(), "mean", null);
        setField(term869, term869.getClass(), "standardDeviation", null);
        term874 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term874;
        callMethod(klass, "setOffset", argTypes, term869, args);
    }

};


