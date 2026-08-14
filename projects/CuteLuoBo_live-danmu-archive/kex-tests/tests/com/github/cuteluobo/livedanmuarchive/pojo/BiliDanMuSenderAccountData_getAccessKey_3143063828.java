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

public class BiliDanMuSenderAccountData_getAccessKey_3143063828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36525;

    public BiliDanMuSenderAccountData_getAccessKey_3143063828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36525 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term36525, term36525.getClass(), "accessKey", "rfFHGPcfpz");
        setField(term36525, term36525.getClass(), "appKey", "fViQeyMrrL");
        setField(term36525, term36525.getClass(), "appSec", "zzeaToyLmI");
        setIntField(term36525, term36525.getClass(), "level", 852281447);
        setField(term36525, term36525.getClass(), "uid", "sKYWhmRMLx");
        setField(term36525, term36525.getClass(), "nickName", "SOJpgWUZCf");
        setField(term36525, term36525.getClass(), "userName", "jgywFOzBDw");
        setField(term36525, term36525.getClass(), "password", "yKIXLtCWYi");
        setField(term36525, term36525.getClass(), "cookies", "EhuyRKrUJu");
        setBooleanField(term36525, term36525.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessKey", argTypes, term36525, args);
    }

};


