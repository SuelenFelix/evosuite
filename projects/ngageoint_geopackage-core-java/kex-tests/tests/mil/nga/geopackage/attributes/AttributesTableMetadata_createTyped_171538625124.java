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

public class AttributesTableMetadata_createTyped_171538625124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136468;
     Object term136470;

    public AttributesTableMetadata_createTyped_171538625124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136468 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term136468, term136468.getClass(), "constraints", null);
        setField(term136468, term136468.getClass(), "tableName", null);
        setField(term136468, term136468.getClass(), "dataType", null);
        setField(term136468, term136468.getClass(), "identifier", null);
        setField(term136468, term136468.getClass(), "description", null);
        setField(term136468, term136468.getClass(), "idColumnName", null);
        setBooleanField(term136468, term136468.getClass(), "autoincrement", false);
        setField(term136468, term136468.getClass(), "additionalColumns", null);
        setField(term136468, term136468.getClass(), "columns", null);
        term136470 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term136470;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "createTyped", argTypes, term136468, args);
    }

};


