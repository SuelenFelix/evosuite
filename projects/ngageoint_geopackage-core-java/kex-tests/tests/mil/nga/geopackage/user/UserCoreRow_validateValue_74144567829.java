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

public class UserCoreRow_validateValue_74144567829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4229;
     Object term4230;

    public UserCoreRow_validateValue_74144567829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4229 = newInstance(Class.forName("java.lang.Object"));
        term4230 = (Object[]) newArray("java.lang.Class", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserCoreRow");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.UserColumn");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4229;
        args[2] = term4230;
        callMethod(klass, "validateValue", argTypes, null, args);
    }

};


