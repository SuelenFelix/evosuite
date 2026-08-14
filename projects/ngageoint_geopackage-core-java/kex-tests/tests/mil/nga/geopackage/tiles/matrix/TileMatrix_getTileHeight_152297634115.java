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

public class TileMatrix_getTileHeight_152297634115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;

    public TileMatrix_getTileHeight_152297634115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term453, term453.getClass(), "contents", null);
        setField(term453, term453.getClass(), "tableName", "aJlieCFVtF");
        setLongField(term453, term453.getClass(), "zoomLevel", -7291743527973326814L);
        setLongField(term453, term453.getClass(), "matrixWidth", -5963439350418910964L);
        setLongField(term453, term453.getClass(), "matrixHeight", 9013624480170062917L);
        setLongField(term453, term453.getClass(), "tileWidth", 7862575738391801707L);
        setLongField(term453, term453.getClass(), "tileHeight", 50358265865610362L);
        setDoubleField(term453, term453.getClass(), "pixelXSize", 0.10667076642995188);
        setDoubleField(term453, term453.getClass(), "pixelYSize", 0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileHeight", argTypes, term453, args);
    }

};


