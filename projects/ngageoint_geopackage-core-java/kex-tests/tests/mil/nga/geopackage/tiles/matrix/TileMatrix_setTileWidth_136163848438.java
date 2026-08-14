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

public class TileMatrix_setTileWidth_136163848438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;
     Object term911;

    public TileMatrix_setTileWidth_136163848438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term903 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term903, term903.getClass(), "contents", null);
        setField(term903, term903.getClass(), "tableName", null);
        setLongField(term903, term903.getClass(), "zoomLevel", 0L);
        setLongField(term903, term903.getClass(), "matrixWidth", 0L);
        setLongField(term903, term903.getClass(), "matrixHeight", 0L);
        setLongField(term903, term903.getClass(), "tileWidth", 0L);
        setLongField(term903, term903.getClass(), "tileHeight", 0L);
        setDoubleField(term903, term903.getClass(), "pixelXSize", 0.0);
        setDoubleField(term903, term903.getClass(), "pixelYSize", 0.0);
        term911 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term911;
        callMethod(klass, "setTileWidth", argTypes, term903, args);
    }

};


