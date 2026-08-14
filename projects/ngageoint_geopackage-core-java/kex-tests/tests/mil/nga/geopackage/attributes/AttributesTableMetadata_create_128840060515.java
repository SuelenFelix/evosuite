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

public class AttributesTableMetadata_create_128840060515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2219;
     Object term2221;

    public AttributesTableMetadata_create_128840060515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2219 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term2219, term2219.getClass(), "constraints", null);
        setField(term2219, term2219.getClass(), "tableName", null);
        setField(term2219, term2219.getClass(), "dataType", null);
        setField(term2219, term2219.getClass(), "identifier", null);
        setField(term2219, term2219.getClass(), "description", null);
        setField(term2219, term2219.getClass(), "idColumnName", null);
        setBooleanField(term2219, term2219.getClass(), "autoincrement", false);
        setField(term2219, term2219.getClass(), "additionalColumns", null);
        setField(term2219, term2219.getClass(), "columns", null);
        term2221 = new Boolean(false);
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
        args[2] = term2221;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "create", argTypes, term2219, args);
    }

};


