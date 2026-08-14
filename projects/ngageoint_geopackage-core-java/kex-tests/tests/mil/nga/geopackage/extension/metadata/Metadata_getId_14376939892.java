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

public class Metadata_getId_14376939892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public Metadata_getId_14376939892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term91, term91.getClass(), "id", 6375119433582206027L);
        setField(term91, term91.getClass(), "scope", "jJCZpVmanW");
        setField(term91, term91.getClass(), "standardUri", "EGtDIRbSSb");
        setField(term91, term91.getClass(), "mimeType", "SzjVpOQTyS");
        setField(term91, term91.getClass(), "metadata", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term91, args);
    }

};


