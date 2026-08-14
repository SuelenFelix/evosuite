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

public class AttributesColumn_createColumn_47540344410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;

    public AttributesColumn_createColumn_47540344410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term464, term464.getClass(), "index", 0);
        setField(term464, term464.getClass(), "name", null);
        setField(term464, term464.getClass(), "max", null);
        setBooleanField(term464, term464.getClass(), "notNull", false);
        setField(term464, term464.getClass(), "defaultValue", null);
        setBooleanField(term464, term464.getClass(), "primaryKey", false);
        setBooleanField(term464, term464.getClass(), "autoincrement", false);
        setBooleanField(term464, term464.getClass(), "unique", false);
        setField(term464, term464.getClass(), "type", null);
        setField(term464, term464.getClass(), "dataType", null);
        setField(term464, term464.getClass(), "constraints", null);
        setField(term464, term464.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = Class.forName("java.lang.Long");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createColumn", argTypes, term464, args);
    }

};


