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

public class GriddedTile_setMean_209716631917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711;
     Object term736;

    public GriddedTile_setMean_209716631917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term728 = new Double(0.022483645678509023);
        Double term730 = new Double(0.025133051616627267);
        Double term732 = new Double(0.016575281023182953);
        Double term734 = new Double(0.5308350402051779);
        term711 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term711, term711.getClass(), "id", -6823727938421990489L);
        setField(term711, term711.getClass(), "contents", null);
        setField(term711, term711.getClass(), "tableName", "ZiaGIbnzTs");
        setLongField(term711, term711.getClass(), "tableId", -484994522244390100L);
        setDoubleField(term711, term711.getClass(), "scale", 1.0);
        setDoubleField(term711, term711.getClass(), "offset", 0.4569171842750229);
        setField(term711, term711.getClass(), "min", term728);
        setField(term711, term711.getClass(), "max", term730);
        setField(term711, term711.getClass(), "mean", term732);
        setField(term711, term711.getClass(), "standardDeviation", term734);
        term736 = new Double(0.7154795600170818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term736;
        callMethod(klass, "setMean", argTypes, term711, args);
    }

};


