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

public class SimpleAttributesTableMetadata_create_51750380014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14079;

    public SimpleAttributesTableMetadata_create_51750380014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14079 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term14079, term14079.getClass(), "tableName", null);
        setField(term14079, term14079.getClass(), "dataType", null);
        setField(term14079, term14079.getClass(), "identifier", null);
        setField(term14079, term14079.getClass(), "description", null);
        setField(term14079, term14079.getClass(), "idColumnName", null);
        setBooleanField(term14079, term14079.getClass(), "autoincrement", false);
        setField(term14079, term14079.getClass(), "additionalColumns", null);
        setField(term14079, term14079.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term14079, args);
    }

};


