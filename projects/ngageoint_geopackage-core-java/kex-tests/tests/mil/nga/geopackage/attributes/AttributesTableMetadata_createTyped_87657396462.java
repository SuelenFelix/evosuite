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

public class AttributesTableMetadata_createTyped_87657396462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4772;
     Object term4774;

    public AttributesTableMetadata_createTyped_87657396462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4772 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term4772, term4772.getClass(), "constraints", null);
        setField(term4772, term4772.getClass(), "tableName", null);
        setField(term4772, term4772.getClass(), "dataType", null);
        setField(term4772, term4772.getClass(), "identifier", null);
        setField(term4772, term4772.getClass(), "description", null);
        setField(term4772, term4772.getClass(), "idColumnName", null);
        setBooleanField(term4772, term4772.getClass(), "autoincrement", false);
        setField(term4772, term4772.getClass(), "additionalColumns", null);
        setField(term4772, term4772.getClass(), "columns", null);
        term4774 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term4774;
        args[4] = null;
        callMethod(klass, "createTyped", argTypes, term4772, args);
    }

};


