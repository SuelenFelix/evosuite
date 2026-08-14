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

public class GriddedTile_getTableId_4122818986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;

    public GriddedTile_getTableId_4122818986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term333 = new Double(0.4569171842750229);
        Double term335 = new Double(0.8598297828918529);
        Double term337 = new Double(0.43692187681405226);
        Double term339 = new Double(0.7633268466829064);
        term316 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term316, term316.getClass(), "id", -2813493605142626659L);
        setField(term316, term316.getClass(), "contents", null);
        setField(term316, term316.getClass(), "tableName", "EGtDIRbSSb");
        setLongField(term316, term316.getClass(), "tableId", -8885298608300233488L);
        setDoubleField(term316, term316.getClass(), "scale", 1.0);
        setDoubleField(term316, term316.getClass(), "offset", 0.36923381893433327);
        setField(term316, term316.getClass(), "min", term333);
        setField(term316, term316.getClass(), "max", term335);
        setField(term316, term316.getClass(), "mean", term337);
        setField(term316, term316.getClass(), "standardDeviation", term339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableId", argTypes, term316, args);
    }

};


