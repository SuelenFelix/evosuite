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
import java.lang.Integer;

public class BiliDanMuSenderAccountData_setLevel_145387450023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37286;
     Object term37289;

    public BiliDanMuSenderAccountData_setLevel_145387450023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37286 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term37286, term37286.getClass(), "accessKey", null);
        setField(term37286, term37286.getClass(), "appKey", null);
        setField(term37286, term37286.getClass(), "appSec", null);
        setIntField(term37286, term37286.getClass(), "level", 0);
        setField(term37286, term37286.getClass(), "uid", null);
        setField(term37286, term37286.getClass(), "nickName", null);
        setField(term37286, term37286.getClass(), "userName", null);
        setField(term37286, term37286.getClass(), "password", null);
        setField(term37286, term37286.getClass(), "cookies", null);
        setBooleanField(term37286, term37286.getClass(), "alive", false);
        term37289 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37289;
        callMethod(klass, "setLevel", argTypes, term37286, args);
    }

};


