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

public class TileMatrix_setPixelXSize_169339001042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term939;
     Object term947;

    public TileMatrix_setPixelXSize_169339001042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term939 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term939, term939.getClass(), "contents", null);
        setField(term939, term939.getClass(), "tableName", null);
        setLongField(term939, term939.getClass(), "zoomLevel", 0L);
        setLongField(term939, term939.getClass(), "matrixWidth", 0L);
        setLongField(term939, term939.getClass(), "matrixHeight", 0L);
        setLongField(term939, term939.getClass(), "tileWidth", 0L);
        setLongField(term939, term939.getClass(), "tileHeight", 0L);
        setDoubleField(term939, term939.getClass(), "pixelXSize", 0.0);
        setDoubleField(term939, term939.getClass(), "pixelYSize", 0.0);
        term947 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term947;
        callMethod(klass, "setPixelXSize", argTypes, term939, args);
    }

};


