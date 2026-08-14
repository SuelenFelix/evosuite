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

public class MediaTableMetadata_create_8727517705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3343;
     Object term3345;

    public MediaTableMetadata_create_8727517705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3343 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term3343, term3343.getClass(), "tableName", null);
        setField(term3343, term3343.getClass(), "dataType", null);
        setField(term3343, term3343.getClass(), "identifier", null);
        setField(term3343, term3343.getClass(), "description", null);
        setField(term3343, term3343.getClass(), "idColumnName", null);
        setBooleanField(term3343, term3343.getClass(), "autoincrement", false);
        setField(term3343, term3343.getClass(), "additionalColumns", null);
        setField(term3343, term3343.getClass(), "columns", null);
        term3345 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3345;
        args[2] = null;
        callMethod(klass, "create", argTypes, term3343, args);
    }

};


