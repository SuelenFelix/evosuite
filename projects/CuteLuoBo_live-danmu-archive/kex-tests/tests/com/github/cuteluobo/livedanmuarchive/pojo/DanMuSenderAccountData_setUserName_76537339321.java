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

public class DanMuSenderAccountData_setUserName_76537339321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5731;

    public DanMuSenderAccountData_setUserName_76537339321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5731 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData"));
        setField(term5731, term5731.getClass(), "uid", null);
        setField(term5731, term5731.getClass(), "nickName", null);
        setField(term5731, term5731.getClass(), "userName", null);
        setField(term5731, term5731.getClass(), "password", null);
        setField(term5731, term5731.getClass(), "cookies", null);
        setBooleanField(term5731, term5731.getClass(), "alive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term5731, args);
    }

};


