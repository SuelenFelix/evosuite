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

public class DanMuSenderAccountData_getUid_110968085718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5725;

    public DanMuSenderAccountData_getUid_110968085718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5725 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData"));
        setField(term5725, term5725.getClass(), "uid", null);
        setField(term5725, term5725.getClass(), "nickName", null);
        setField(term5725, term5725.getClass(), "userName", null);
        setField(term5725, term5725.getClass(), "password", null);
        setField(term5725, term5725.getClass(), "cookies", null);
        setBooleanField(term5725, term5725.getClass(), "alive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUid", argTypes, term5725, args);
    }

};


