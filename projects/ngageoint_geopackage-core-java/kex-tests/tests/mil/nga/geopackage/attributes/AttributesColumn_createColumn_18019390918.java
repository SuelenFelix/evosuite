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

public class AttributesColumn_createColumn_18019390918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;
     Object term359;

    public AttributesColumn_createColumn_18019390918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term353, term353.getClass(), "index", 0);
        setField(term353, term353.getClass(), "name", null);
        setField(term353, term353.getClass(), "max", null);
        setBooleanField(term353, term353.getClass(), "notNull", false);
        setField(term353, term353.getClass(), "defaultValue", null);
        setBooleanField(term353, term353.getClass(), "primaryKey", false);
        setBooleanField(term353, term353.getClass(), "autoincrement", false);
        setBooleanField(term353, term353.getClass(), "unique", false);
        setField(term353, term353.getClass(), "type", null);
        setField(term353, term353.getClass(), "dataType", null);
        setField(term353, term353.getClass(), "constraints", null);
        setField(term353, term353.getClass(), "schema", null);
        term359 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term359;
        args[3] = null;
        callMethod(klass, "createColumn", argTypes, term353, args);
    }

};


