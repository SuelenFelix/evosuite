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

public class BiliDanMuSenderAccountData_getLevel_90066030610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36905;

    public BiliDanMuSenderAccountData_getLevel_90066030610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36905 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term36905, term36905.getClass(), "accessKey", "zOxseYMSdY");
        setField(term36905, term36905.getClass(), "appKey", "jEKlkqpHMQ");
        setField(term36905, term36905.getClass(), "appSec", "QpEVWispEh");
        setIntField(term36905, term36905.getClass(), "level", -1911828505);
        setField(term36905, term36905.getClass(), "uid", "STofGrqXqL");
        setField(term36905, term36905.getClass(), "nickName", "IoRhBfdSuN");
        setField(term36905, term36905.getClass(), "userName", "JGdxVjQzts");
        setField(term36905, term36905.getClass(), "password", "jEdjRikQtN");
        setField(term36905, term36905.getClass(), "cookies", "fSNUaokVWs");
        setBooleanField(term36905, term36905.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term36905, args);
    }

};


