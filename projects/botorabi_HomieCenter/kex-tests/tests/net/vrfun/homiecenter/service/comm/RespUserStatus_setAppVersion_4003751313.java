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

public class RespUserStatus_setAppVersion_4003751313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501;

    public RespUserStatus_setAppVersion_4003751313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus"));
        setField(term1501, term1501.getClass(), "appVersion", null);
        setField(term1501, term1501.getClass(), "name", null);
        setBooleanField(term1501, term1501.getClass(), "authenticated", false);
        setField(term1501, term1501.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAppVersion", argTypes, term1501, args);
    }

};


