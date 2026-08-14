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

public class MediaTableMetadata_create_46206915222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34599;
     Object term34601;

    public MediaTableMetadata_create_46206915222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34599 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term34599, term34599.getClass(), "tableName", null);
        setField(term34599, term34599.getClass(), "dataType", null);
        setField(term34599, term34599.getClass(), "identifier", null);
        setField(term34599, term34599.getClass(), "description", null);
        setField(term34599, term34599.getClass(), "idColumnName", null);
        setBooleanField(term34599, term34599.getClass(), "autoincrement", false);
        setField(term34599, term34599.getClass(), "additionalColumns", null);
        setField(term34599, term34599.getClass(), "columns", null);
        term34601 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34601;
        callMethod(klass, "create", argTypes, term34599, args);
    }

};


