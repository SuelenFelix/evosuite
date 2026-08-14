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
import java.lang.Integer;

public class HuYaUserInfo_setiNobleLevel_173152397823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31044;
     Object term31049;

    public HuYaUserInfo_setiNobleLevel_173152397823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31044 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term31044, term31044.getClass(), "lUid", 0);
        setIntField(term31044, term31044.getClass(), "lImid", 0);
        setIntField(term31044, term31044.getClass(), "iGender", 0);
        setField(term31044, term31044.getClass(), "sAvatarUrl", null);
        setIntField(term31044, term31044.getClass(), "iNobleLevel", 0);
        setField(term31044, term31044.getClass(), "uid", null);
        setField(term31044, term31044.getClass(), "nickName", null);
        term31049 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31049;
        callMethod(klass, "setiNobleLevel", argTypes, term31044, args);
    }

};


