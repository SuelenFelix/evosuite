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

public class AttributesTableMetadata_createTyped_168557348563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138653;

    public AttributesTableMetadata_createTyped_168557348563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138653 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138653, term138653.getClass(), "constraints", null);
        setField(term138653, term138653.getClass(), "tableName", null);
        setField(term138653, term138653.getClass(), "dataType", null);
        setField(term138653, term138653.getClass(), "identifier", null);
        setField(term138653, term138653.getClass(), "description", null);
        setField(term138653, term138653.getClass(), "idColumnName", null);
        setBooleanField(term138653, term138653.getClass(), "autoincrement", false);
        setField(term138653, term138653.getClass(), "additionalColumns", null);
        setField(term138653, term138653.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "createTyped", argTypes, term138653, args);
    }

};


