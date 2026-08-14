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

public class AttributesColumn_createColumn_11004442225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term201;

    public AttributesColumn_createColumn_11004442225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term195, term195.getClass(), "index", 0);
        setField(term195, term195.getClass(), "name", null);
        setField(term195, term195.getClass(), "max", null);
        setBooleanField(term195, term195.getClass(), "notNull", false);
        setField(term195, term195.getClass(), "defaultValue", null);
        setBooleanField(term195, term195.getClass(), "primaryKey", false);
        setBooleanField(term195, term195.getClass(), "autoincrement", false);
        setBooleanField(term195, term195.getClass(), "unique", false);
        setField(term195, term195.getClass(), "type", null);
        setField(term195, term195.getClass(), "dataType", null);
        setField(term195, term195.getClass(), "constraints", null);
        setField(term195, term195.getClass(), "schema", null);
        term201 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        Object[] args = new Object[3];
        args[0] = term201;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createColumn", argTypes, term195, args);
    }

};


