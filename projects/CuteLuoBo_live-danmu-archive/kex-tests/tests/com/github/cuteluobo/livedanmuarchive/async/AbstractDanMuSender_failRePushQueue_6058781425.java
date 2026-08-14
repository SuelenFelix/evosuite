package com.github.cuteluobo.livedanmuarchive.async;

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
import static com.github.cuteluobo.livedanmuarchive.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class AbstractDanMuSender_failRePushQueue_6058781425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;

    public AbstractDanMuSender_failRePushQueue_6058781425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1940 = new Long(-316468845751588286L);
        term1895 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.RetryTask"));
        Object term1896 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term1897 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term1934 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term1897, term1897.getClass(), "uid", "TimdotUuNC");
        setField(term1897, term1897.getClass(), "nickName", "PkWMRdJcBb");
        setField(term1896, term1896.getClass(), "userIfo", term1897);
        setField(term1896, term1896.getClass(), "content", "jSpAteRute");
        setIntField(term1934, term1934.getClass(), "fontColor", -883034806);
        setIntField(term1934, term1934.getClass(), "fontSize", 25);
        setIntField(term1934, term1934.getClass(), "textSpeed", 1585847225);
        setIntField(term1934, term1934.getClass(), "transitionType", 1);
        setIntField(term1934, term1934.getClass(), "popupStyle", 597278769);
        setField(term1896, term1896.getClass(), "danMuFormatData", term1934);
        setField(term1896, term1896.getClass(), "timestamp", term1940);
        setField(term1896, term1896.getClass(), "msgType", "swZVeJAxjt");
        setField(term1895, term1895.getClass(), "task", term1896);
        setIntField(term1895, term1895.getClass(), "retryCount", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.AbstractDanMuSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.async.RetryTask");
        Object[] args = new Object[1];
        args[0] = term1895;
        callMethod(klass, "failRePushQueue", argTypes, null, args);
    }

};


