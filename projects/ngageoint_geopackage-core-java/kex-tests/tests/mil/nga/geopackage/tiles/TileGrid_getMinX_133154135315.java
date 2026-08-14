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

public class TileGrid_getMinX_133154135315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6188;

    public TileGrid_getMinX_133154135315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6188 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6188, term6188.getClass(), "minX", 0L);
        setLongField(term6188, term6188.getClass(), "maxX", 0L);
        setLongField(term6188, term6188.getClass(), "minY", 0L);
        setLongField(term6188, term6188.getClass(), "maxY", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinX", argTypes, term6188, args);
    }

};


