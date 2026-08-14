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

public class BiliDanMuSenderAccountData_getAppSec_9450928155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36123;

    public BiliDanMuSenderAccountData_getAppSec_9450928155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36123 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term36123, term36123.getClass(), "accessKey", "RjSNvOEvcT");
        setField(term36123, term36123.getClass(), "appKey", "HLzuMxigqS");
        setField(term36123, term36123.getClass(), "appSec", "wiBOoDCyzd");
        setIntField(term36123, term36123.getClass(), "level", 1363887997);
        setField(term36123, term36123.getClass(), "uid", "TIaFKUJELS");
        setField(term36123, term36123.getClass(), "nickName", "IPmndzGjtG");
        setField(term36123, term36123.getClass(), "userName", "pkQiBgYrkQ");
        setField(term36123, term36123.getClass(), "password", "SJLRFsNagf");
        setField(term36123, term36123.getClass(), "cookies", "UsCZaSgXzI");
        setBooleanField(term36123, term36123.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppSec", argTypes, term36123, args);
    }

};


