package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SimpleAttributesTableMetadata_create_66975692314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1554;

    public SimpleAttributesTableMetadata_create_66975692314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1554 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term1554, term1554.getClass(), "tableName", null);
        setField(term1554, term1554.getClass(), "dataType", null);
        setField(term1554, term1554.getClass(), "identifier", null);
        setField(term1554, term1554.getClass(), "description", null);
        setField(term1554, term1554.getClass(), "idColumnName", null);
        setBooleanField(term1554, term1554.getClass(), "autoincrement", false);
        setField(term1554, term1554.getClass(), "additionalColumns", null);
        setField(term1554, term1554.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term1554, args);
    }

};


