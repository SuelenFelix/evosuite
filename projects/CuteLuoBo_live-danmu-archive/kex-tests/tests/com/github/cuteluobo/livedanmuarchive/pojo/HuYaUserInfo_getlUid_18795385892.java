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

public class HuYaUserInfo_getlUid_18795385892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30448;

    public HuYaUserInfo_getlUid_18795385892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30448 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30448, term30448.getClass(), "lUid", 1180687854);
        setIntField(term30448, term30448.getClass(), "lImid", 328631288);
        setIntField(term30448, term30448.getClass(), "iGender", -1631415805);
        setField(term30448, term30448.getClass(), "sAvatarUrl", "");
        setIntField(term30448, term30448.getClass(), "iNobleLevel", 1073400519);
        setField(term30448, term30448.getClass(), "uid", "eNOEXYoAtV");
        setField(term30448, term30448.getClass(), "nickName", "SNqwfZGLFh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getlUid", argTypes, term30448, args);
    }

};


