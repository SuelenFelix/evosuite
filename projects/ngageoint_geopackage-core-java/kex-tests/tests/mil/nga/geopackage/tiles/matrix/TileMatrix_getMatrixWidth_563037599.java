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

public class TileMatrix_getMatrixWidth_563037599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public TileMatrix_getMatrixWidth_563037599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term267, term267.getClass(), "contents", null);
        setField(term267, term267.getClass(), "tableName", "RMFIsYGgne");
        setLongField(term267, term267.getClass(), "zoomLevel", -6292278961887936280L);
        setLongField(term267, term267.getClass(), "matrixWidth", -6645965768855543712L);
        setLongField(term267, term267.getClass(), "matrixHeight", 4784595517102746672L);
        setLongField(term267, term267.getClass(), "tileWidth", -7612550318181586304L);
        setLongField(term267, term267.getClass(), "tileHeight", -2170847986967241072L);
        setDoubleField(term267, term267.getClass(), "pixelXSize", 0.9828442029246764);
        setDoubleField(term267, term267.getClass(), "pixelYSize", 0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatrixWidth", argTypes, term267, args);
    }

};


