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

public class AttributesTableMetadata_create_192214886148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138609;
     Object term138611;

    public AttributesTableMetadata_create_192214886148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138609 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138609, term138609.getClass(), "constraints", null);
        setField(term138609, term138609.getClass(), "tableName", null);
        setField(term138609, term138609.getClass(), "dataType", null);
        setField(term138609, term138609.getClass(), "identifier", null);
        setField(term138609, term138609.getClass(), "description", null);
        setField(term138609, term138609.getClass(), "idColumnName", null);
        setBooleanField(term138609, term138609.getClass(), "autoincrement", false);
        setField(term138609, term138609.getClass(), "additionalColumns", null);
        setField(term138609, term138609.getClass(), "columns", null);
        term138611 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term138611;
        callMethod(klass, "create", argTypes, term138609, args);
    }

};


