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
import java.lang.Long;

public class UserRowSync_setRow_6394897135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1852;
     Object term1853;

    public UserRowSync_setRow_6394897135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1852 = newInstance(Class.forName("mil.nga.geopackage.user.UserRowSync"));
        setField(term1852, term1852.getClass(), "lock", null);
        setField(term1852, term1852.getClass(), "rows", null);
        term1853 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserRowSync");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("mil.nga.geopackage.user.UserCoreRow");
        Object[] args = new Object[2];
        args[0] = term1853;
        args[1] = null;
        callMethod(klass, "setRow", argTypes, term1852, args);
    }

};


