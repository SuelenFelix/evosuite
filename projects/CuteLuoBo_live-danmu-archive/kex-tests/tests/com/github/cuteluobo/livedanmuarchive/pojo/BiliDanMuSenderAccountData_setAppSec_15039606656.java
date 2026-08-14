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

public class BiliDanMuSenderAccountData_setAppSec_15039606656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36302;

    public BiliDanMuSenderAccountData_setAppSec_15039606656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36302 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term36302, term36302.getClass(), "accessKey", "IXZCeVwvBM");
        setField(term36302, term36302.getClass(), "appKey", "ElTdyUVQYi");
        setField(term36302, term36302.getClass(), "appSec", "KkgJnxXxVl");
        setIntField(term36302, term36302.getClass(), "level", -1744763945);
        setField(term36302, term36302.getClass(), "uid", "TGnzPlGFMb");
        setField(term36302, term36302.getClass(), "nickName", "yEvLMSpdHy");
        setField(term36302, term36302.getClass(), "userName", "qdErlZeTVv");
        setField(term36302, term36302.getClass(), "password", "OCCDQbndDE");
        setField(term36302, term36302.getClass(), "cookies", "NMANMKfctU");
        setBooleanField(term36302, term36302.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mQsaqUltLU";
        callMethod(klass, "setAppSec", argTypes, term36302, args);
    }

};


