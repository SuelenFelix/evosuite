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

public class AttributesColumn_createColumn_269317299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term415;
     Object term417;

    public AttributesColumn_createColumn_269317299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term409, term409.getClass(), "index", 0);
        setField(term409, term409.getClass(), "name", null);
        setField(term409, term409.getClass(), "max", null);
        setBooleanField(term409, term409.getClass(), "notNull", false);
        setField(term409, term409.getClass(), "defaultValue", null);
        setBooleanField(term409, term409.getClass(), "primaryKey", false);
        setBooleanField(term409, term409.getClass(), "autoincrement", false);
        setBooleanField(term409, term409.getClass(), "unique", false);
        setField(term409, term409.getClass(), "type", null);
        setField(term409, term409.getClass(), "dataType", null);
        setField(term409, term409.getClass(), "constraints", null);
        setField(term409, term409.getClass(), "schema", null);
        term415 = new Integer(0);
        term417 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = term415;
        args[1] = null;
        args[2] = null;
        args[3] = term417;
        args[4] = null;
        callMethod(klass, "createColumn", argTypes, term409, args);
    }

};


