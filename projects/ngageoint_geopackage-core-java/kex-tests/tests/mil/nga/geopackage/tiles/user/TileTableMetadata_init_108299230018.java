package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Long;

public class TileTableMetadata_init_108299230018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5208;
     Object term5210;
     Object term5212;

    public TileTableMetadata_init_108299230018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5208 = new Boolean(false);
        term5210 = new Long(-316468845751588286L);
        term5212 = new Long(4576699120365923235L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[4] = Class.forName("java.lang.Long");
        argTypes[5] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[6] = long.class;
        Object[] args = new Object[7];
        args[0] = "yUGCjlqgJE";
        args[1] = "PXdVZyoJyC";
        args[2] = term5208;
        args[3] = null;
        args[4] = term5210;
        args[5] = null;
        args[6] = term5212;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


