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

public class AttributesTableMetadata_create_192214886147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4730;
     Object term4732;

    public AttributesTableMetadata_create_192214886147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4730 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term4730, term4730.getClass(), "constraints", null);
        setField(term4730, term4730.getClass(), "tableName", null);
        setField(term4730, term4730.getClass(), "dataType", null);
        setField(term4730, term4730.getClass(), "identifier", null);
        setField(term4730, term4730.getClass(), "description", null);
        setField(term4730, term4730.getClass(), "idColumnName", null);
        setBooleanField(term4730, term4730.getClass(), "autoincrement", false);
        setField(term4730, term4730.getClass(), "additionalColumns", null);
        setField(term4730, term4730.getClass(), "columns", null);
        term4732 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4732;
        callMethod(klass, "create", argTypes, term4730, args);
    }

};


