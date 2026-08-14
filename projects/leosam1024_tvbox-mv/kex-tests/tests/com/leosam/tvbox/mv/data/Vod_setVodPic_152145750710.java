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

public class Vod_setVodPic_152145750710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2298;

    public Vod_setVodPic_152145750710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2298 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term2298, term2298.getClass(), "vodId", "AWRooQKkdW");
        setField(term2298, term2298.getClass(), "vodName", "vjxIhXHxGR");
        setField(term2298, term2298.getClass(), "vodActor", "QXzGXbEXMu");
        setField(term2298, term2298.getClass(), "vodPlayFrom", "qxSDVejjiY");
        setField(term2298, term2298.getClass(), "vodPic", "xBsXSDjXYK");
        setField(term2298, term2298.getClass(), "vodPlayUrl", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setVodPic", argTypes, term2298, args);
    }

};


