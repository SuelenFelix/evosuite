package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExtensionManager_deleteMetadataExtension_119279341449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;

    public ExtensionManager_deleteMetadataExtension_119279341449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term561, term561.getClass(), "communityExtensions", null);
        setField(term561, term561.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deleteMetadataExtension", argTypes, term561, args);
    }

};


