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
import java.util.ArrayList;

public class DGIWGValidationError_hashCode_98012766017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14275;

    public DGIWGValidationError_hashCode_98012766017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14444 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term14443 = ((Class) term14444).getDeclaredField((String) "EXTENSIONS_CONDITIONAL");
        ((Field) term14443).setAccessible(true);
        Object enum36 = ((Field) term14443).get((Object) null);
        ArrayList term14399 = new ArrayList();
        term14275 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term14275, term14275.getClass(), "table", "GgZWSjxjyE");
        setField(term14275, term14275.getClass(), "column", "EeBVbzjcCI");
        setField(term14275, term14275.getClass(), "value", "UfQtPRyWRC");
        setField(term14275, term14275.getClass(), "constraint", "FPvxVzzSvD");
        setField(term14275, term14275.getClass(), "requirement", enum36);
        setField(term14275, term14275.getClass(), "primaryKeys", term14399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14275, args);
    }

};


