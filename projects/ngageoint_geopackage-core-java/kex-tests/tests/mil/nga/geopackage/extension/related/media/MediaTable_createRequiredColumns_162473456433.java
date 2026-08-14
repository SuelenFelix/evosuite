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

public class MediaTable_createRequiredColumns_162473456433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2455;
     Object term2456;

    public MediaTable_createRequiredColumns_162473456433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2455 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term2455, term2455.getClass(), "relationName", null);
        setField(term2455, term2455.getClass(), "dataType", null);
        setField(term2455, term2455.getClass(), "columns", null);
        setField(term2455, term2455.getClass(), "constraints", null);
        setField(term2455, term2455.getClass(), "contents", null);
        term2456 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2456;
        callMethod(klass, "createRequiredColumns", argTypes, term2455, args);
    }

};


