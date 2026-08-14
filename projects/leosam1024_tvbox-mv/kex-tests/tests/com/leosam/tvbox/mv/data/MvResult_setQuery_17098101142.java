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

public class MvResult_setQuery_17098101142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2945;

    public MvResult_setQuery_17098101142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2961 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2961, term2961.getClass(), "name", "");
        setField(term2961, term2961.getClass(), "songName", "");
        setField(term2961, term2961.getClass(), "songUser", "");
        setField(term2961, term2961.getClass(), "url", "");
        setFloatField(term2961, term2961.getClass(), "score", 0.6076495F);
        Object term2967 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2967, term2967.getClass(), "name", "");
        setField(term2967, term2967.getClass(), "songName", "");
        setField(term2967, term2967.getClass(), "songUser", "");
        setField(term2967, term2967.getClass(), "url", "");
        setFloatField(term2967, term2967.getClass(), "score", 0.6608425F);
        Object term2973 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2973, term2973.getClass(), "name", "");
        setField(term2973, term2973.getClass(), "songName", "");
        setField(term2973, term2973.getClass(), "songUser", "");
        setField(term2973, term2973.getClass(), "url", "");
        setFloatField(term2973, term2973.getClass(), "score", 0.37773192F);
        Object term2979 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term2979, term2979.getClass(), "name", "");
        setField(term2979, term2979.getClass(), "songName", "");
        setField(term2979, term2979.getClass(), "songUser", "");
        setField(term2979, term2979.getClass(), "url", "");
        setFloatField(term2979, term2979.getClass(), "score", 0.24413109F);
        ArrayList term2959 = new ArrayList();
        ((ArrayList) term2959).add(term2961);
        ((ArrayList) term2959).add(term2967);
        ((ArrayList) term2959).add(term2973);
        ((ArrayList) term2959).add(term2979);
        term2945 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvResult"));
        setField(term2945, term2945.getClass(), "query", "HzqpegHiRq");
        setLongField(term2945, term2945.getClass(), "totalHits", 6375119433582206027L);
        setField(term2945, term2945.getClass(), "list", term2959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "smnHEqRFRx";
        callMethod(klass, "setQuery", argTypes, term2945, args);
    }

};


