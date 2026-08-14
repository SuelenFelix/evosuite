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

public class ProfileDao_toString_46184128213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3075;

    public ProfileDao_toString_46184128213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3075 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        setField(term3075, term3075.getClass(), "profile", null);
        setField(term3075, term3075.getClass(), "user", null);
        setField(term3075, term3075.getClass(), "password", null);
        setField(term3075, term3075.getClass(), "host", null);
        setField(term3075, term3075.getClass(), "port", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3075, args);
    }

};


