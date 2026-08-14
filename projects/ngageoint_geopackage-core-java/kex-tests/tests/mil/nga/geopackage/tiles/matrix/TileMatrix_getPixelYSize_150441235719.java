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

public class TileMatrix_getPixelYSize_150441235719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;

    public TileMatrix_getPixelYSize_150441235719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term577, term577.getClass(), "contents", null);
        setField(term577, term577.getClass(), "tableName", "pCTimMblYc");
        setLongField(term577, term577.getClass(), "zoomLevel", 2135754395358000892L);
        setLongField(term577, term577.getClass(), "matrixWidth", -8085190702504231560L);
        setLongField(term577, term577.getClass(), "matrixHeight", 1672578078364590450L);
        setLongField(term577, term577.getClass(), "tileWidth", 4949335493504695457L);
        setLongField(term577, term577.getClass(), "tileHeight", -5216789073301458893L);
        setDoubleField(term577, term577.getClass(), "pixelXSize", 0.07802449704920456);
        setDoubleField(term577, term577.getClass(), "pixelYSize", 0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelYSize", argTypes, term577, args);
    }

};


