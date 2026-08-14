package mil.nga.geopackage.user;

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
import static mil.nga.geopackage.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UserCorePaginatedResults_2_1_hasNext_486235341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1870;

    public UserCorePaginatedResults_2_1_hasNext_486235341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1870 = newInstance(Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults$2$1"));
        Object term1871 = newInstance(Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults$2"));
        setField(term1871, term1871.getClass(), "ids", null);
        setField(term1871, term1871.getClass(), "this$0", null);
        setField(term1870, term1870.getClass(), "this$1", term1871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults$2$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term1870, args);
    }

};


