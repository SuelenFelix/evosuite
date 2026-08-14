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

public class AttributesTableMetadata_getDefaultDataType_17369441574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4794;

    public AttributesTableMetadata_getDefaultDataType_17369441574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4794 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term4794, term4794.getClass(), "constraints", null);
        setField(term4794, term4794.getClass(), "tableName", null);
        setField(term4794, term4794.getClass(), "dataType", null);
        setField(term4794, term4794.getClass(), "identifier", null);
        setField(term4794, term4794.getClass(), "description", null);
        setField(term4794, term4794.getClass(), "idColumnName", null);
        setBooleanField(term4794, term4794.getClass(), "autoincrement", false);
        setField(term4794, term4794.getClass(), "additionalColumns", null);
        setField(term4794, term4794.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term4794, args);
    }

};


