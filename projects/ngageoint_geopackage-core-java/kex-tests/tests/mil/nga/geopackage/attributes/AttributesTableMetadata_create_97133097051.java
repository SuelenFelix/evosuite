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

public class AttributesTableMetadata_create_97133097051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138619;
     Object term138621;

    public AttributesTableMetadata_create_97133097051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138619 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138619, term138619.getClass(), "constraints", null);
        setField(term138619, term138619.getClass(), "tableName", null);
        setField(term138619, term138619.getClass(), "dataType", null);
        setField(term138619, term138619.getClass(), "identifier", null);
        setField(term138619, term138619.getClass(), "description", null);
        setField(term138619, term138619.getClass(), "idColumnName", null);
        setBooleanField(term138619, term138619.getClass(), "autoincrement", false);
        setField(term138619, term138619.getClass(), "additionalColumns", null);
        setField(term138619, term138619.getClass(), "columns", null);
        term138621 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term138621;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "create", argTypes, term138619, args);
    }

};


