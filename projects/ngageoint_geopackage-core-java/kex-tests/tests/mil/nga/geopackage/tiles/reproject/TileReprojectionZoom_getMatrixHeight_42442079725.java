package mil.nga.geopackage.tiles.reproject;

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
import static mil.nga.geopackage.tiles.reproject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileReprojectionZoom_getMatrixHeight_42442079725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;

    public TileReprojectionZoom_getMatrixHeight_42442079725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term377, term377.getClass(), "zoom", 0L);
        setField(term377, term377.getClass(), "toZoom", null);
        setField(term377, term377.getClass(), "matrixWidth", null);
        setField(term377, term377.getClass(), "matrixHeight", null);
        setField(term377, term377.getClass(), "tileWidth", null);
        setField(term377, term377.getClass(), "tileHeight", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatrixHeight", argTypes, term377, args);
    }

};


