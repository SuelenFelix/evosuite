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

public class GriddedTile_getMin_185338322412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532;

    public GriddedTile_getMin_185338322412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term549 = new Double(0.25937345430928016);
        Double term551 = new Double(0.5873228247510078);
        Double term553 = new Double(0.8823181080774973);
        Double term555 = new Double(0.2192450926212024);
        term532 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term532, term532.getClass(), "id", -4365849114644724155L);
        setField(term532, term532.getClass(), "contents", null);
        setField(term532, term532.getClass(), "tableName", "uuaPigETmJ");
        setLongField(term532, term532.getClass(), "tableId", 2486810210675247493L);
        setDoubleField(term532, term532.getClass(), "scale", 1.0);
        setDoubleField(term532, term532.getClass(), "offset", 0.9527281779865117);
        setField(term532, term532.getClass(), "min", term549);
        setField(term532, term532.getClass(), "max", term551);
        setField(term532, term532.getClass(), "mean", term553);
        setField(term532, term532.getClass(), "standardDeviation", term555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMin", argTypes, term532, args);
    }

};


