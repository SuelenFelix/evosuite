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
import java.lang.Boolean;

public class BaseUserInfo_setLogin_211123867717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15919;
     Object term15983;

    public BaseUserInfo_setLogin_211123867717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15919 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15919, term15919.getClass(), "uid", 9062006526792682783L);
        setBooleanField(term15919, term15919.getClass(), "login", false);
        setIntField(term15919, term15919.getClass(), "level", 1630231519);
        setField(term15919, term15919.getClass(), "nickName", "HejzvyejjG");
        setField(term15919, term15919.getClass(), "imgKey", "pbqJjeooBM");
        setField(term15919, term15919.getClass(), "subKey", "ccnotFfPXt");
        setField(term15919, term15919.getClass(), "cookie", "plWlgdgIhn");
        setField(term15919, term15919.getClass(), "accessKey", "RZaKVKWtND");
        term15983 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term15983;
        callMethod(klass, "setLogin", argTypes, term15919, args);
    }

};


