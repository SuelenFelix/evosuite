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
import java.lang.Long;

public class GriddedTile_setTableId_196490274027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845;
     Object term850;

    public GriddedTile_setTableId_196490274027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term845 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term845, term845.getClass(), "id", 0L);
        setField(term845, term845.getClass(), "contents", null);
        setField(term845, term845.getClass(), "tableName", null);
        setLongField(term845, term845.getClass(), "tableId", 0L);
        setDoubleField(term845, term845.getClass(), "scale", 0.0);
        setDoubleField(term845, term845.getClass(), "offset", 0.0);
        setField(term845, term845.getClass(), "min", null);
        setField(term845, term845.getClass(), "max", null);
        setField(term845, term845.getClass(), "mean", null);
        setField(term845, term845.getClass(), "standardDeviation", null);
        term850 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term850;
        callMethod(klass, "setTableId", argTypes, term845, args);
    }

};


