package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseUserInfo_setImgKey_88759716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14685;

    public BaseUserInfo_setImgKey_88759716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14685 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14685, term14685.getClass(), "uid", -8306611953768020559L);
        setBooleanField(term14685, term14685.getClass(), "login", true);
        setIntField(term14685, term14685.getClass(), "level", 2059896693);
        setField(term14685, term14685.getClass(), "nickName", "DfWwbodtVw");
        setField(term14685, term14685.getClass(), "imgKey", "kTbFMpVWqx");
        setField(term14685, term14685.getClass(), "subKey", "HegRNsidFg");
        setField(term14685, term14685.getClass(), "cookie", "udRdJkgXmH");
        setField(term14685, term14685.getClass(), "accessKey", "FBCXbjHVXO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dIWAnvmLiC";
        callMethod(klass, "setImgKey", argTypes, term14685, args);
    }

};


