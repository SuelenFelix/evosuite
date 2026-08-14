package mil.nga.geopackage.extension.nga;

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
import static mil.nga.geopackage.extension.nga.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NGAExtensions_deletePropertiesExtension_36966345315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3636;

    public NGAExtensions_deletePropertiesExtension_36966345315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3636 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.NGAExtensions"));
        setField(term3636, term3636.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.NGAExtensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deletePropertiesExtension", argTypes, term3636, args);
    }

};


