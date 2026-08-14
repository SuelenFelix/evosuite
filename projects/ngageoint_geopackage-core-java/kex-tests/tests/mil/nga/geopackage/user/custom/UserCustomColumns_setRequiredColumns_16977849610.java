package mil.nga.geopackage.user.custom;

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
import static mil.nga.geopackage.user.custom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCustomColumns_setRequiredColumns_16977849610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2530;

    public UserCustomColumns_setRequiredColumns_16977849610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2530 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        setField(term2530, term2530.getClass(), "requiredColumns", null);
        setField(term2530, term2530.getClass(), "tableName", null);
        setField(term2530, term2530.getClass(), "columnNames", null);
        setField(term2530, term2530.getClass(), "columns", null);
        setBooleanField(term2530, term2530.getClass(), "custom", false);
        setField(term2530, term2530.getClass(), "nameToIndex", null);
        setIntField(term2530, term2530.getClass(), "pkIndex", 0);
        setBooleanField(term2530, term2530.getClass(), "pkModifiable", false);
        setBooleanField(term2530, term2530.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRequiredColumns", argTypes, term2530, args);
    }

};


