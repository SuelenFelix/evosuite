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

public class GriddedTile_setStandardDeviation_167139739839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;

    public GriddedTile_setStandardDeviation_167139739839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term911 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term911, term911.getClass(), "id", 0L);
        setField(term911, term911.getClass(), "contents", null);
        setField(term911, term911.getClass(), "tableName", null);
        setLongField(term911, term911.getClass(), "tableId", 0L);
        setDoubleField(term911, term911.getClass(), "scale", 0.0);
        setDoubleField(term911, term911.getClass(), "offset", 0.0);
        setField(term911, term911.getClass(), "min", null);
        setField(term911, term911.getClass(), "max", null);
        setField(term911, term911.getClass(), "mean", null);
        setField(term911, term911.getClass(), "standardDeviation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStandardDeviation", argTypes, term911, args);
    }

};


