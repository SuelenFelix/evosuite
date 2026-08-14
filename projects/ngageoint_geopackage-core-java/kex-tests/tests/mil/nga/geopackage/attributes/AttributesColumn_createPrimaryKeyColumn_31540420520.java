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
import java.lang.Boolean;

public class AttributesColumn_createPrimaryKeyColumn_31540420520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;
     Object term922;

    public AttributesColumn_createPrimaryKeyColumn_31540420520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term916, term916.getClass(), "index", 0);
        setField(term916, term916.getClass(), "name", null);
        setField(term916, term916.getClass(), "max", null);
        setBooleanField(term916, term916.getClass(), "notNull", false);
        setField(term916, term916.getClass(), "defaultValue", null);
        setBooleanField(term916, term916.getClass(), "primaryKey", false);
        setBooleanField(term916, term916.getClass(), "autoincrement", false);
        setBooleanField(term916, term916.getClass(), "unique", false);
        setField(term916, term916.getClass(), "type", null);
        setField(term916, term916.getClass(), "dataType", null);
        setField(term916, term916.getClass(), "constraints", null);
        setField(term916, term916.getClass(), "schema", null);
        term922 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term922;
        callMethod(klass, "createPrimaryKeyColumn", argTypes, term916, args);
    }

};


