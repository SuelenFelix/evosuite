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

public class DGIWGValidationError_getTable_51309413410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11304;

    public DGIWGValidationError_getTable_51309413410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11464 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term11463 = ((Class) term11464).getDeclaredField((String) "METADATA_USER");
        ((Field) term11463).setAccessible(true);
        Object enum29 = ((Field) term11463).get((Object) null);
        Object term11418 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11418, term11418.getClass(), "column", "");
        setField(term11418, term11418.getClass(), "value", "");
        ArrayList term11416 = new ArrayList();
        ((ArrayList) term11416).add(term11418);
        term11304 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term11304, term11304.getClass(), "table", "whBvTVIIlC");
        setField(term11304, term11304.getClass(), "column", "IgRJUzaCwW");
        setField(term11304, term11304.getClass(), "value", "JUmudUmaaV");
        setField(term11304, term11304.getClass(), "constraint", "KoyGrUJeJW");
        setField(term11304, term11304.getClass(), "requirement", enum29);
        setField(term11304, term11304.getClass(), "primaryKeys", term11416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTable", argTypes, term11304, args);
    }

};


