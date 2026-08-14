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

public class BiliDanMuSenderAccountData_setAppKey_15113276914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35922;

    public BiliDanMuSenderAccountData_setAppKey_15113276914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35922 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term35922, term35922.getClass(), "accessKey", "DvfOYWcNBN");
        setField(term35922, term35922.getClass(), "appKey", "cvbvwpPlNk");
        setField(term35922, term35922.getClass(), "appSec", "uCdLbhvYeG");
        setIntField(term35922, term35922.getClass(), "level", 1267740164);
        setField(term35922, term35922.getClass(), "uid", "ipoyEHBfoG");
        setField(term35922, term35922.getClass(), "nickName", "iSBTpbiteU");
        setField(term35922, term35922.getClass(), "userName", "MTwFbEoMZj");
        setField(term35922, term35922.getClass(), "password", "uEQbnHbyAn");
        setField(term35922, term35922.getClass(), "cookies", "JpFIuyNEKW");
        setBooleanField(term35922, term35922.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NksHsgcqDx";
        callMethod(klass, "setAppKey", argTypes, term35922, args);
    }

};


