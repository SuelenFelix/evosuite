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

public class BiliDanMuSenderAccountData_getAccessKey_31430638220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37277;

    public BiliDanMuSenderAccountData_getAccessKey_31430638220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37277 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term37277, term37277.getClass(), "accessKey", null);
        setField(term37277, term37277.getClass(), "appKey", null);
        setField(term37277, term37277.getClass(), "appSec", null);
        setIntField(term37277, term37277.getClass(), "level", 0);
        setField(term37277, term37277.getClass(), "uid", null);
        setField(term37277, term37277.getClass(), "nickName", null);
        setField(term37277, term37277.getClass(), "userName", null);
        setField(term37277, term37277.getClass(), "password", null);
        setField(term37277, term37277.getClass(), "cookies", null);
        setBooleanField(term37277, term37277.getClass(), "alive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessKey", argTypes, term37277, args);
    }

};


