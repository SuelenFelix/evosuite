package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User2VO_getFaceUrl_148108271146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31520;

    public User2VO_getFaceUrl_148108271146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31520 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        setField(term31520, term31520.getClass(), "id", null);
        setField(term31520, term31520.getClass(), "email", null);
        setField(term31520, term31520.getClass(), "password", null);
        setField(term31520, term31520.getClass(), "username", null);
        setField(term31520, term31520.getClass(), "power", null);
        setField(term31520, term31520.getClass(), "nickname", null);
        setField(term31520, term31520.getClass(), "sex", null);
        setField(term31520, term31520.getClass(), "age", null);
        setField(term31520, term31520.getClass(), "phone", null);
        setField(term31520, term31520.getClass(), "facePic", null);
        setField(term31520, term31520.getClass(), "faceUrl", null);
        setField(term31520, term31520.getClass(), "headUrl", null);
        setField(term31520, term31520.getClass(), "introduce", null);
        setField(term31520, term31520.getClass(), "ip", null);
        setField(term31520, term31520.getClass(), "partnames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFaceUrl", argTypes, term31520, args);
    }

};


