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

public class AttributesTableMetadata_create_12424346658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138639;

    public AttributesTableMetadata_create_12424346658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138639 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138639, term138639.getClass(), "constraints", null);
        setField(term138639, term138639.getClass(), "tableName", null);
        setField(term138639, term138639.getClass(), "dataType", null);
        setField(term138639, term138639.getClass(), "identifier", null);
        setField(term138639, term138639.getClass(), "description", null);
        setField(term138639, term138639.getClass(), "idColumnName", null);
        setBooleanField(term138639, term138639.getClass(), "autoincrement", false);
        setField(term138639, term138639.getClass(), "additionalColumns", null);
        setField(term138639, term138639.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term138639, args);
    }

};


