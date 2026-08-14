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

public class SimpleAttributesTableMetadata_create_51701574616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14085;

    public SimpleAttributesTableMetadata_create_51701574616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14085 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term14085, term14085.getClass(), "tableName", null);
        setField(term14085, term14085.getClass(), "dataType", null);
        setField(term14085, term14085.getClass(), "identifier", null);
        setField(term14085, term14085.getClass(), "description", null);
        setField(term14085, term14085.getClass(), "idColumnName", null);
        setBooleanField(term14085, term14085.getClass(), "autoincrement", false);
        setField(term14085, term14085.getClass(), "additionalColumns", null);
        setField(term14085, term14085.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "create", argTypes, term14085, args);
    }

};


