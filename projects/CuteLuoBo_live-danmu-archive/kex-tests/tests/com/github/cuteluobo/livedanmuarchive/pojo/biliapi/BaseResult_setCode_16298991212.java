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
import java.lang.Integer;

public class BaseResult_setCode_16298991212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term41;

    public BaseResult_setCode_16298991212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseResult"));
        setIntField(term26, term26.getClass(), "code", 391863371);
        setField(term26, term26.getClass(), "message", "sjlJAEtRrb");
        setIntField(term26, term26.getClass(), "ttl", -1922583790);
        setField(term26, term26.getClass(), "data", null);
        term41 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41;
        callMethod(klass, "setCode", argTypes, term26, args);
    }

};


