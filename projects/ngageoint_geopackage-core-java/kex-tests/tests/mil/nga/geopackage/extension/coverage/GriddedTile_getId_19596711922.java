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

public class GriddedTile_getId_19596711922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public GriddedTile_getId_19596711922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term193 = new Double(0.28570734989730284);
        Double term195 = new Double(0.40176586625454525);
        Double term197 = new Double(0.2641345529914265);
        Double term199 = new Double(0.36923381893433327);
        term176 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term176, term176.getClass(), "id", -8257434502486459194L);
        setField(term176, term176.getClass(), "contents", null);
        setField(term176, term176.getClass(), "tableName", "sjlJAEtRrb");
        setLongField(term176, term176.getClass(), "tableId", -8400487765614892086L);
        setDoubleField(term176, term176.getClass(), "scale", 1.0);
        setDoubleField(term176, term176.getClass(), "offset", 0.544608645520025);
        setField(term176, term176.getClass(), "min", term193);
        setField(term176, term176.getClass(), "max", term195);
        setField(term176, term176.getClass(), "mean", term197);
        setField(term176, term176.getClass(), "standardDeviation", term199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term176, args);
    }

};


