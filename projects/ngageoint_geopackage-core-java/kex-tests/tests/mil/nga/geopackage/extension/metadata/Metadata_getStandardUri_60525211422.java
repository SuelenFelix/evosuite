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

public class Metadata_getStandardUri_60525211422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3426;

    public Metadata_getStandardUri_60525211422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3426 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term3426, term3426.getClass(), "id", 0L);
        setField(term3426, term3426.getClass(), "scope", null);
        setField(term3426, term3426.getClass(), "standardUri", null);
        setField(term3426, term3426.getClass(), "mimeType", null);
        setField(term3426, term3426.getClass(), "metadata", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardUri", argTypes, term3426, args);
    }

};


