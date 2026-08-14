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

public class UserCorePaginatedResults_2_1_next_3679214362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1872;

    public UserCorePaginatedResults_2_1_next_3679214362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1872 = newInstance(Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults$2$1"));
        Object term1873 = newInstance(Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults$2"));
        setField(term1873, term1873.getClass(), "ids", null);
        setField(term1873, term1873.getClass(), "this$0", null);
        setField(term1872, term1872.getClass(), "this$1", term1873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserCorePaginatedResults$2$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1872, args);
    }

};


