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

public class DGIWGValidationError_init_20301318970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum19;

    public DGIWGValidationError_init_20301318970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6422 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term6421 = ((Class) term6422).getDeclaredField((String) "ZOOM_MATRIX_SETS_MULTIPLE");
        ((Field) term6421).setAccessible(true);
        enum19 = ((Field) term6421).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Object[] args = new Object[5];
        args[0] = "sjlJAEtRrb";
        args[1] = "MuLcgQHgqz";
        args[2] = "xxtlPwDYFs";
        args[3] = "jJCZpVmanW";
        args[4] = enum19;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


