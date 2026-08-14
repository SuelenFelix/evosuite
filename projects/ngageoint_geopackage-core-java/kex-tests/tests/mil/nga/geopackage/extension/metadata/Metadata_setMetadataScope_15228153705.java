package mil.nga.geopackage.extension.metadata;

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
import static mil.nga.geopackage.extension.metadata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Metadata_setMetadataScope_15228153705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;
     Object enum0;

    public Metadata_setMetadataScope_15228153705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term363, term363.getClass(), "id", 7411271909051562686L);
        setField(term363, term363.getClass(), "scope", "ZiaGIbnzTs");
        setField(term363, term363.getClass(), "standardUri", "tbcdzjIfER");
        setField(term363, term363.getClass(), "mimeType", "HyxfbSQYBe");
        setField(term363, term363.getClass(), "metadata", "pCTimMblYc");
        Class<? extends Object> term2281 = Class.forName((String) "mil.nga.geopackage.extension.metadata.MetadataScopeType");
        Field term2280 = ((Class) term2281).getDeclaredField((String) "ATTRIBUTE_TYPE");
        ((Field) term2280).setAccessible(true);
        enum0 = ((Field) term2280).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.metadata.MetadataScopeType");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "setMetadataScope", argTypes, term363, args);
    }

};


