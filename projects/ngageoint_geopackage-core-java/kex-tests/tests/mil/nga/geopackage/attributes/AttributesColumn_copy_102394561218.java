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

public class AttributesColumn_copy_102394561218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904;

    public AttributesColumn_copy_102394561218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term904 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term904, term904.getClass(), "index", 0);
        setField(term904, term904.getClass(), "name", null);
        setField(term904, term904.getClass(), "max", null);
        setBooleanField(term904, term904.getClass(), "notNull", false);
        setField(term904, term904.getClass(), "defaultValue", null);
        setBooleanField(term904, term904.getClass(), "primaryKey", false);
        setBooleanField(term904, term904.getClass(), "autoincrement", false);
        setBooleanField(term904, term904.getClass(), "unique", false);
        setField(term904, term904.getClass(), "type", null);
        setField(term904, term904.getClass(), "dataType", null);
        setField(term904, term904.getClass(), "constraints", null);
        setField(term904, term904.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term904, args);
    }

};


