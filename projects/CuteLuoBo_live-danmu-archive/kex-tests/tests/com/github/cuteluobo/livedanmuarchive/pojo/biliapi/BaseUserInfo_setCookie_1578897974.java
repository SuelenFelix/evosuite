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

public class BaseUserInfo_setCookie_1578897974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14435;

    public BaseUserInfo_setCookie_1578897974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14435 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14435, term14435.getClass(), "uid", 1353683663053784647L);
        setBooleanField(term14435, term14435.getClass(), "login", true);
        setIntField(term14435, term14435.getClass(), "level", -1541981599);
        setField(term14435, term14435.getClass(), "nickName", "VZwkkQktrm");
        setField(term14435, term14435.getClass(), "imgKey", "wIuJvIvEMb");
        setField(term14435, term14435.getClass(), "subKey", "EyojsbSjWT");
        setField(term14435, term14435.getClass(), "cookie", "szGicGyWDL");
        setField(term14435, term14435.getClass(), "accessKey", "lkdvUiYwRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XuxkPrpfND";
        callMethod(klass, "setCookie", argTypes, term14435, args);
    }

};


