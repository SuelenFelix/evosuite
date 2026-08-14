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

public class TileMatrix_setZoomLevel_17782832278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;
     Object term255;

    public TileMatrix_setZoomLevel_17782832278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term235, term235.getClass(), "contents", null);
        setField(term235, term235.getClass(), "tableName", "hRNSzYYIrc");
        setLongField(term235, term235.getClass(), "zoomLevel", 6617340557564669657L);
        setLongField(term235, term235.getClass(), "matrixWidth", 1439298019805881866L);
        setLongField(term235, term235.getClass(), "matrixHeight", -8708192233349544946L);
        setLongField(term235, term235.getClass(), "tileWidth", 5907001541142728739L);
        setLongField(term235, term235.getClass(), "tileHeight", 4178434741742309755L);
        setDoubleField(term235, term235.getClass(), "pixelXSize", 0.7031006357544823);
        setDoubleField(term235, term235.getClass(), "pixelYSize", 0.9527281779865117);
        term255 = new Long(-2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term255;
        callMethod(klass, "setZoomLevel", argTypes, term235, args);
    }

};


