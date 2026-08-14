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

public class AttributesTableMetadata_createTyped_91802964557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4758;

    public AttributesTableMetadata_createTyped_91802964557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4758 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term4758, term4758.getClass(), "constraints", null);
        setField(term4758, term4758.getClass(), "tableName", null);
        setField(term4758, term4758.getClass(), "dataType", null);
        setField(term4758, term4758.getClass(), "identifier", null);
        setField(term4758, term4758.getClass(), "description", null);
        setField(term4758, term4758.getClass(), "idColumnName", null);
        setBooleanField(term4758, term4758.getClass(), "autoincrement", false);
        setField(term4758, term4758.getClass(), "additionalColumns", null);
        setField(term4758, term4758.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createTyped", argTypes, term4758, args);
    }

};


