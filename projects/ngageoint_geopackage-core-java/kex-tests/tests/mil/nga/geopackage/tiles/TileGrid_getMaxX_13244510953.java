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

public class TileGrid_getMaxX_13244510953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6118;

    public TileGrid_getMaxX_13244510953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6118 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6118, term6118.getClass(), "minX", -3225860270104198596L);
        setLongField(term6118, term6118.getClass(), "maxX", -1164342036939643746L);
        setLongField(term6118, term6118.getClass(), "minY", -7013378340043571457L);
        setLongField(term6118, term6118.getClass(), "maxY", -3279534582096707294L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxX", argTypes, term6118, args);
    }

};


