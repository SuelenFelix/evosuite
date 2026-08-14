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

public class HuYaUserInfo_getsAvatarUrl_5117347518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30760;

    public HuYaUserInfo_getsAvatarUrl_5117347518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30760 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30760, term30760.getClass(), "lUid", -1855819749);
        setIntField(term30760, term30760.getClass(), "lImid", 1059048043);
        setIntField(term30760, term30760.getClass(), "iGender", 537273345);
        setField(term30760, term30760.getClass(), "sAvatarUrl", "");
        setIntField(term30760, term30760.getClass(), "iNobleLevel", -346107257);
        setField(term30760, term30760.getClass(), "uid", "ScztqspySK");
        setField(term30760, term30760.getClass(), "nickName", "IvYxGwWoVu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getsAvatarUrl", argTypes, term30760, args);
    }

};


