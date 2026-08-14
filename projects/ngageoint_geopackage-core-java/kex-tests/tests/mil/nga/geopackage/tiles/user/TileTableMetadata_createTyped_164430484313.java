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

public class TileTableMetadata_createTyped_164430484313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5056;
     Object term5058;
     Object term5060;

    public TileTableMetadata_createTyped_164430484313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5056 = new Boolean(false);
        term5058 = new Long(3752337209837437327L);
        term5060 = new Long(1860789353508856614L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[6] = long.class;
        Object[] args = new Object[7];
        args[0] = "EKjQdtKxAM";
        args[1] = "TXZAIPQJHt";
        args[2] = term5056;
        args[3] = null;
        args[4] = term5058;
        args[5] = null;
        args[6] = term5060;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


