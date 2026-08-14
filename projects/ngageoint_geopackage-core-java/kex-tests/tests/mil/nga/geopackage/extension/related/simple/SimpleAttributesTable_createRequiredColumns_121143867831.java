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

public class SimpleAttributesTable_createRequiredColumns_121143867831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641;
     Object term642;

    public SimpleAttributesTable_createRequiredColumns_121143867831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term641 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        setField(term641, term641.getClass(), "relationName", null);
        setField(term641, term641.getClass(), "dataType", null);
        setField(term641, term641.getClass(), "columns", null);
        setField(term641, term641.getClass(), "constraints", null);
        setField(term641, term641.getClass(), "contents", null);
        term642 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term642;
        args[1] = null;
        callMethod(klass, "createRequiredColumns", argTypes, term641, args);
    }

};


