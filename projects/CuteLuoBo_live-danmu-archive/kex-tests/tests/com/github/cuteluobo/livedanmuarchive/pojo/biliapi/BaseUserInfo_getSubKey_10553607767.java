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

public class BaseUserInfo_getSubKey_10553607767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14821;

    public BaseUserInfo_getSubKey_10553607767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14821 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14821, term14821.getClass(), "uid", -8692119547314358088L);
        setBooleanField(term14821, term14821.getClass(), "login", false);
        setIntField(term14821, term14821.getClass(), "level", 2109912812);
        setField(term14821, term14821.getClass(), "nickName", "CuWebzZQjZ");
        setField(term14821, term14821.getClass(), "imgKey", "wRVaaJxKYI");
        setField(term14821, term14821.getClass(), "subKey", "yOQuJXRvOo");
        setField(term14821, term14821.getClass(), "cookie", "XmLHcnVsch");
        setField(term14821, term14821.getClass(), "accessKey", "Yrvtdcltri");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubKey", argTypes, term14821, args);
    }

};


