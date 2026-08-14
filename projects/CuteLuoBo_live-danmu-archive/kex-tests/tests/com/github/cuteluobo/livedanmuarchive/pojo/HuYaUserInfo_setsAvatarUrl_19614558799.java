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

public class HuYaUserInfo_setsAvatarUrl_19614558799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30811;

    public HuYaUserInfo_setsAvatarUrl_19614558799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30811 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30811, term30811.getClass(), "lUid", -1577393360);
        setIntField(term30811, term30811.getClass(), "lImid", 1112256038);
        setIntField(term30811, term30811.getClass(), "iGender", -441333794);
        setField(term30811, term30811.getClass(), "sAvatarUrl", "");
        setIntField(term30811, term30811.getClass(), "iNobleLevel", 1504698817);
        setField(term30811, term30811.getClass(), "uid", "XnZHOhTfxL");
        setField(term30811, term30811.getClass(), "nickName", "oFBhNamtAs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YURcpRjwSt";
        callMethod(klass, "setsAvatarUrl", argTypes, term30811, args);
    }

};


