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

public class TileGrid_count_16674122209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6154;

    public TileGrid_count_16674122209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6154 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6154, term6154.getClass(), "minX", -1571034605670661708L);
        setLongField(term6154, term6154.getClass(), "maxX", -7983954942068142191L);
        setLongField(term6154, term6154.getClass(), "minY", 2274723545906746965L);
        setLongField(term6154, term6154.getClass(), "maxY", 1353683663053784647L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "count", argTypes, term6154, args);
    }

};


