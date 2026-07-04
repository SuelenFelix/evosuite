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
import java.lang.Integer;
import java.util.ArrayList;

public class UserVO_getUsername_15247779733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5197;

    public UserVO_getUsername_15247779733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5198 = new Integer(287287233);
        ArrayList term5236 = new ArrayList();
        term5197 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term5197, term5197.getClass(), "id", term5198);
        setField(term5197, term5197.getClass(), "email", "zzsdNZhejE");
        setField(term5197, term5197.getClass(), "username", "ILoodMZrgR");
        setField(term5197, term5197.getClass(), "power", "XQiKmsCacK");
        setField(term5197, term5197.getClass(), "menus", term5236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term5197, args);
    }

};


