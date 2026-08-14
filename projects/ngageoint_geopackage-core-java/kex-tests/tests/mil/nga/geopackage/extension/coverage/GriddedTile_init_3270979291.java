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

public class GriddedTile_init_3270979291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public GriddedTile_init_3270979291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term158 = new Double(0.13238746331190498);
        Double term160 = new Double(0.3455959125047594);
        Double term162 = new Double(0.5523635872663106);
        Double term164 = new Double(0.544608645520025);
        term141 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term141, term141.getClass(), "id", 2442117782898005296L);
        setField(term141, term141.getClass(), "contents", null);
        setField(term141, term141.getClass(), "tableName", "PAEBtnZtTD");
        setLongField(term141, term141.getClass(), "tableId", 6375119433582206027L);
        setDoubleField(term141, term141.getClass(), "scale", 1.0);
        setDoubleField(term141, term141.getClass(), "offset", 0.5523635872663106);
        setField(term141, term141.getClass(), "min", term158);
        setField(term141, term141.getClass(), "max", term160);
        setField(term141, term141.getClass(), "mean", term162);
        setField(term141, term141.getClass(), "standardDeviation", term164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Object[] args = new Object[1];
        args[0] = term141;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


