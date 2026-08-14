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

public class BaseUserInfo_setAccessKey_4528591442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14185;

    public BaseUserInfo_setAccessKey_4528591442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14185 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14185, term14185.getClass(), "uid", -7983954942068142191L);
        setBooleanField(term14185, term14185.getClass(), "login", false);
        setIntField(term14185, term14185.getClass(), "level", -834193529);
        setField(term14185, term14185.getClass(), "nickName", "uUgJfKAzDM");
        setField(term14185, term14185.getClass(), "imgKey", "gZPZNkweEp");
        setField(term14185, term14185.getClass(), "subKey", "vfennwtmqe");
        setField(term14185, term14185.getClass(), "cookie", "zZxoNkohbw");
        setField(term14185, term14185.getClass(), "accessKey", "DQrjPcLysX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VWPFyrpmmb";
        callMethod(klass, "setAccessKey", argTypes, term14185, args);
    }

};


