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

public class DGIWGMetadata_createMetadataReference_2834617585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum55;

    public DGIWGMetadata_createMetadataReference_2834617585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35236 = Class.forName((String) "mil.nga.geopackage.extension.metadata.reference.ReferenceScopeType");
        Field term35235 = ((Class) term35236).getDeclaredField((String) "COLUMN");
        ((Field) term35235).setAccessible(true);
        enum55 = ((Field) term35235).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.reference.ReferenceScopeType");
        Object[] args = new Object[1];
        args[0] = enum55;
        callMethod(klass, "createMetadataReference", argTypes, null, args);
    }

};


