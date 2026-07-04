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

public class User2VO_getPower_37461291840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31514;

    public User2VO_getPower_37461291840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31514 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        setField(term31514, term31514.getClass(), "id", null);
        setField(term31514, term31514.getClass(), "email", null);
        setField(term31514, term31514.getClass(), "password", null);
        setField(term31514, term31514.getClass(), "username", null);
        setField(term31514, term31514.getClass(), "power", null);
        setField(term31514, term31514.getClass(), "nickname", null);
        setField(term31514, term31514.getClass(), "sex", null);
        setField(term31514, term31514.getClass(), "age", null);
        setField(term31514, term31514.getClass(), "phone", null);
        setField(term31514, term31514.getClass(), "facePic", null);
        setField(term31514, term31514.getClass(), "faceUrl", null);
        setField(term31514, term31514.getClass(), "headUrl", null);
        setField(term31514, term31514.getClass(), "introduce", null);
        setField(term31514, term31514.getClass(), "ip", null);
        setField(term31514, term31514.getClass(), "partnames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term31514, args);
    }

};


