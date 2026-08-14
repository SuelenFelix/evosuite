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
import java.lang.Integer;
import java.lang.Boolean;

public class SimpleAttributesTable_createIdColumn_104522073938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13398;
     Object term13399;
     Object term13401;

    public SimpleAttributesTable_createIdColumn_104522073938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13398 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        setField(term13398, term13398.getClass(), "relationName", null);
        setField(term13398, term13398.getClass(), "dataType", null);
        setField(term13398, term13398.getClass(), "columns", null);
        setField(term13398, term13398.getClass(), "constraints", null);
        setField(term13398, term13398.getClass(), "contents", null);
        term13399 = new Integer(0);
        term13401 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term13399;
        args[1] = null;
        args[2] = term13401;
        callMethod(klass, "createIdColumn", argTypes, term13398, args);
    }

};


