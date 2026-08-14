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

public class SimpleAttributesTableMetadata_create_36823823718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14091;
     Object term14093;

    public SimpleAttributesTableMetadata_create_36823823718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14091 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term14091, term14091.getClass(), "tableName", null);
        setField(term14091, term14091.getClass(), "dataType", null);
        setField(term14091, term14091.getClass(), "identifier", null);
        setField(term14091, term14091.getClass(), "description", null);
        setField(term14091, term14091.getClass(), "idColumnName", null);
        setBooleanField(term14091, term14091.getClass(), "autoincrement", false);
        setField(term14091, term14091.getClass(), "additionalColumns", null);
        setField(term14091, term14091.getClass(), "columns", null);
        term14093 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term14093;
        args[3] = null;
        callMethod(klass, "create", argTypes, term14091, args);
    }

};


