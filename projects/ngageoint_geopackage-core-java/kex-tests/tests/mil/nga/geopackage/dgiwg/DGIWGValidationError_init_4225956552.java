package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DGIWGValidationError_init_4225956552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum21;

    public DGIWGValidationError_init_4225956552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7237 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term7236 = ((Class) term7237).getDeclaredField((String) "TILE_SIZE_MATRIX");
        ((Field) term7236).setAccessible(true);
        enum21 = ((Field) term7236).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Number");
        argTypes[3] = Class.forName("java.lang.Number");
        argTypes[4] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Object[] args = new Object[5];
        args[0] = "hRNSzYYIrc";
        args[1] = "RMFIsYGgne";
        args[2] = null;
        args[3] = null;
        args[4] = enum21;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


