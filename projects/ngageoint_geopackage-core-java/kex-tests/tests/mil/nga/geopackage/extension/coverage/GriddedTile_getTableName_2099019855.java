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

public class GriddedTile_getTableName_2099019855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;

    public GriddedTile_getTableName_2099019855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term298 = new Double(0.9828442029246764);
        Double term300 = new Double(0.2779719046761513);
        Double term302 = new Double(0.6436713023569729);
        Double term304 = new Double(0.7332741045694002);
        term281 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term281, term281.getClass(), "id", -7237588299778557629L);
        setField(term281, term281.getClass(), "contents", null);
        setField(term281, term281.getClass(), "tableName", "jJCZpVmanW");
        setLongField(term281, term281.getClass(), "tableId", 6967924379644551255L);
        setDoubleField(term281, term281.getClass(), "scale", 1.0);
        setDoubleField(term281, term281.getClass(), "offset", 0.2641345529914265);
        setField(term281, term281.getClass(), "min", term298);
        setField(term281, term281.getClass(), "max", term300);
        setField(term281, term281.getClass(), "mean", term302);
        setField(term281, term281.getClass(), "standardDeviation", term304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term281, args);
    }

};


