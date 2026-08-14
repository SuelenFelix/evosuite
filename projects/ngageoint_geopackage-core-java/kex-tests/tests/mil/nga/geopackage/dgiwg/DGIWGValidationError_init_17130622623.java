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

public class DGIWGValidationError_init_17130622623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum22;

    public DGIWGValidationError_init_17130622623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7638 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term7637 = ((Class) term7638).getDeclaredField((String) "EXTENSIONS_CONDITIONAL");
        ((Field) term7637).setAccessible(true);
        enum22 = ((Field) term7637).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Object[] args = new Object[4];
        args[0] = "NRdvgJlhkX";
        args[1] = "uuaPigETmJ";
        args[2] = "MxlszYVzRf";
        args[3] = enum22;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


