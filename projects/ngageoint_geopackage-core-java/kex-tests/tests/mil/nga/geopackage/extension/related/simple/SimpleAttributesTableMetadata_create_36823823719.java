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

public class SimpleAttributesTableMetadata_create_36823823719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1568;
     Object term1570;

    public SimpleAttributesTableMetadata_create_36823823719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1568 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term1568, term1568.getClass(), "tableName", null);
        setField(term1568, term1568.getClass(), "dataType", null);
        setField(term1568, term1568.getClass(), "identifier", null);
        setField(term1568, term1568.getClass(), "description", null);
        setField(term1568, term1568.getClass(), "idColumnName", null);
        setBooleanField(term1568, term1568.getClass(), "autoincrement", false);
        setField(term1568, term1568.getClass(), "additionalColumns", null);
        setField(term1568, term1568.getClass(), "columns", null);
        term1570 = new Boolean(false);
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
        args[2] = term1570;
        args[3] = null;
        callMethod(klass, "create", argTypes, term1568, args);
    }

};


