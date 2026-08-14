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

public class GriddedTile_getContents_13283813143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public GriddedTile_getContents_13283813143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term228 = new Double(0.6076495596892013);
        Double term230 = new Double(0.37773193782763337);
        Double term232 = new Double(0.8474802076607362);
        Double term234 = new Double(0.5183269973490326);
        term211 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term211, term211.getClass(), "id", 5270370404989704783L);
        setField(term211, term211.getClass(), "contents", null);
        setField(term211, term211.getClass(), "tableName", "MuLcgQHgqz");
        setLongField(term211, term211.getClass(), "tableId", 7411271909051562686L);
        setDoubleField(term211, term211.getClass(), "scale", 1.0);
        setDoubleField(term211, term211.getClass(), "offset", 0.28570734989730284);
        setField(term211, term211.getClass(), "min", term228);
        setField(term211, term211.getClass(), "max", term230);
        setField(term211, term211.getClass(), "mean", term232);
        setField(term211, term211.getClass(), "standardDeviation", term234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContents", argTypes, term211, args);
    }

};


