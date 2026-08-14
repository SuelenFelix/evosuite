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

public class BaseUserInfo_setNickName_178518737515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15669;

    public BaseUserInfo_setNickName_178518737515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15669 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15669, term15669.getClass(), "uid", 1442167273909860961L);
        setBooleanField(term15669, term15669.getClass(), "login", true);
        setIntField(term15669, term15669.getClass(), "level", 63677360);
        setField(term15669, term15669.getClass(), "nickName", "CLHomjAqIM");
        setField(term15669, term15669.getClass(), "imgKey", "mzCFLzFuSj");
        setField(term15669, term15669.getClass(), "subKey", "WQnMpDlSfA");
        setField(term15669, term15669.getClass(), "cookie", "aOIvTQtXiv");
        setField(term15669, term15669.getClass(), "accessKey", "IyjDiknqhA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IHsXSAFYKi";
        callMethod(klass, "setNickName", argTypes, term15669, args);
    }

};


