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

public class MvResult_getTotalHits_12853117543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3019;

    public MvResult_getTotalHits_12853117543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3035 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3035, term3035.getClass(), "name", "");
        setField(term3035, term3035.getClass(), "songName", "");
        setField(term3035, term3035.getClass(), "songUser", "");
        setField(term3035, term3035.getClass(), "url", "");
        setFloatField(term3035, term3035.getClass(), "score", 0.8474802F);
        Object term3041 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3041, term3041.getClass(), "name", "");
        setField(term3041, term3041.getClass(), "songName", "");
        setField(term3041, term3041.getClass(), "songUser", "");
        setField(term3041, term3041.getClass(), "url", "");
        setFloatField(term3041, term3041.getClass(), "score", 0.9985961F);
        Object term3047 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3047, term3047.getClass(), "name", "");
        setField(term3047, term3047.getClass(), "songName", "");
        setField(term3047, term3047.getClass(), "songUser", "");
        setField(term3047, term3047.getClass(), "url", "");
        setFloatField(term3047, term3047.getClass(), "score", 0.51832694F);
        ArrayList term3033 = new ArrayList();
        ((ArrayList) term3033).add(term3035);
        ((ArrayList) term3033).add(term3041);
        ((ArrayList) term3033).add(term3047);
        term3019 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvResult"));
        setField(term3019, term3019.getClass(), "query", "XYtryyobou");
        setLongField(term3019, term3019.getClass(), "totalHits", -8257434502486459194L);
        setField(term3019, term3019.getClass(), "list", term3033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHits", argTypes, term3019, args);
    }

};


