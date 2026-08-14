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
import java.lang.Double;

public class TileMatrix_validateValues_47753945647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term987;
     Object term995;

    public TileMatrix_validateValues_47753945647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term987 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term987, term987.getClass(), "contents", null);
        setField(term987, term987.getClass(), "tableName", null);
        setLongField(term987, term987.getClass(), "zoomLevel", 0L);
        setLongField(term987, term987.getClass(), "matrixWidth", 0L);
        setLongField(term987, term987.getClass(), "matrixHeight", 0L);
        setLongField(term987, term987.getClass(), "tileWidth", 0L);
        setLongField(term987, term987.getClass(), "tileHeight", 0L);
        setDoubleField(term987, term987.getClass(), "pixelXSize", 0.0);
        setDoubleField(term987, term987.getClass(), "pixelYSize", 0.0);
        term995 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term995;
        callMethod(klass, "validateValues", argTypes, term987, args);
    }

};


