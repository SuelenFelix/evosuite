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

public class AttributesColumn_createColumn_15289914526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;
     Object term252;

    public AttributesColumn_createColumn_15289914526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term246, term246.getClass(), "index", 0);
        setField(term246, term246.getClass(), "name", null);
        setField(term246, term246.getClass(), "max", null);
        setBooleanField(term246, term246.getClass(), "notNull", false);
        setField(term246, term246.getClass(), "defaultValue", null);
        setBooleanField(term246, term246.getClass(), "primaryKey", false);
        setBooleanField(term246, term246.getClass(), "autoincrement", false);
        setBooleanField(term246, term246.getClass(), "unique", false);
        setField(term246, term246.getClass(), "type", null);
        setField(term246, term246.getClass(), "dataType", null);
        setField(term246, term246.getClass(), "constraints", null);
        setField(term246, term246.getClass(), "schema", null);
        term252 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term252;
        callMethod(klass, "createColumn", argTypes, term246, args);
    }

};


