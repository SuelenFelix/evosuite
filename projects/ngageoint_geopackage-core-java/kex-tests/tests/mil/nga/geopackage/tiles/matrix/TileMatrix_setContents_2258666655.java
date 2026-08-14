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

public class TileMatrix_setContents_2258666655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public TileMatrix_setContents_2258666655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term145, term145.getClass(), "contents", null);
        setField(term145, term145.getClass(), "tableName", "EGtDIRbSSb");
        setLongField(term145, term145.getClass(), "zoomLevel", -2585684163342970173L);
        setLongField(term145, term145.getClass(), "matrixWidth", 8059786003080744426L);
        setLongField(term145, term145.getClass(), "matrixHeight", -4365849114644724155L);
        setLongField(term145, term145.getClass(), "tileWidth", 2486810210675247493L);
        setLongField(term145, term145.getClass(), "tileHeight", 7009926388951271268L);
        setDoubleField(term145, term145.getClass(), "pixelXSize", 0.6076495596892013);
        setDoubleField(term145, term145.getClass(), "pixelYSize", 0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContents", argTypes, term145, args);
    }

};


