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
import java.lang.Boolean;

public class RespUserStatus_setAuthenticated_17331232307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1269;
     Object term1307;

    public RespUserStatus_setAuthenticated_17331232307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1269 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus"));
        setField(term1269, term1269.getClass(), "appVersion", "onpbIeEKoi");
        setField(term1269, term1269.getClass(), "name", "YRHGsAkhxb");
        setBooleanField(term1269, term1269.getClass(), "authenticated", true);
        setField(term1269, term1269.getClass(), "role", "ffYhPOzlUs");
        term1307 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.RespUserStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1307;
        callMethod(klass, "setAuthenticated", argTypes, term1269, args);
    }

};


