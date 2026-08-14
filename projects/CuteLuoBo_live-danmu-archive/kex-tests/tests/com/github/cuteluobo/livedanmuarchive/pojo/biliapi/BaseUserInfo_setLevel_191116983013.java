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

public class BaseUserInfo_setLevel_191116983013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15439;
     Object term15503;

    public BaseUserInfo_setLevel_191116983013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15439 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15439, term15439.getClass(), "uid", -8303973304709662279L);
        setBooleanField(term15439, term15439.getClass(), "login", true);
        setIntField(term15439, term15439.getClass(), "level", 532666604);
        setField(term15439, term15439.getClass(), "nickName", "TwaxeSHvnR");
        setField(term15439, term15439.getClass(), "imgKey", "paPzDETzIq");
        setField(term15439, term15439.getClass(), "subKey", "fufeuGfwpN");
        setField(term15439, term15439.getClass(), "cookie", "XJbkXbljvz");
        setField(term15439, term15439.getClass(), "accessKey", "fuvdkDwBeH");
        term15503 = new Integer(-13725716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15503;
        callMethod(klass, "setLevel", argTypes, term15439, args);
    }

};


