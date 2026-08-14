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

public class DGIWGValidationError_init_1909229931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum20;

    public DGIWGValidationError_init_1909229931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6850 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term6849 = ((Class) term6850).getDeclaredField((String) "EXTENSIONS_NOT_ALLOWED");
        ((Field) term6849).setAccessible(true);
        enum20 = ((Field) term6849).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Number");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Object[] args = new Object[5];
        args[0] = "EGtDIRbSSb";
        args[1] = "SzjVpOQTyS";
        args[2] = null;
        args[3] = "MjGYSRKTNF";
        args[4] = enum20;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


