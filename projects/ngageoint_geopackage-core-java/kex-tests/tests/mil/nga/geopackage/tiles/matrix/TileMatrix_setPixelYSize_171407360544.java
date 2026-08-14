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

public class TileMatrix_setPixelYSize_171407360544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;
     Object term965;

    public TileMatrix_setPixelYSize_171407360544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term957 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term957, term957.getClass(), "contents", null);
        setField(term957, term957.getClass(), "tableName", null);
        setLongField(term957, term957.getClass(), "zoomLevel", 0L);
        setLongField(term957, term957.getClass(), "matrixWidth", 0L);
        setLongField(term957, term957.getClass(), "matrixHeight", 0L);
        setLongField(term957, term957.getClass(), "tileWidth", 0L);
        setLongField(term957, term957.getClass(), "tileHeight", 0L);
        setDoubleField(term957, term957.getClass(), "pixelXSize", 0.0);
        setDoubleField(term957, term957.getClass(), "pixelYSize", 0.0);
        term965 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term965;
        callMethod(klass, "setPixelYSize", argTypes, term957, args);
    }

};


