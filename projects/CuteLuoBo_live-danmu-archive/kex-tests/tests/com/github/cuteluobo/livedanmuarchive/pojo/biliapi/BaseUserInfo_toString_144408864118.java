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

public class BaseUserInfo_toString_144408864118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16035;

    public BaseUserInfo_toString_144408864118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16035 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term16035, term16035.getClass(), "uid", -7400951017937830861L);
        setBooleanField(term16035, term16035.getClass(), "login", true);
        setIntField(term16035, term16035.getClass(), "level", 1460702778);
        setField(term16035, term16035.getClass(), "nickName", "vXiaNiquft");
        setField(term16035, term16035.getClass(), "imgKey", "lucCeiVnYe");
        setField(term16035, term16035.getClass(), "subKey", "iYwkCLMsbJ");
        setField(term16035, term16035.getClass(), "cookie", "MXLsVQWrwc");
        setField(term16035, term16035.getClass(), "accessKey", "lRaSlqzqNY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term16035, args);
    }

};


