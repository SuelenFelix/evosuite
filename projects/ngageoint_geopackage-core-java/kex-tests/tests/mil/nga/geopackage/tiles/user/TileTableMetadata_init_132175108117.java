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

public class TileTableMetadata_init_132175108117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5168;
     Object term5170;
     Object term5172;

    public TileTableMetadata_init_132175108117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5168 = new Boolean(false);
        term5170 = new Long(-872011222785455006L);
        term5172 = new Long(5806367330808555223L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[5] = long.class;
        Object[] args = new Object[6];
        args[0] = "wBGfLpNNiZ";
        args[1] = term5168;
        args[2] = null;
        args[3] = term5170;
        args[4] = null;
        args[5] = term5172;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


