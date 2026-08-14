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

public class TileGrid_setMinX_11205524912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6111;
     Object term6116;

    public TileGrid_setMinX_11205524912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6111 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6111, term6111.getClass(), "minX", -2136893352275781569L);
        setLongField(term6111, term6111.getClass(), "maxX", -9147545274054597570L);
        setLongField(term6111, term6111.getClass(), "minY", -8398381579707958144L);
        setLongField(term6111, term6111.getClass(), "maxY", -2195061939206930224L);
        term6116 = new Long(4525924047960478347L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6116;
        callMethod(klass, "setMinX", argTypes, term6111, args);
    }

};


