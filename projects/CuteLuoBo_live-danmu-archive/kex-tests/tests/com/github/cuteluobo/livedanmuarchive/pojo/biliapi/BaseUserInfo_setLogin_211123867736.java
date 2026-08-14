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
import java.lang.Boolean;

public class BaseUserInfo_setLogin_211123867736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16215;
     Object term16219;

    public BaseUserInfo_setLogin_211123867736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16215 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term16215, term16215.getClass(), "uid", 0L);
        setBooleanField(term16215, term16215.getClass(), "login", false);
        setIntField(term16215, term16215.getClass(), "level", 0);
        setField(term16215, term16215.getClass(), "nickName", null);
        setField(term16215, term16215.getClass(), "imgKey", null);
        setField(term16215, term16215.getClass(), "subKey", null);
        setField(term16215, term16215.getClass(), "cookie", null);
        setField(term16215, term16215.getClass(), "accessKey", null);
        term16219 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term16219;
        callMethod(klass, "setLogin", argTypes, term16215, args);
    }

};


