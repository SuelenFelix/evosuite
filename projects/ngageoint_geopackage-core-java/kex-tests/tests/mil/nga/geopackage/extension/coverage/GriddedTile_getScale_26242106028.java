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

public class GriddedTile_getScale_26242106028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852;

    public GriddedTile_getScale_26242106028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term852, term852.getClass(), "id", 0L);
        setField(term852, term852.getClass(), "contents", null);
        setField(term852, term852.getClass(), "tableName", null);
        setLongField(term852, term852.getClass(), "tableId", 0L);
        setDoubleField(term852, term852.getClass(), "scale", 0.0);
        setDoubleField(term852, term852.getClass(), "offset", 0.0);
        setField(term852, term852.getClass(), "min", null);
        setField(term852, term852.getClass(), "max", null);
        setField(term852, term852.getClass(), "mean", null);
        setField(term852, term852.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScale", argTypes, term852, args);
    }

};


