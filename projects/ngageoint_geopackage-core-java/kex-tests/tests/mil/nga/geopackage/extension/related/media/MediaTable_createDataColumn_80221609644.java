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
import java.lang.Integer;

public class MediaTable_createDataColumn_80221609644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7711;
     Object term7712;

    public MediaTable_createDataColumn_80221609644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7711 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term7711, term7711.getClass(), "relationName", null);
        setField(term7711, term7711.getClass(), "dataType", null);
        setField(term7711, term7711.getClass(), "columns", null);
        setField(term7711, term7711.getClass(), "constraints", null);
        setField(term7711, term7711.getClass(), "contents", null);
        term7712 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7712;
        callMethod(klass, "createDataColumn", argTypes, term7711, args);
    }

};


