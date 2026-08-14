package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BaseUserInfo_setLevel_191116983032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16197;
     Object term16201;

    public BaseUserInfo_setLevel_191116983032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16197 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term16197, term16197.getClass(), "uid", 0L);
        setBooleanField(term16197, term16197.getClass(), "login", false);
        setIntField(term16197, term16197.getClass(), "level", 0);
        setField(term16197, term16197.getClass(), "nickName", null);
        setField(term16197, term16197.getClass(), "imgKey", null);
        setField(term16197, term16197.getClass(), "subKey", null);
        setField(term16197, term16197.getClass(), "cookie", null);
        setField(term16197, term16197.getClass(), "accessKey", null);
        term16201 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16201;
        callMethod(klass, "setLevel", argTypes, term16197, args);
    }

};


