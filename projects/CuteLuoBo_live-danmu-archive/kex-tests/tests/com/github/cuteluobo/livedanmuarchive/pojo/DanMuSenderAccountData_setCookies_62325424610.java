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

public class DanMuSenderAccountData_setCookies_62325424610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5119;

    public DanMuSenderAccountData_setCookies_62325424610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5119 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData"));
        setField(term5119, term5119.getClass(), "uid", "TXZAIPQJHt");
        setField(term5119, term5119.getClass(), "nickName", "DIbeDHICho");
        setField(term5119, term5119.getClass(), "userName", "dJGPlmSRnz");
        setField(term5119, term5119.getClass(), "password", "DPskuFUobI");
        setField(term5119, term5119.getClass(), "cookies", "wBGfLpNNiZ");
        setBooleanField(term5119, term5119.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yUGCjlqgJE";
        callMethod(klass, "setCookies", argTypes, term5119, args);
    }

};


