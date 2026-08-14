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

public class HuYaUserInfo_setsAvatarUrl_196145587921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31034;

    public HuYaUserInfo_setsAvatarUrl_196145587921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31034 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term31034, term31034.getClass(), "lUid", 0);
        setIntField(term31034, term31034.getClass(), "lImid", 0);
        setIntField(term31034, term31034.getClass(), "iGender", 0);
        setField(term31034, term31034.getClass(), "sAvatarUrl", null);
        setIntField(term31034, term31034.getClass(), "iNobleLevel", 0);
        setField(term31034, term31034.getClass(), "uid", null);
        setField(term31034, term31034.getClass(), "nickName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setsAvatarUrl", argTypes, term31034, args);
    }

};


