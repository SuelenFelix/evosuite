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

public class TileMatrix_getTileWidth_40646950613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public TileMatrix_getTileWidth_40646950613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term391, term391.getClass(), "contents", null);
        setField(term391, term391.getClass(), "tableName", "LQFpaHEwXR");
        setLongField(term391, term391.getClass(), "zoomLevel", 2062173786000223358L);
        setLongField(term391, term391.getClass(), "matrixWidth", -8658027316505137504L);
        setLongField(term391, term391.getClass(), "matrixHeight", 414749984815662075L);
        setLongField(term391, term391.getClass(), "tileWidth", 463622836963501975L);
        setLongField(term391, term391.getClass(), "tileHeight", 305759998609888272L);
        setDoubleField(term391, term391.getClass(), "pixelXSize", 0.13481025392611334);
        setDoubleField(term391, term391.getClass(), "pixelYSize", 0.3800088629986428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileWidth", argTypes, term391, args);
    }

};


