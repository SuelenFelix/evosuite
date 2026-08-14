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
import java.lang.Boolean;

public class TileMatrix_validateValues_122882287122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term723;
     Object term725;

    public TileMatrix_validateValues_122882287122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term691, term691.getClass(), "contents", null);
        setField(term691, term691.getClass(), "tableName", "eZFUvlxvGV");
        setLongField(term691, term691.getClass(), "zoomLevel", -685023850445639859L);
        setLongField(term691, term691.getClass(), "matrixWidth", -6950146046121430355L);
        setLongField(term691, term691.getClass(), "matrixHeight", 1667122142089513324L);
        setLongField(term691, term691.getClass(), "tileWidth", -6342139649364011743L);
        setLongField(term691, term691.getClass(), "tileHeight", -4924950707540628022L);
        setDoubleField(term691, term691.getClass(), "pixelXSize", 0.25937345430928016);
        setDoubleField(term691, term691.getClass(), "pixelYSize", 0.5873228247510078);
        term723 = new Long(-4393710401270724527L);
        term725 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "BYqFIqCKAV";
        args[1] = term723;
        args[2] = term725;
        callMethod(klass, "validateValues", argTypes, term691, args);
    }

};


