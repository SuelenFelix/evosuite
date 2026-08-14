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
import java.util.LinkedList;

public class MvResult_setList_11156774376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3153;
     Object term3207;

    public MvResult_setList_11156774376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3169 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3169, term3169.getClass(), "name", "");
        setField(term3169, term3169.getClass(), "songName", "");
        setField(term3169, term3169.getClass(), "songUser", "");
        setField(term3169, term3169.getClass(), "url", "");
        setFloatField(term3169, term3169.getClass(), "score", 0.7031006F);
        Object term3175 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3175, term3175.getClass(), "name", "");
        setField(term3175, term3175.getClass(), "songName", "");
        setField(term3175, term3175.getClass(), "songUser", "");
        setField(term3175, term3175.getClass(), "url", "");
        setFloatField(term3175, term3175.getClass(), "score", 0.9431611F);
        Object term3181 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3181, term3181.getClass(), "name", "");
        setField(term3181, term3181.getClass(), "songName", "");
        setField(term3181, term3181.getClass(), "songUser", "");
        setField(term3181, term3181.getClass(), "url", "");
        setFloatField(term3181, term3181.getClass(), "score", 0.95272815F);
        Object term3187 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3187, term3187.getClass(), "name", "");
        setField(term3187, term3187.getClass(), "songName", "");
        setField(term3187, term3187.getClass(), "songUser", "");
        setField(term3187, term3187.getClass(), "url", "");
        setFloatField(term3187, term3187.getClass(), "score", 0.7254646F);
        Object term3193 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3193, term3193.getClass(), "name", "");
        setField(term3193, term3193.getClass(), "songName", "");
        setField(term3193, term3193.getClass(), "songUser", "");
        setField(term3193, term3193.getClass(), "url", "");
        setFloatField(term3193, term3193.getClass(), "score", 0.9828442F);
        Object term3199 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3199, term3199.getClass(), "name", "");
        setField(term3199, term3199.getClass(), "songName", "");
        setField(term3199, term3199.getClass(), "songUser", "");
        setField(term3199, term3199.getClass(), "url", "");
        setFloatField(term3199, term3199.getClass(), "score", 0.9472605F);
        ArrayList term3167 = new ArrayList();
        ((ArrayList) term3167).add(term3169);
        ((ArrayList) term3167).add(term3175);
        ((ArrayList) term3167).add(term3181);
        ((ArrayList) term3167).add(term3187);
        ((ArrayList) term3167).add(term3193);
        ((ArrayList) term3167).add(term3199);
        term3153 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvResult"));
        setField(term3153, term3153.getClass(), "query", "ZkMALXpEAZ");
        setLongField(term3153, term3153.getClass(), "totalHits", 4872422362414183754L);
        setField(term3153, term3153.getClass(), "list", term3167);
        Object term3210 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3210, term3210.getClass(), "name", "TwfWVQGiIj");
        setField(term3210, term3210.getClass(), "songName", "gUvcueTURF");
        setField(term3210, term3210.getClass(), "songUser", "EwQBhZjCIT");
        setField(term3210, term3210.getClass(), "url", "aSkmSwTnEw");
        setFloatField(term3210, term3210.getClass(), "score", 0.27797186F);
        Object term3261 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3261, term3261.getClass(), "name", "");
        setField(term3261, term3261.getClass(), "songName", "");
        setField(term3261, term3261.getClass(), "songUser", "");
        setField(term3261, term3261.getClass(), "url", "");
        setFloatField(term3261, term3261.getClass(), "score", 0.7467328F);
        Object term3268 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3268, term3268.getClass(), "name", null);
        setField(term3268, term3268.getClass(), "songName", null);
        setField(term3268, term3268.getClass(), "songUser", null);
        setField(term3268, term3268.getClass(), "url", null);
        setFloatField(term3268, term3268.getClass(), "score", 0.6436713F);
        term3207 = new LinkedList();
        ((LinkedList) term3207).add(term3210);
        ((LinkedList) term3207).add(term3261);
        ((LinkedList) term3207).add(term3268);
        ((LinkedList) term3207).add((Object)null);
        ((LinkedList) term3207).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3207;
        callMethod(klass, "setList", argTypes, term3153, args);
    }

};


