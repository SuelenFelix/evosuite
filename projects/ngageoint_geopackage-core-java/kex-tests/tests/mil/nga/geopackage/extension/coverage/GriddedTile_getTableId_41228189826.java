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

public class GriddedTile_getTableId_41228189826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840;

    public GriddedTile_getTableId_41228189826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term840, term840.getClass(), "id", 0L);
        setField(term840, term840.getClass(), "contents", null);
        setField(term840, term840.getClass(), "tableName", null);
        setLongField(term840, term840.getClass(), "tableId", 0L);
        setDoubleField(term840, term840.getClass(), "scale", 0.0);
        setDoubleField(term840, term840.getClass(), "offset", 0.0);
        setField(term840, term840.getClass(), "min", null);
        setField(term840, term840.getClass(), "max", null);
        setField(term840, term840.getClass(), "mean", null);
        setField(term840, term840.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableId", argTypes, term840, args);
    }

};


