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

public class HuYaUserInfo_getlImid_9791410004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30552;

    public HuYaUserInfo_getlImid_9791410004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30552 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30552, term30552.getClass(), "lUid", -831921156);
        setIntField(term30552, term30552.getClass(), "lImid", -2085566906);
        setIntField(term30552, term30552.getClass(), "iGender", 1773193728);
        setField(term30552, term30552.getClass(), "sAvatarUrl", "");
        setIntField(term30552, term30552.getClass(), "iNobleLevel", -1341357647);
        setField(term30552, term30552.getClass(), "uid", "SQnbnBmbcf");
        setField(term30552, term30552.getClass(), "nickName", "jaNVteZrZi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getlImid", argTypes, term30552, args);
    }

};


