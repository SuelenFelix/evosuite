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

public class HuYaUserInfo_getiGender_5553262176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30656;

    public HuYaUserInfo_getiGender_5553262176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30656 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30656, term30656.getClass(), "lUid", 1923558221);
        setIntField(term30656, term30656.getClass(), "lImid", 1762934060);
        setIntField(term30656, term30656.getClass(), "iGender", -859828739);
        setField(term30656, term30656.getClass(), "sAvatarUrl", "");
        setIntField(term30656, term30656.getClass(), "iNobleLevel", 1986855642);
        setField(term30656, term30656.getClass(), "uid", "ffKeJGEXBT");
        setField(term30656, term30656.getClass(), "nickName", "rsnXTpfhqf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getiGender", argTypes, term30656, args);
    }

};


