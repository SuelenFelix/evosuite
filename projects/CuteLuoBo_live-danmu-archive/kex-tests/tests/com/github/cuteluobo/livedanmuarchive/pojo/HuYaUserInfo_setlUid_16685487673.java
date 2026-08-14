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

public class HuYaUserInfo_setlUid_16685487673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30499;
     Object term30530;

    public HuYaUserInfo_setlUid_16685487673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30499 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30499, term30499.getClass(), "lUid", -2025555268);
        setIntField(term30499, term30499.getClass(), "lImid", -746950289);
        setIntField(term30499, term30499.getClass(), "iGender", -137577510);
        setField(term30499, term30499.getClass(), "sAvatarUrl", "");
        setIntField(term30499, term30499.getClass(), "iNobleLevel", 719185716);
        setField(term30499, term30499.getClass(), "uid", "sMqpXbgEga");
        setField(term30499, term30499.getClass(), "nickName", "nYJlDpoMcL");
        term30530 = new Integer(1624820010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30530;
        callMethod(klass, "setlUid", argTypes, term30499, args);
    }

};


