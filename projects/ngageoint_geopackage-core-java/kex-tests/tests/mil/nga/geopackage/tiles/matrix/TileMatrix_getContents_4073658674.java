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

public class TileMatrix_getContents_4073658674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;

    public TileMatrix_getContents_4073658674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term115, term115.getClass(), "contents", null);
        setField(term115, term115.getClass(), "tableName", "jJCZpVmanW");
        setLongField(term115, term115.getClass(), "zoomLevel", -316468845751588286L);
        setLongField(term115, term115.getClass(), "matrixWidth", 5127676408959197577L);
        setLongField(term115, term115.getClass(), "matrixHeight", -6573104506744284592L);
        setLongField(term115, term115.getClass(), "tileWidth", -4920224193275732920L);
        setLongField(term115, term115.getClass(), "tileHeight", 8428634514691209827L);
        setDoubleField(term115, term115.getClass(), "pixelXSize", 0.2641345529914265);
        setDoubleField(term115, term115.getClass(), "pixelYSize", 0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContents", argTypes, term115, args);
    }

};


