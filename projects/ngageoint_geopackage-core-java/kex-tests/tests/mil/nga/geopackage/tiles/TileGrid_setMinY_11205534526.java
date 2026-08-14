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

public class TileGrid_setMinY_11205534526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6135;
     Object term6140;

    public TileGrid_setMinY_11205534526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6135 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6135, term6135.getClass(), "minX", 4552367707739103094L);
        setLongField(term6135, term6135.getClass(), "maxX", -6001151456088965547L);
        setLongField(term6135, term6135.getClass(), "minY", 1740732617708040141L);
        setLongField(term6135, term6135.getClass(), "maxY", 3472971833455746664L);
        term6140 = new Long(3731931947533293029L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6140;
        callMethod(klass, "setMinY", argTypes, term6135, args);
    }

};


