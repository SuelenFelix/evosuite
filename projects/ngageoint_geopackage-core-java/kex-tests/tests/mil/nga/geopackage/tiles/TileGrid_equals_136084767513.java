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

public class TileGrid_equals_136084767513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6174;
     Object term6179;

    public TileGrid_equals_136084767513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6174 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6174, term6174.getClass(), "minX", 9062006526792682783L);
        setLongField(term6174, term6174.getClass(), "maxX", -7400951017937830861L);
        setLongField(term6174, term6174.getClass(), "minY", -8993073054427011802L);
        setLongField(term6174, term6174.getClass(), "maxY", 2287785643837657068L);
        term6179 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6179;
        callMethod(klass, "equals", argTypes, term6174, args);
    }

};


