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

public class UserCustomColumns_updateColumns_28604037213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2540;

    public UserCustomColumns_updateColumns_28604037213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2540 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        setField(term2540, term2540.getClass(), "requiredColumns", null);
        setField(term2540, term2540.getClass(), "tableName", null);
        setField(term2540, term2540.getClass(), "columnNames", null);
        setField(term2540, term2540.getClass(), "columns", null);
        setBooleanField(term2540, term2540.getClass(), "custom", false);
        setField(term2540, term2540.getClass(), "nameToIndex", null);
        setIntField(term2540, term2540.getClass(), "pkIndex", 0);
        setBooleanField(term2540, term2540.getClass(), "pkModifiable", false);
        setBooleanField(term2540, term2540.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term2540, args);
    }

};


