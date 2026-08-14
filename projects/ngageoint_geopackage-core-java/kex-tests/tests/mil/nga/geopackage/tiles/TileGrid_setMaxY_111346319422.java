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
import java.lang.Long;

public class TileGrid_setMaxY_111346319422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6229;
     Object term6234;

    public TileGrid_setMaxY_111346319422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6229 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6229, term6229.getClass(), "minX", 0L);
        setLongField(term6229, term6229.getClass(), "maxX", 0L);
        setLongField(term6229, term6229.getClass(), "minY", 0L);
        setLongField(term6229, term6229.getClass(), "maxY", 0L);
        term6234 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6234;
        callMethod(klass, "setMaxY", argTypes, term6229, args);
    }

};


