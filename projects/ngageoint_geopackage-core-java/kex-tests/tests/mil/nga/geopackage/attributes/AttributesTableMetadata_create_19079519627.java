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

public class AttributesTableMetadata_create_19079519627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683;
     Object term1685;

    public AttributesTableMetadata_create_19079519627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1683 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term1683, term1683.getClass(), "constraints", null);
        setField(term1683, term1683.getClass(), "tableName", null);
        setField(term1683, term1683.getClass(), "dataType", null);
        setField(term1683, term1683.getClass(), "identifier", null);
        setField(term1683, term1683.getClass(), "description", null);
        setField(term1683, term1683.getClass(), "idColumnName", null);
        setBooleanField(term1683, term1683.getClass(), "autoincrement", false);
        setField(term1683, term1683.getClass(), "additionalColumns", null);
        setField(term1683, term1683.getClass(), "columns", null);
        term1685 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1685;
        args[2] = null;
        callMethod(klass, "create", argTypes, term1683, args);
    }

};


