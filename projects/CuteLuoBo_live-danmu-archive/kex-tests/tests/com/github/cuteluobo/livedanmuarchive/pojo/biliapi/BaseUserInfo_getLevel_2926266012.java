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

public class BaseUserInfo_getLevel_2926266012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15325;

    public BaseUserInfo_getLevel_2926266012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15325 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15325, term15325.getClass(), "uid", 8073378116544724166L);
        setBooleanField(term15325, term15325.getClass(), "login", false);
        setIntField(term15325, term15325.getClass(), "level", 1337828646);
        setField(term15325, term15325.getClass(), "nickName", "bsnZXGEvFv");
        setField(term15325, term15325.getClass(), "imgKey", "osFrHWYeRy");
        setField(term15325, term15325.getClass(), "subKey", "scpIQUfPKw");
        setField(term15325, term15325.getClass(), "cookie", "QKYBpCjuYt");
        setField(term15325, term15325.getClass(), "accessKey", "vjiRfoGdkl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term15325, args);
    }

};


