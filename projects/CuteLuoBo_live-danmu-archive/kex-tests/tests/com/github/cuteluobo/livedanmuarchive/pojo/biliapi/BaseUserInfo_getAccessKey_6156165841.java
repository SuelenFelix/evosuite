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

public class BaseUserInfo_getAccessKey_6156165841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14071;

    public BaseUserInfo_getAccessKey_6156165841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14071 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14071, term14071.getClass(), "uid", -1571034605670661708L);
        setBooleanField(term14071, term14071.getClass(), "login", true);
        setIntField(term14071, term14071.getClass(), "level", 1595814906);
        setField(term14071, term14071.getClass(), "nickName", "lYvIWBFFsq");
        setField(term14071, term14071.getClass(), "imgKey", "tThwsqWKcE");
        setField(term14071, term14071.getClass(), "subKey", "bkSgsDrkCN");
        setField(term14071, term14071.getClass(), "cookie", "hwjlcimgJH");
        setField(term14071, term14071.getClass(), "accessKey", "TLxQzxvizR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessKey", argTypes, term14071, args);
    }

};


