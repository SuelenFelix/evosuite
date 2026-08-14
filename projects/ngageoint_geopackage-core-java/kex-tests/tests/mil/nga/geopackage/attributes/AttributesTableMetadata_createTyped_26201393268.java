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

public class AttributesTableMetadata_createTyped_26201393268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138665;

    public AttributesTableMetadata_createTyped_26201393268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138665 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138665, term138665.getClass(), "constraints", null);
        setField(term138665, term138665.getClass(), "tableName", null);
        setField(term138665, term138665.getClass(), "dataType", null);
        setField(term138665, term138665.getClass(), "identifier", null);
        setField(term138665, term138665.getClass(), "description", null);
        setField(term138665, term138665.getClass(), "idColumnName", null);
        setBooleanField(term138665, term138665.getClass(), "autoincrement", false);
        setField(term138665, term138665.getClass(), "additionalColumns", null);
        setField(term138665, term138665.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createTyped", argTypes, term138665, args);
    }

};


