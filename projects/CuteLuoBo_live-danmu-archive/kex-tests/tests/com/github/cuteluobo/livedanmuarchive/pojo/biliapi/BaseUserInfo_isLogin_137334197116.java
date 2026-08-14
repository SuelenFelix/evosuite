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

public class BaseUserInfo_isLogin_137334197116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15805;

    public BaseUserInfo_isLogin_137334197116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15805 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15805, term15805.getClass(), "uid", 6895382576300001141L);
        setBooleanField(term15805, term15805.getClass(), "login", false);
        setIntField(term15805, term15805.getClass(), "level", 1478914037);
        setField(term15805, term15805.getClass(), "nickName", "KyGbLglqbW");
        setField(term15805, term15805.getClass(), "imgKey", "ZKVeStsSNT");
        setField(term15805, term15805.getClass(), "subKey", "cqCXYaAnFB");
        setField(term15805, term15805.getClass(), "cookie", "UPLNFZHXjw");
        setField(term15805, term15805.getClass(), "accessKey", "CwrrJlrGmg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogin", argTypes, term15805, args);
    }

};


