package mil.nga.geopackage.tiles;

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
import static mil.nga.geopackage.tiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileGrid_getMinX_13315413531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6106;

    public TileGrid_getMinX_13315413531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6106 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6106, term6106.getClass(), "minX", 6636235983121346803L);
        setLongField(term6106, term6106.getClass(), "maxX", 146749226579788091L);
        setLongField(term6106, term6106.getClass(), "minY", -1279670138064751276L);
        setLongField(term6106, term6106.getClass(), "maxY", -7205236974351118210L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinX", argTypes, term6106, args);
    }

};


