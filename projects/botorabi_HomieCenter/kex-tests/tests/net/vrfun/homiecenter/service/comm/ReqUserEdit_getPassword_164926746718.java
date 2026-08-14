package net.vrfun.homiecenter.service.comm;

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
import static net.vrfun.homiecenter.service.comm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReqUserEdit_getPassword_164926746718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public ReqUserEdit_getPassword_164926746718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit"));
        setLongField(term781, term781.getClass(), "id", 0L);
        setField(term781, term781.getClass(), "realName", null);
        setField(term781, term781.getClass(), "userName", null);
        setField(term781, term781.getClass(), "password", null);
        setBooleanField(term781, term781.getClass(), "admin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term781, args);
    }

};


