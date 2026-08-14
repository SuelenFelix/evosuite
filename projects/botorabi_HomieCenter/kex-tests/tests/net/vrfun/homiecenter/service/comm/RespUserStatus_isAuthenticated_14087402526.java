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

public class RespUserStatus_isAuthenticated_14087402526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201;

    public RespUserStatus_isAuthenticated_14087402526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus"));
        setField(term1201, term1201.getClass(), "appVersion", "UiUYnPrcCi");
        setField(term1201, term1201.getClass(), "name", "UoYtihxVaS");
        setBooleanField(term1201, term1201.getClass(), "authenticated", true);
        setField(term1201, term1201.getClass(), "role", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAuthenticated", argTypes, term1201, args);
    }

};


