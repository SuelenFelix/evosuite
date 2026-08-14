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

public class TileMatrix_getId_146611758326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801;

    public TileMatrix_getId_146611758326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term801, term801.getClass(), "contents", null);
        setField(term801, term801.getClass(), "tableName", null);
        setLongField(term801, term801.getClass(), "zoomLevel", 0L);
        setLongField(term801, term801.getClass(), "matrixWidth", 0L);
        setLongField(term801, term801.getClass(), "matrixHeight", 0L);
        setLongField(term801, term801.getClass(), "tileWidth", 0L);
        setLongField(term801, term801.getClass(), "tileHeight", 0L);
        setDoubleField(term801, term801.getClass(), "pixelXSize", 0.0);
        setDoubleField(term801, term801.getClass(), "pixelYSize", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term801, args);
    }

};


