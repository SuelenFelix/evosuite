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

public class TileMatrix_getId_14661175832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;

    public TileMatrix_getId_14661175832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term31, term31.getClass(), "contents", null);
        setField(term31, term31.getClass(), "tableName", "sjlJAEtRrb");
        setLongField(term31, term31.getClass(), "zoomLevel", 7411271909051562686L);
        setLongField(term31, term31.getClass(), "matrixWidth", 4872422362414183754L);
        setLongField(term31, term31.getClass(), "matrixHeight", 6811161968424632369L);
        setLongField(term31, term31.getClass(), "tileWidth", -7237588299778557629L);
        setLongField(term31, term31.getClass(), "tileHeight", 6967924379644551255L);
        setDoubleField(term31, term31.getClass(), "pixelXSize", 0.5523635872663106);
        setDoubleField(term31, term31.getClass(), "pixelYSize", 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31, args);
    }

};


