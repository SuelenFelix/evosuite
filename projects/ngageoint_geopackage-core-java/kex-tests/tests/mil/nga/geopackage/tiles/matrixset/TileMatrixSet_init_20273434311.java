package mil.nga.geopackage.tiles.matrixset;

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
import static mil.nga.geopackage.tiles.matrixset.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileMatrixSet_init_20273434311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TileMatrixSet_init_20273434311() {
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


