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

public class User2VO_toString_75141431169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31543;

    public User2VO_toString_75141431169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31543 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        setField(term31543, term31543.getClass(), "id", null);
        setField(term31543, term31543.getClass(), "email", null);
        setField(term31543, term31543.getClass(), "password", null);
        setField(term31543, term31543.getClass(), "username", null);
        setField(term31543, term31543.getClass(), "power", null);
        setField(term31543, term31543.getClass(), "nickname", null);
        setField(term31543, term31543.getClass(), "sex", null);
        setField(term31543, term31543.getClass(), "age", null);
        setField(term31543, term31543.getClass(), "phone", null);
        setField(term31543, term31543.getClass(), "facePic", null);
        setField(term31543, term31543.getClass(), "faceUrl", null);
        setField(term31543, term31543.getClass(), "headUrl", null);
        setField(term31543, term31543.getClass(), "introduce", null);
        setField(term31543, term31543.getClass(), "ip", null);
        setField(term31543, term31543.getClass(), "partnames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31543, args);
    }

};


