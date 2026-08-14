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
import java.lang.Long;

public class MvResult_setTotalHits_9442842214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3065;
     Object term3107;

    public MvResult_setTotalHits_9442842214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3081 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3081, term3081.getClass(), "name", "");
        setField(term3081, term3081.getClass(), "songName", "");
        setField(term3081, term3081.getClass(), "songUser", "");
        setField(term3081, term3081.getClass(), "url", "");
        setFloatField(term3081, term3081.getClass(), "score", 0.97262454F);
        Object term3087 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3087, term3087.getClass(), "name", "");
        setField(term3087, term3087.getClass(), "songName", "");
        setField(term3087, term3087.getClass(), "songUser", "");
        setField(term3087, term3087.getClass(), "url", "");
        setFloatField(term3087, term3087.getClass(), "score", 0.76550204F);
        Object term3093 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3093, term3093.getClass(), "name", "");
        setField(term3093, term3093.getClass(), "songName", "");
        setField(term3093, term3093.getClass(), "songUser", "");
        setField(term3093, term3093.getClass(), "url", "");
        setFloatField(term3093, term3093.getClass(), "score", 0.26441735F);
        Object term3099 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3099, term3099.getClass(), "name", "");
        setField(term3099, term3099.getClass(), "songName", "");
        setField(term3099, term3099.getClass(), "songUser", "");
        setField(term3099, term3099.getClass(), "url", "");
        setFloatField(term3099, term3099.getClass(), "score", 0.13745493F);
        ArrayList term3079 = new ArrayList();
        ((ArrayList) term3079).add(term3081);
        ((ArrayList) term3079).add(term3087);
        ((ArrayList) term3079).add(term3093);
        ((ArrayList) term3079).add(term3099);
        term3065 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvResult"));
        setField(term3065, term3065.getClass(), "query", "DyiXbeYIaN");
        setLongField(term3065, term3065.getClass(), "totalHits", -8400487765614892086L);
        setField(term3065, term3065.getClass(), "list", term3079);
        term3107 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3107;
        callMethod(klass, "setTotalHits", argTypes, term3065, args);
    }

};


