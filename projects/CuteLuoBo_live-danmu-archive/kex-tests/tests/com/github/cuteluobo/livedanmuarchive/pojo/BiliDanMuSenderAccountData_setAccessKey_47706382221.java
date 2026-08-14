package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BiliDanMuSenderAccountData_setAccessKey_47706382221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37280;

    public BiliDanMuSenderAccountData_setAccessKey_47706382221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37280 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term37280, term37280.getClass(), "accessKey", null);
        setField(term37280, term37280.getClass(), "appKey", null);
        setField(term37280, term37280.getClass(), "appSec", null);
        setIntField(term37280, term37280.getClass(), "level", 0);
        setField(term37280, term37280.getClass(), "uid", null);
        setField(term37280, term37280.getClass(), "nickName", null);
        setField(term37280, term37280.getClass(), "userName", null);
        setField(term37280, term37280.getClass(), "password", null);
        setField(term37280, term37280.getClass(), "cookies", null);
        setBooleanField(term37280, term37280.getClass(), "alive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAccessKey", argTypes, term37280, args);
    }

};


