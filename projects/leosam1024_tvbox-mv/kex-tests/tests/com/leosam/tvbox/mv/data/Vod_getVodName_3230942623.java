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

public class Vod_getVodName_3230942623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;

    public Vod_getVodName_3230942623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1301 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term1301, term1301.getClass(), "vodId", "MLqYREekMl");
        setField(term1301, term1301.getClass(), "vodName", "ytSBIKXogI");
        setField(term1301, term1301.getClass(), "vodActor", "nHXjMycHlU");
        setField(term1301, term1301.getClass(), "vodPlayFrom", "ieCtQFdkii");
        setField(term1301, term1301.getClass(), "vodPic", "dEnhdmILtU");
        setField(term1301, term1301.getClass(), "vodPlayUrl", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVodName", argTypes, term1301, args);
    }

};


