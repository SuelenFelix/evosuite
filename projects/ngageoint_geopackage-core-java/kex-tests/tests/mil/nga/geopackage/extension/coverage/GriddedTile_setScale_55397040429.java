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

public class GriddedTile_setScale_55397040429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;
     Object term862;

    public GriddedTile_setScale_55397040429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term857, term857.getClass(), "id", 0L);
        setField(term857, term857.getClass(), "contents", null);
        setField(term857, term857.getClass(), "tableName", null);
        setLongField(term857, term857.getClass(), "tableId", 0L);
        setDoubleField(term857, term857.getClass(), "scale", 0.0);
        setDoubleField(term857, term857.getClass(), "offset", 0.0);
        setField(term857, term857.getClass(), "min", null);
        setField(term857, term857.getClass(), "max", null);
        setField(term857, term857.getClass(), "mean", null);
        setField(term857, term857.getClass(), "standardDeviation", null);
        term862 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term862;
        callMethod(klass, "setScale", argTypes, term857, args);
    }

};


