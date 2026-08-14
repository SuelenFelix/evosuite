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

public class Vod_getVodId_53594143415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2874;

    public Vod_getVodId_53594143415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2874 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term2874, term2874.getClass(), "vodId", null);
        setField(term2874, term2874.getClass(), "vodName", null);
        setField(term2874, term2874.getClass(), "vodActor", null);
        setField(term2874, term2874.getClass(), "vodPlayFrom", null);
        setField(term2874, term2874.getClass(), "vodPic", null);
        setField(term2874, term2874.getClass(), "vodPlayUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVodId", argTypes, term2874, args);
    }

};


