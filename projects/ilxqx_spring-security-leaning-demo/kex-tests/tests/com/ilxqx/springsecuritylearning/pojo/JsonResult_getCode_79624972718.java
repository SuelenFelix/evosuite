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

public class JsonResult_getCode_79624972718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;

    public JsonResult_getCode_79624972718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398 = newInstance(Class.forName("com.ilxqx.springsecuritylearning.pojo.JsonResult"));
        setField(term398, term398.getClass(), "code", null);
        setField(term398, term398.getClass(), "message", null);
        setField(term398, term398.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ilxqx.springsecuritylearning.pojo.JsonResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term398, args);
    }

};


