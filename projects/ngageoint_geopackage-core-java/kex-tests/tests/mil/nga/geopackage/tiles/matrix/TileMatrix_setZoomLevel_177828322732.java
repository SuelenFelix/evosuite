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

public class TileMatrix_setZoomLevel_177828322732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849;
     Object term857;

    public TileMatrix_setZoomLevel_177828322732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term849, term849.getClass(), "contents", null);
        setField(term849, term849.getClass(), "tableName", null);
        setLongField(term849, term849.getClass(), "zoomLevel", 0L);
        setLongField(term849, term849.getClass(), "matrixWidth", 0L);
        setLongField(term849, term849.getClass(), "matrixHeight", 0L);
        setLongField(term849, term849.getClass(), "tileWidth", 0L);
        setLongField(term849, term849.getClass(), "tileHeight", 0L);
        setDoubleField(term849, term849.getClass(), "pixelXSize", 0.0);
        setDoubleField(term849, term849.getClass(), "pixelYSize", 0.0);
        term857 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term857;
        callMethod(klass, "setZoomLevel", argTypes, term849, args);
    }

};


