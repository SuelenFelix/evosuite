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

public class TileMatrix_setId_8501893127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;

    public TileMatrix_setId_8501893127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term809, term809.getClass(), "contents", null);
        setField(term809, term809.getClass(), "tableName", null);
        setLongField(term809, term809.getClass(), "zoomLevel", 0L);
        setLongField(term809, term809.getClass(), "matrixWidth", 0L);
        setLongField(term809, term809.getClass(), "matrixHeight", 0L);
        setLongField(term809, term809.getClass(), "tileWidth", 0L);
        setLongField(term809, term809.getClass(), "tileHeight", 0L);
        setDoubleField(term809, term809.getClass(), "pixelXSize", 0.0);
        setDoubleField(term809, term809.getClass(), "pixelYSize", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrixKey");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term809, args);
    }

};


