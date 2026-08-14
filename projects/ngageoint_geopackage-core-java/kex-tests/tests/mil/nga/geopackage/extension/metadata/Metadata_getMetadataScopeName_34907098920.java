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

public class Metadata_getMetadataScopeName_34907098920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3422;

    public Metadata_getMetadataScopeName_34907098920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3422 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term3422, term3422.getClass(), "id", 0L);
        setField(term3422, term3422.getClass(), "scope", null);
        setField(term3422, term3422.getClass(), "standardUri", null);
        setField(term3422, term3422.getClass(), "mimeType", null);
        setField(term3422, term3422.getClass(), "metadata", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetadataScopeName", argTypes, term3422, args);
    }

};


