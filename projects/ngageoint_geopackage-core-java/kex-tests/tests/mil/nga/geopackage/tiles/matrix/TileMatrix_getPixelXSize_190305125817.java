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

public class TileMatrix_getPixelXSize_190305125817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515;

    public TileMatrix_getPixelXSize_190305125817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term515, term515.getClass(), "contents", null);
        setField(term515, term515.getClass(), "tableName", "tbcdzjIfER");
        setLongField(term515, term515.getClass(), "zoomLevel", 4474998035090263139L);
        setLongField(term515, term515.getClass(), "matrixWidth", 2848819812340321742L);
        setLongField(term515, term515.getClass(), "matrixHeight", -8876856890348836498L);
        setLongField(term515, term515.getClass(), "tileWidth", 846579494941632714L);
        setLongField(term515, term515.getClass(), "tileHeight", 6689117472719450333L);
        setDoubleField(term515, term515.getClass(), "pixelXSize", 0.2852810965221698);
        setDoubleField(term515, term515.getClass(), "pixelYSize", 0.6300849762307866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelXSize", argTypes, term515, args);
    }

};


