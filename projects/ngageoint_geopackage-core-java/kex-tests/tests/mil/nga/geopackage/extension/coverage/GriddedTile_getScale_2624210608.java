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

public class GriddedTile_getScale_2624210608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388;

    public GriddedTile_getScale_2624210608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term405 = new Double(0.10667076642995188);
        Double term407 = new Double(0.11493000848982304);
        Double term409 = new Double(0.37161417339133307);
        Double term411 = new Double(0.6805867182029153);
        term388 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term388, term388.getClass(), "id", -872011222785455006L);
        setField(term388, term388.getClass(), "contents", null);
        setField(term388, term388.getClass(), "tableName", "MjGYSRKTNF");
        setLongField(term388, term388.getClass(), "tableId", -316468845751588286L);
        setDoubleField(term388, term388.getClass(), "scale", 1.0);
        setDoubleField(term388, term388.getClass(), "offset", 0.37773193782763337);
        setField(term388, term388.getClass(), "min", term405);
        setField(term388, term388.getClass(), "max", term407);
        setField(term388, term388.getClass(), "mean", term409);
        setField(term388, term388.getClass(), "standardDeviation", term411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScale", argTypes, term388, args);
    }

};


