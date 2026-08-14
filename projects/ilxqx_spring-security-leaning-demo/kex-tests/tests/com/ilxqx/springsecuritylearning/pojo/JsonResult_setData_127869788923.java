package com.ilxqx.springsecuritylearning.pojo;

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
import static com.ilxqx.springsecuritylearning.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonResult_setData_127869788923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public JsonResult_setData_127869788923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("com.ilxqx.springsecuritylearning.pojo.JsonResult"));
        setField(term403, term403.getClass(), "code", null);
        setField(term403, term403.getClass(), "message", null);
        setField(term403, term403.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ilxqx.springsecuritylearning.pojo.JsonResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setData", argTypes, term403, args);
    }

};


