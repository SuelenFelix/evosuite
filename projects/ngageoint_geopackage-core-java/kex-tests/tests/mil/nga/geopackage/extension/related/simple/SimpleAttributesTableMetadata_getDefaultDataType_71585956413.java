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

public class SimpleAttributesTableMetadata_getDefaultDataType_71585956413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69809;

    public SimpleAttributesTableMetadata_getDefaultDataType_71585956413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69871 = new ArrayList();
        ArrayList term69875 = new ArrayList();
        term69809 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term69809, term69809.getClass(), "tableName", "rdKTcvHHnV");
        setField(term69809, term69809.getClass(), "dataType", "ELfUfLbXZf");
        setField(term69809, term69809.getClass(), "identifier", "SAglaHkagn");
        setField(term69809, term69809.getClass(), "description", "eZGxUfdoFn");
        setField(term69809, term69809.getClass(), "idColumnName", "yCWSlaOrSv");
        setBooleanField(term69809, term69809.getClass(), "autoincrement", true);
        setField(term69809, term69809.getClass(), "additionalColumns", term69871);
        setField(term69809, term69809.getClass(), "columns", term69875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term69809, args);
    }

};


