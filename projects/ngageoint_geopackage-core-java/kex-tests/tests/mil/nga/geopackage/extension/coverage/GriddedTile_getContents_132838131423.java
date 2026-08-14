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

public class GriddedTile_getContents_132838131423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825;

    public GriddedTile_getContents_132838131423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term825, term825.getClass(), "id", 0L);
        setField(term825, term825.getClass(), "contents", null);
        setField(term825, term825.getClass(), "tableName", null);
        setLongField(term825, term825.getClass(), "tableId", 0L);
        setDoubleField(term825, term825.getClass(), "scale", 0.0);
        setDoubleField(term825, term825.getClass(), "offset", 0.0);
        setField(term825, term825.getClass(), "min", null);
        setField(term825, term825.getClass(), "max", null);
        setField(term825, term825.getClass(), "mean", null);
        setField(term825, term825.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContents", argTypes, term825, args);
    }

};


