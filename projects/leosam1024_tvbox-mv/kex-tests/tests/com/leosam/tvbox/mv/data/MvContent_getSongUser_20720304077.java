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

public class MvContent_getSongUser_20720304077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587;

    public MvContent_getSongUser_20720304077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term587, term587.getClass(), "name", "flxyYxBRtu");
        setField(term587, term587.getClass(), "songName", "OclPbYPkcH");
        setField(term587, term587.getClass(), "songUser", "IoAlmYsBwc");
        setField(term587, term587.getClass(), "url", "TEParAifyi");
        setFloatField(term587, term587.getClass(), "score", 0.5254275F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSongUser", argTypes, term587, args);
    }

};


