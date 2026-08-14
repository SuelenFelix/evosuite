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

public class TileMatrix_setTileHeight_60859560340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;
     Object term929;

    public TileMatrix_setTileHeight_60859560340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term921, term921.getClass(), "contents", null);
        setField(term921, term921.getClass(), "tableName", null);
        setLongField(term921, term921.getClass(), "zoomLevel", 0L);
        setLongField(term921, term921.getClass(), "matrixWidth", 0L);
        setLongField(term921, term921.getClass(), "matrixHeight", 0L);
        setLongField(term921, term921.getClass(), "tileWidth", 0L);
        setLongField(term921, term921.getClass(), "tileHeight", 0L);
        setDoubleField(term921, term921.getClass(), "pixelXSize", 0.0);
        setDoubleField(term921, term921.getClass(), "pixelYSize", 0.0);
        term929 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term929;
        callMethod(klass, "setTileHeight", argTypes, term921, args);
    }

};


