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

public class Vod_setVodName_16040485604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;

    public Vod_setVodName_16040485604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term1434, term1434.getClass(), "vodId", "eqJfYWRaEL");
        setField(term1434, term1434.getClass(), "vodName", "fhkbdRViHi");
        setField(term1434, term1434.getClass(), "vodActor", "uWHnvSvaPl");
        setField(term1434, term1434.getClass(), "vodPlayFrom", "kBdSllIBVz");
        setField(term1434, term1434.getClass(), "vodPic", "TJmVBGfTML");
        setField(term1434, term1434.getClass(), "vodPlayUrl", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        callMethod(klass, "setVodName", argTypes, term1434, args);
    }

};


