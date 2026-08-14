package mil.nga.geopackage.extension.nga.scale;

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
import static mil.nga.geopackage.extension.nga.scale.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class TileScaling_init_15282875201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum0;
     Object term31;
     Object term33;

    public TileScaling_init_15282875201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term1, term1.getClass(), "contents", null);
        setField(term1, term1.getClass(), "tableName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "srs", null);
        setLongField(term1, term1.getClass(), "srsId", 2442117782898005296L);
        setDoubleField(term1, term1.getClass(), "minX", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "minY", 0.3455959125047594);
        setDoubleField(term1, term1.getClass(), "maxX", 0.5523635872663106);
        setDoubleField(term1, term1.getClass(), "maxY", 0.544608645520025);
        Class<? extends Object> term172 = Class.forName((String) "mil.nga.geopackage.extension.nga.scale.TileScalingType");
        Field term171 = ((Class) term172).getDeclaredField((String) "OUT");
        ((Field) term171).setAccessible(true);
        enum0 = ((Field) term171).get((Object) null);
        term31 = new Long(2442117782898005296L);
        term33 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        argTypes[1] = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScalingType");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Long");
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = enum0;
        args[2] = term31;
        args[3] = term33;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


