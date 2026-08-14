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

public class TileMatrix_setMatrixHeight_42973721612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;
     Object term379;

    public TileMatrix_setMatrixHeight_42973721612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term359, term359.getClass(), "contents", null);
        setField(term359, term359.getClass(), "tableName", "MxlszYVzRf");
        setLongField(term359, term359.getClass(), "zoomLevel", -3838084482494604218L);
        setLongField(term359, term359.getClass(), "matrixWidth", 3892018155439224435L);
        setLongField(term359, term359.getClass(), "matrixHeight", 5953383087795962419L);
        setLongField(term359, term359.getClass(), "tileWidth", 7994303628307559416L);
        setLongField(term359, term359.getClass(), "tileHeight", 2443640364875054177L);
        setDoubleField(term359, term359.getClass(), "pixelXSize", 0.43692187681405226);
        setDoubleField(term359, term359.getClass(), "pixelYSize", 0.7633268466829064);
        term379 = new Long(-1610676979013636850L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term379;
        callMethod(klass, "setMatrixHeight", argTypes, term359, args);
    }

};


