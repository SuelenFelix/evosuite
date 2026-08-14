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

public class AttributesTableMetadata_create_192214793147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138607;

    public AttributesTableMetadata_create_192214793147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138607 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term138607, term138607.getClass(), "constraints", null);
        setField(term138607, term138607.getClass(), "tableName", null);
        setField(term138607, term138607.getClass(), "dataType", null);
        setField(term138607, term138607.getClass(), "identifier", null);
        setField(term138607, term138607.getClass(), "description", null);
        setField(term138607, term138607.getClass(), "idColumnName", null);
        setBooleanField(term138607, term138607.getClass(), "autoincrement", false);
        setField(term138607, term138607.getClass(), "additionalColumns", null);
        setField(term138607, term138607.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term138607, args);
    }

};


