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
import java.lang.Boolean;

public class AttributesColumn_createColumn_176078019112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term574;

    public AttributesColumn_createColumn_176078019112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term568, term568.getClass(), "index", 0);
        setField(term568, term568.getClass(), "name", null);
        setField(term568, term568.getClass(), "max", null);
        setBooleanField(term568, term568.getClass(), "notNull", false);
        setField(term568, term568.getClass(), "defaultValue", null);
        setBooleanField(term568, term568.getClass(), "primaryKey", false);
        setBooleanField(term568, term568.getClass(), "autoincrement", false);
        setBooleanField(term568, term568.getClass(), "unique", false);
        setField(term568, term568.getClass(), "type", null);
        setField(term568, term568.getClass(), "dataType", null);
        setField(term568, term568.getClass(), "constraints", null);
        setField(term568, term568.getClass(), "schema", null);
        term574 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term574;
        args[4] = null;
        callMethod(klass, "createColumn", argTypes, term568, args);
    }

};


