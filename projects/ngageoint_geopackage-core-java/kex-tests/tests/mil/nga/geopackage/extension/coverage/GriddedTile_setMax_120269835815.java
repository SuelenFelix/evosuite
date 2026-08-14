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

public class GriddedTile_setMax_120269835815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;
     Object term664;

    public GriddedTile_setMax_120269835815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term656 = new Double(0.20737514139742264);
        Double term658 = new Double(0.7919370314903882);
        Double term660 = new Double(0.2109867221632754);
        Double term662 = new Double(0.3227335400819148);
        term639 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term639, term639.getClass(), "id", 2120084523938730454L);
        setField(term639, term639.getClass(), "contents", null);
        setField(term639, term639.getClass(), "tableName", "oVcInYnLWB");
        setLongField(term639, term639.getClass(), "tableId", 6855071767938501807L);
        setDoubleField(term639, term639.getClass(), "scale", 1.0);
        setDoubleField(term639, term639.getClass(), "offset", 0.6436713023569729);
        setField(term639, term639.getClass(), "min", term656);
        setField(term639, term639.getClass(), "max", term658);
        setField(term639, term639.getClass(), "mean", term660);
        setField(term639, term639.getClass(), "standardDeviation", term662);
        term664 = new Double(0.43337207054070237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term664;
        callMethod(klass, "setMax", argTypes, term639, args);
    }

};


