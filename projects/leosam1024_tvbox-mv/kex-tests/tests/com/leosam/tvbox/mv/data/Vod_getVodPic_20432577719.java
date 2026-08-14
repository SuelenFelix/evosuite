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

public class Vod_getVodPic_20432577719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165;

    public Vod_getVodPic_20432577719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2165 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term2165, term2165.getClass(), "vodId", "XqgfKFvPSD");
        setField(term2165, term2165.getClass(), "vodName", "JiVRgTZvKc");
        setField(term2165, term2165.getClass(), "vodActor", "XPKmummaqg");
        setField(term2165, term2165.getClass(), "vodPlayFrom", "BKLfkLiZTH");
        setField(term2165, term2165.getClass(), "vodPic", "SPpkrGcPRr");
        setField(term2165, term2165.getClass(), "vodPlayUrl", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVodPic", argTypes, term2165, args);
    }

};


