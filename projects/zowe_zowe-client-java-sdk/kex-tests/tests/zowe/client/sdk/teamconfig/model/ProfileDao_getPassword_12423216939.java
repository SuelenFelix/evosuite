package zowe.client.sdk.teamconfig.model;

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
import static zowe.client.sdk.teamconfig.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProfileDao_getPassword_12423216939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3071;

    public ProfileDao_getPassword_12423216939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3071 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        setField(term3071, term3071.getClass(), "profile", null);
        setField(term3071, term3071.getClass(), "user", null);
        setField(term3071, term3071.getClass(), "password", null);
        setField(term3071, term3071.getClass(), "host", null);
        setField(term3071, term3071.getClass(), "port", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3071, args);
    }

};


