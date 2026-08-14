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

public class BiliDanMuSenderAccountData_getAppKey_9377257893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35743;

    public BiliDanMuSenderAccountData_getAppKey_9377257893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35743 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term35743, term35743.getClass(), "accessKey", "WmVcapKAeJ");
        setField(term35743, term35743.getClass(), "appKey", "jevOVdQdpc");
        setField(term35743, term35743.getClass(), "appSec", "TLLVSGTNsz");
        setIntField(term35743, term35743.getClass(), "level", -1362132929);
        setField(term35743, term35743.getClass(), "uid", "mbBWfaHCrP");
        setField(term35743, term35743.getClass(), "nickName", "wFyiZloCxg");
        setField(term35743, term35743.getClass(), "userName", "xYztJEIPWy");
        setField(term35743, term35743.getClass(), "password", "TDQIAXaJru");
        setField(term35743, term35743.getClass(), "cookies", "frPMFqGmrE");
        setBooleanField(term35743, term35743.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppKey", argTypes, term35743, args);
    }

};


