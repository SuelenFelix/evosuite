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

public class TileMatrix_getZoomLevel_101752377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public TileMatrix_getZoomLevel_101752377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term205, term205.getClass(), "contents", null);
        setField(term205, term205.getClass(), "tableName", "MjGYSRKTNF");
        setLongField(term205, term205.getClass(), "zoomLevel", -5892135042702373494L);
        setLongField(term205, term205.getClass(), "matrixWidth", 5262507301787091109L);
        setLongField(term205, term205.getClass(), "matrixHeight", -6823727938421990489L);
        setLongField(term205, term205.getClass(), "tileWidth", -484994522244390100L);
        setLongField(term205, term205.getClass(), "tileHeight", 1233889271256172047L);
        setDoubleField(term205, term205.getClass(), "pixelXSize", 0.7655020693602768);
        setDoubleField(term205, term205.getClass(), "pixelYSize", 0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel", argTypes, term205, args);
    }

};


