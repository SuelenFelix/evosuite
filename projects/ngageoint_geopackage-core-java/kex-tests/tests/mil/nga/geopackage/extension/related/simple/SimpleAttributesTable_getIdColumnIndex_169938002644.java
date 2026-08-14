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

public class SimpleAttributesTable_getIdColumnIndex_169938002644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;

    public SimpleAttributesTable_getIdColumnIndex_169938002644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        setField(term665, term665.getClass(), "relationName", null);
        setField(term665, term665.getClass(), "dataType", null);
        setField(term665, term665.getClass(), "columns", null);
        setField(term665, term665.getClass(), "constraints", null);
        setField(term665, term665.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumnIndex", argTypes, term665, args);
    }

};


