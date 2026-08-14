package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class AttributesColumn_createPrimaryKeyColumn_31355716322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932;
     Object term938;
     Object term940;

    public AttributesColumn_createPrimaryKeyColumn_31355716322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term932 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term932, term932.getClass(), "index", 0);
        setField(term932, term932.getClass(), "name", null);
        setField(term932, term932.getClass(), "max", null);
        setBooleanField(term932, term932.getClass(), "notNull", false);
        setField(term932, term932.getClass(), "defaultValue", null);
        setBooleanField(term932, term932.getClass(), "primaryKey", false);
        setBooleanField(term932, term932.getClass(), "autoincrement", false);
        setBooleanField(term932, term932.getClass(), "unique", false);
        setField(term932, term932.getClass(), "type", null);
        setField(term932, term932.getClass(), "dataType", null);
        setField(term932, term932.getClass(), "constraints", null);
        setField(term932, term932.getClass(), "schema", null);
        term938 = new Integer(0);
        term940 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term938;
        args[1] = null;
        args[2] = term940;
        callMethod(klass, "createPrimaryKeyColumn", argTypes, term932, args);
    }

};


