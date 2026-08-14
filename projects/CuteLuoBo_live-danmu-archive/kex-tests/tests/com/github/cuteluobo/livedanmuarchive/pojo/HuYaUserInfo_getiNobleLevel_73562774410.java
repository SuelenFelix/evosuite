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

public class HuYaUserInfo_getiNobleLevel_73562774410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30884;

    public HuYaUserInfo_getiNobleLevel_73562774410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30884 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30884, term30884.getClass(), "lUid", -2018333791);
        setIntField(term30884, term30884.getClass(), "lImid", -742476678);
        setIntField(term30884, term30884.getClass(), "iGender", -824369460);
        setField(term30884, term30884.getClass(), "sAvatarUrl", "");
        setIntField(term30884, term30884.getClass(), "iNobleLevel", -1573760035);
        setField(term30884, term30884.getClass(), "uid", "SXMdNSGPog");
        setField(term30884, term30884.getClass(), "nickName", "vsqwOLpDjj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getiNobleLevel", argTypes, term30884, args);
    }

};


