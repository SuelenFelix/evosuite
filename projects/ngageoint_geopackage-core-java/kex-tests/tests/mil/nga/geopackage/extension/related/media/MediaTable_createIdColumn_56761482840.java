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

public class MediaTable_createIdColumn_56761482840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7699;
     Object term7700;

    public MediaTable_createIdColumn_56761482840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7699 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        setField(term7699, term7699.getClass(), "relationName", null);
        setField(term7699, term7699.getClass(), "dataType", null);
        setField(term7699, term7699.getClass(), "columns", null);
        setField(term7699, term7699.getClass(), "constraints", null);
        setField(term7699, term7699.getClass(), "contents", null);
        term7700 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7700;
        callMethod(klass, "createIdColumn", argTypes, term7699, args);
    }

};


