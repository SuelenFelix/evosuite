package mil.nga.geopackage.tiles.matrix;

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
import static mil.nga.geopackage.tiles.matrix.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class TileMatrix_validateValues_122882287146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;
     Object term983;
     Object term985;

    public TileMatrix_validateValues_122882287146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term975 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term975, term975.getClass(), "contents", null);
        setField(term975, term975.getClass(), "tableName", null);
        setLongField(term975, term975.getClass(), "zoomLevel", 0L);
        setLongField(term975, term975.getClass(), "matrixWidth", 0L);
        setLongField(term975, term975.getClass(), "matrixHeight", 0L);
        setLongField(term975, term975.getClass(), "tileWidth", 0L);
        setLongField(term975, term975.getClass(), "tileHeight", 0L);
        setDoubleField(term975, term975.getClass(), "pixelXSize", 0.0);
        setDoubleField(term975, term975.getClass(), "pixelYSize", 0.0);
        term983 = new Long(0L);
        term985 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term983;
        args[2] = term985;
        callMethod(klass, "validateValues", argTypes, term975, args);
    }

};


