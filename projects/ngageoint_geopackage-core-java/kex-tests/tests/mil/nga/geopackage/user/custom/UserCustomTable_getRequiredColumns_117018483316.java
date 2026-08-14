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

public class UserCustomTable_getRequiredColumns_117018483316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2893;

    public UserCustomTable_getRequiredColumns_117018483316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2893 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        setField(term2893, term2893.getClass(), "columns", null);
        setField(term2893, term2893.getClass(), "constraints", null);
        setField(term2893, term2893.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredColumns", argTypes, term2893, args);
    }

};


