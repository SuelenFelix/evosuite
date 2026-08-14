package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DGIWGValidate_primaryKey_156928551516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32582;

    public DGIWGValidate_primaryKey_156928551516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32582 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term32582, term32582.getClass(), "contents", null);
        setField(term32582, term32582.getClass(), "tableName", "KDdRNhZmnU");
        setField(term32582, term32582.getClass(), "srs", null);
        setLongField(term32582, term32582.getClass(), "srsId", -4325723315152823407L);
        setDoubleField(term32582, term32582.getClass(), "minX", 0.13238746331190498);
        setDoubleField(term32582, term32582.getClass(), "minY", 0.3455959125047594);
        setDoubleField(term32582, term32582.getClass(), "maxX", 0.5523635872663106);
        setDoubleField(term32582, term32582.getClass(), "maxY", 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        Object[] args = new Object[1];
        args[0] = term32582;
        callMethod(klass, "primaryKey", argTypes, null, args);
    }

};


