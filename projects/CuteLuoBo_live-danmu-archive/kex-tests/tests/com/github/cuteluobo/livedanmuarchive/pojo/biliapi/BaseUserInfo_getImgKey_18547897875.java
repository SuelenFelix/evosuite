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

public class BaseUserInfo_getImgKey_18547897875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14571;

    public BaseUserInfo_getImgKey_18547897875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14571 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14571, term14571.getClass(), "uid", -1465819833800717311L);
        setBooleanField(term14571, term14571.getClass(), "login", false);
        setIntField(term14571, term14571.getClass(), "level", 1605456363);
        setField(term14571, term14571.getClass(), "nickName", "OxNXeKMDje");
        setField(term14571, term14571.getClass(), "imgKey", "hGTqHomrbc");
        setField(term14571, term14571.getClass(), "subKey", "NNMBrIWEBw");
        setField(term14571, term14571.getClass(), "cookie", "GrTaccOQzl");
        setField(term14571, term14571.getClass(), "accessKey", "uuSYOUCVHU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImgKey", argTypes, term14571, args);
    }

};


