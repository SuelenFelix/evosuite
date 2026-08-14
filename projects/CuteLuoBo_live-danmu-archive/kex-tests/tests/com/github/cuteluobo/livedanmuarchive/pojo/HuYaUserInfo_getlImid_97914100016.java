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

public class HuYaUserInfo_getlImid_97914100016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31005;

    public HuYaUserInfo_getlImid_97914100016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31005 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term31005, term31005.getClass(), "lUid", 0);
        setIntField(term31005, term31005.getClass(), "lImid", 0);
        setIntField(term31005, term31005.getClass(), "iGender", 0);
        setField(term31005, term31005.getClass(), "sAvatarUrl", null);
        setIntField(term31005, term31005.getClass(), "iNobleLevel", 0);
        setField(term31005, term31005.getClass(), "uid", null);
        setField(term31005, term31005.getClass(), "nickName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getlImid", argTypes, term31005, args);
    }

};


