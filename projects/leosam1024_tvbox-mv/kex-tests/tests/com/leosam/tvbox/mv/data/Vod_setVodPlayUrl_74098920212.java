package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vod_setVodPlayUrl_74098920212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2586;

    public Vod_setVodPlayUrl_74098920212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2586 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term2586, term2586.getClass(), "vodId", "MvRIxilFMJ");
        setField(term2586, term2586.getClass(), "vodName", "iNwOJRBEjp");
        setField(term2586, term2586.getClass(), "vodActor", "XylxrMBraH");
        setField(term2586, term2586.getClass(), "vodPlayFrom", "pORebkoRdD");
        setField(term2586, term2586.getClass(), "vodPic", "mXGCWJDOqA");
        setField(term2586, term2586.getClass(), "vodPlayUrl", "dpNsDgfPso");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setVodPlayUrl", argTypes, term2586, args);
    }

};


