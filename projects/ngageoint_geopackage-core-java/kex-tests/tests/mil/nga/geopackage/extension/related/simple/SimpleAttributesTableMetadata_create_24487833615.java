package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class SimpleAttributesTableMetadata_create_24487833615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14081;
     Object term14083;

    public SimpleAttributesTableMetadata_create_24487833615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14081 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term14081, term14081.getClass(), "tableName", null);
        setField(term14081, term14081.getClass(), "dataType", null);
        setField(term14081, term14081.getClass(), "identifier", null);
        setField(term14081, term14081.getClass(), "description", null);
        setField(term14081, term14081.getClass(), "idColumnName", null);
        setBooleanField(term14081, term14081.getClass(), "autoincrement", false);
        setField(term14081, term14081.getClass(), "additionalColumns", null);
        setField(term14081, term14081.getClass(), "columns", null);
        term14083 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14083;
        callMethod(klass, "create", argTypes, term14081, args);
    }

};


