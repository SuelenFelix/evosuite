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

public class TileMatrix_getPixelYSize_150441235743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;

    public TileMatrix_getPixelYSize_150441235743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term949 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term949, term949.getClass(), "contents", null);
        setField(term949, term949.getClass(), "tableName", null);
        setLongField(term949, term949.getClass(), "zoomLevel", 0L);
        setLongField(term949, term949.getClass(), "matrixWidth", 0L);
        setLongField(term949, term949.getClass(), "matrixHeight", 0L);
        setLongField(term949, term949.getClass(), "tileWidth", 0L);
        setLongField(term949, term949.getClass(), "tileHeight", 0L);
        setDoubleField(term949, term949.getClass(), "pixelXSize", 0.0);
        setDoubleField(term949, term949.getClass(), "pixelYSize", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelYSize", argTypes, term949, args);
    }

};


