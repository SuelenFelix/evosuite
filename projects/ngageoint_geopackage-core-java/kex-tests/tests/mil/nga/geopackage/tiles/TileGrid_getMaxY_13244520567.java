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

public class TileGrid_getMaxY_13244520567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6142;

    public TileGrid_getMaxY_13244520567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6142 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6142, term6142.getClass(), "minX", 9214973322210954344L);
        setLongField(term6142, term6142.getClass(), "maxX", 3662777917800385964L);
        setLongField(term6142, term6142.getClass(), "minY", -7005300544167632229L);
        setLongField(term6142, term6142.getClass(), "maxY", -278716491237139968L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxY", argTypes, term6142, args);
    }

};


