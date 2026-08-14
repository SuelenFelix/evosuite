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

public class TileMatrix_getZoomLevel_1017523731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841;

    public TileMatrix_getZoomLevel_1017523731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term841, term841.getClass(), "contents", null);
        setField(term841, term841.getClass(), "tableName", null);
        setLongField(term841, term841.getClass(), "zoomLevel", 0L);
        setLongField(term841, term841.getClass(), "matrixWidth", 0L);
        setLongField(term841, term841.getClass(), "matrixHeight", 0L);
        setLongField(term841, term841.getClass(), "tileWidth", 0L);
        setLongField(term841, term841.getClass(), "tileHeight", 0L);
        setDoubleField(term841, term841.getClass(), "pixelXSize", 0.0);
        setDoubleField(term841, term841.getClass(), "pixelYSize", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel", argTypes, term841, args);
    }

};


