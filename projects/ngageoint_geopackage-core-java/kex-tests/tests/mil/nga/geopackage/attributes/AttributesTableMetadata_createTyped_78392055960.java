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

public class AttributesTableMetadata_createTyped_78392055960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138643;
     Object term138645;

    public AttributesTableMetadata_createTyped_78392055960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138643 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138643, term138643.getClass(), "constraints", null);
        setField(term138643, term138643.getClass(), "tableName", null);
        setField(term138643, term138643.getClass(), "dataType", null);
        setField(term138643, term138643.getClass(), "identifier", null);
        setField(term138643, term138643.getClass(), "description", null);
        setField(term138643, term138643.getClass(), "idColumnName", null);
        setBooleanField(term138643, term138643.getClass(), "autoincrement", false);
        setField(term138643, term138643.getClass(), "additionalColumns", null);
        setField(term138643, term138643.getClass(), "columns", null);
        term138645 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term138645;
        callMethod(klass, "createTyped", argTypes, term138643, args);
    }

};


