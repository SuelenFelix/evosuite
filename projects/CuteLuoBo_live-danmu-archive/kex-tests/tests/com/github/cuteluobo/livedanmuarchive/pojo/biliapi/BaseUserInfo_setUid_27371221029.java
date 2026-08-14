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
import java.lang.Long;

public class BaseUserInfo_setUid_27371221029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16185;
     Object term16189;

    public BaseUserInfo_setUid_27371221029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16185 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term16185, term16185.getClass(), "uid", 0L);
        setBooleanField(term16185, term16185.getClass(), "login", false);
        setIntField(term16185, term16185.getClass(), "level", 0);
        setField(term16185, term16185.getClass(), "nickName", null);
        setField(term16185, term16185.getClass(), "imgKey", null);
        setField(term16185, term16185.getClass(), "subKey", null);
        setField(term16185, term16185.getClass(), "cookie", null);
        setField(term16185, term16185.getClass(), "accessKey", null);
        term16189 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16189;
        callMethod(klass, "setUid", argTypes, term16185, args);
    }

};


