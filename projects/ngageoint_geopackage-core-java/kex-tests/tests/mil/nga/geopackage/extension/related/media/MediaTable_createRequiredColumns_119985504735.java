package mil.nga.geopackage.extension.related.media;

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
import static mil.nga.geopackage.extension.related.media.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class MediaTable_createRequiredColumns_119985504735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2459;
     Object term2460;

    public MediaTable_createRequiredColumns_119985504735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2459 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term2459, term2459.getClass(), "relationName", null);
        setField(term2459, term2459.getClass(), "dataType", null);
        setField(term2459, term2459.getClass(), "columns", null);
        setField(term2459, term2459.getClass(), "constraints", null);
        setField(term2459, term2459.getClass(), "contents", null);
        term2460 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2460;
        callMethod(klass, "createRequiredColumns", argTypes, term2459, args);
    }

};


