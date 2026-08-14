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

public class GriddedTile_getMax_185315450614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;

    public GriddedTile_getMax_185315450614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term621 = new Double(0.8454723071922143);
        Double term623 = new Double(0.8566567697571895);
        Double term625 = new Double(0.9203805380592256);
        Double term627 = new Double(0.5804948995371725);
        term604 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term604, term604.getClass(), "id", -4502405999831680926L);
        setField(term604, term604.getClass(), "contents", null);
        setField(term604, term604.getClass(), "tableName", "LQFpaHEwXR");
        setLongField(term604, term604.getClass(), "tableId", 1967728129628047933L);
        setDoubleField(term604, term604.getClass(), "scale", 1.0);
        setDoubleField(term604, term604.getClass(), "offset", 0.2779719046761513);
        setField(term604, term604.getClass(), "min", term621);
        setField(term604, term604.getClass(), "max", term623);
        setField(term604, term604.getClass(), "mean", term625);
        setField(term604, term604.getClass(), "standardDeviation", term627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMax", argTypes, term604, args);
    }

};


