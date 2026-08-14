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

public class ReqUserEdit_setAdmin_127704477021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790;
     Object term793;

    public ReqUserEdit_setAdmin_127704477021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790 = newInstance(Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit"));
        setLongField(term790, term790.getClass(), "id", 0L);
        setField(term790, term790.getClass(), "realName", null);
        setField(term790, term790.getClass(), "userName", null);
        setField(term790, term790.getClass(), "password", null);
        setBooleanField(term790, term790.getClass(), "admin", false);
        term793 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.service.comm.ReqUserEdit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term793;
        callMethod(klass, "setAdmin", argTypes, term790, args);
    }

};


