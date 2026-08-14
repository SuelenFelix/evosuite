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

public class AttributesColumns_copy_3092834767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5710;

    public AttributesColumns_copy_3092834767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5710 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        setField(term5710, term5710.getClass(), "tableName", null);
        setField(term5710, term5710.getClass(), "columnNames", null);
        setField(term5710, term5710.getClass(), "columns", null);
        setBooleanField(term5710, term5710.getClass(), "custom", false);
        setField(term5710, term5710.getClass(), "nameToIndex", null);
        setIntField(term5710, term5710.getClass(), "pkIndex", 0);
        setBooleanField(term5710, term5710.getClass(), "pkModifiable", false);
        setBooleanField(term5710, term5710.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term5710, args);
    }

};


