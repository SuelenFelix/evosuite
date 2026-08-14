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
import java.util.ArrayList;
import java.lang.Object;

public class MvResult_getQuery_17000007811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2887;

    public MvResult_getQuery_17000007811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2903 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2903, term2903.getClass(), "name", "");
        setField(term2903, term2903.getClass(), "songName", "");
        setField(term2903, term2903.getClass(), "songUser", "");
        setField(term2903, term2903.getClass(), "url", "");
        setFloatField(term2903, term2903.getClass(), "score", 0.8783184F);
        Object term2909 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2909, term2909.getClass(), "name", "");
        setField(term2909, term2909.getClass(), "songName", "");
        setField(term2909, term2909.getClass(), "songUser", "");
        setField(term2909, term2909.getClass(), "url", "");
        setFloatField(term2909, term2909.getClass(), "score", 0.26413453F);
        Object term2915 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2915, term2915.getClass(), "name", "");
        setField(term2915, term2915.getClass(), "songName", "");
        setField(term2915, term2915.getClass(), "songUser", "");
        setField(term2915, term2915.getClass(), "url", "");
        setFloatField(term2915, term2915.getClass(), "score", 0.7944024F);
        Object term2921 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2921, term2921.getClass(), "name", "");
        setField(term2921, term2921.getClass(), "songName", "");
        setField(term2921, term2921.getClass(), "songUser", "");
        setField(term2921, term2921.getClass(), "url", "");
        setFloatField(term2921, term2921.getClass(), "score", 0.3692338F);
        Object term2927 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2927, term2927.getClass(), "name", "");
        setField(term2927, term2927.getClass(), "songName", "");
        setField(term2927, term2927.getClass(), "songUser", "");
        setField(term2927, term2927.getClass(), "url", "");
        setFloatField(term2927, term2927.getClass(), "score", 0.13906479F);
        ArrayList term2901 = new ArrayList();
        ((ArrayList) term2901).add(term2903);
        ((ArrayList) term2901).add(term2909);
        ((ArrayList) term2901).add(term2915);
        ((ArrayList) term2901).add(term2921);
        ((ArrayList) term2901).add(term2927);
        term2887 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvResult"));
        setField(term2887, term2887.getClass(), "query", "xIeFjkHkOe");
        setLongField(term2887, term2887.getClass(), "totalHits", 2442117782898005296L);
        setField(term2887, term2887.getClass(), "list", term2901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuery", argTypes, term2887, args);
    }

};


