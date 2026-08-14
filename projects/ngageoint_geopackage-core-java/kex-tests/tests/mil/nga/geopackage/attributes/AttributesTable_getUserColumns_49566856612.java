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

public class AttributesTable_getUserColumns_49566856612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5322;

    public AttributesTable_getUserColumns_49566856612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5322 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        setField(term5322, term5322.getClass(), "columns", null);
        setField(term5322, term5322.getClass(), "constraints", null);
        setField(term5322, term5322.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term5322, args);
    }

};


