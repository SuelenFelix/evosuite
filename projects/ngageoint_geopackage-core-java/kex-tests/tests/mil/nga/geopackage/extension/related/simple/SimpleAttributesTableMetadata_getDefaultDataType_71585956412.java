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
import java.util.ArrayList;

public class SimpleAttributesTableMetadata_getDefaultDataType_71585956412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1314;

    public SimpleAttributesTableMetadata_getDefaultDataType_71585956412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1376 = new ArrayList();
        ArrayList term1380 = new ArrayList();
        term1314 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term1314, term1314.getClass(), "tableName", "MwwjNtdOFT");
        setField(term1314, term1314.getClass(), "dataType", "VYkqXKVlAJ");
        setField(term1314, term1314.getClass(), "identifier", "XkIoWJRNwN");
        setField(term1314, term1314.getClass(), "description", "aNWLJdrZMq");
        setField(term1314, term1314.getClass(), "idColumnName", "HHmNoYxIGj");
        setBooleanField(term1314, term1314.getClass(), "autoincrement", true);
        setField(term1314, term1314.getClass(), "additionalColumns", term1376);
        setField(term1314, term1314.getClass(), "columns", term1380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term1314, args);
    }

};


