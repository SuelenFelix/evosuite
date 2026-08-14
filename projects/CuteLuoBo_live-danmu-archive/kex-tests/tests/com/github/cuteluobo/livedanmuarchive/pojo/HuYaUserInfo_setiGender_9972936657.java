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

public class HuYaUserInfo_setiGender_9972936657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30707;
     Object term30738;

    public HuYaUserInfo_setiGender_9972936657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30707 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30707, term30707.getClass(), "lUid", 1280322790);
        setIntField(term30707, term30707.getClass(), "lImid", -1702209203);
        setIntField(term30707, term30707.getClass(), "iGender", -1592307668);
        setField(term30707, term30707.getClass(), "sAvatarUrl", "");
        setIntField(term30707, term30707.getClass(), "iNobleLevel", -203832871);
        setField(term30707, term30707.getClass(), "uid", "gzvlGZVfnZ");
        setField(term30707, term30707.getClass(), "nickName", "rmSqCaXWHi");
        term30738 = new Integer(1151963130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30738;
        callMethod(klass, "setiGender", argTypes, term30707, args);
    }

};


