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

public class BaseUserInfo_setUid_27371221010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15185;
     Object term15249;

    public BaseUserInfo_setUid_27371221010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15185 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15185, term15185.getClass(), "uid", -3806202176947356197L);
        setBooleanField(term15185, term15185.getClass(), "login", true);
        setIntField(term15185, term15185.getClass(), "level", -675283917);
        setField(term15185, term15185.getClass(), "nickName", "eKcEJRxNSu");
        setField(term15185, term15185.getClass(), "imgKey", "NTXQPWFYSA");
        setField(term15185, term15185.getClass(), "subKey", "fOuOhBpldm");
        setField(term15185, term15185.getClass(), "cookie", "qQQRKGPyIM");
        setField(term15185, term15185.getClass(), "accessKey", "lzcwhvjdFg");
        term15249 = new Long(-5534222035915952617L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term15249;
        callMethod(klass, "setUid", argTypes, term15185, args);
    }

};


