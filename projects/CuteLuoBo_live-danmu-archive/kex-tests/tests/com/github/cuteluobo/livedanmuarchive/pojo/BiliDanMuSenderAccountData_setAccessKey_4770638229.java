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

public class BiliDanMuSenderAccountData_setAccessKey_4770638229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36704;

    public BiliDanMuSenderAccountData_setAccessKey_4770638229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36704 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term36704, term36704.getClass(), "accessKey", "UlBxuoBXcJ");
        setField(term36704, term36704.getClass(), "appKey", "PqduvNFXXw");
        setField(term36704, term36704.getClass(), "appSec", "bMQrxvaBAI");
        setIntField(term36704, term36704.getClass(), "level", 1248430530);
        setField(term36704, term36704.getClass(), "uid", "StFtysZlWm");
        setField(term36704, term36704.getClass(), "nickName", "CoqUcmjnkF");
        setField(term36704, term36704.getClass(), "userName", "oOrXvGaFwa");
        setField(term36704, term36704.getClass(), "password", "KJSTLGsSvO");
        setField(term36704, term36704.getClass(), "cookies", "kSkiIpaepq");
        setBooleanField(term36704, term36704.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FzJhDecyvI";
        callMethod(klass, "setAccessKey", argTypes, term36704, args);
    }

};


