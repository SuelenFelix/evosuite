package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KakaoProfile_Properties_setProfileimage_10787241595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21748;

    public KakaoProfile_Properties_setProfileimage_10787241595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21748 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term21748, term21748.getClass(), "nickname", "FmWhAOGAMI");
        setField(term21748, term21748.getClass(), "profile_image", "GdjCkRsIrS");
        setField(term21748, term21748.getClass(), "thumbnail_image", "MJNyYzLhkh");
        setField(term21748, term21748.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DEugGJIaYt";
        callMethod(klass, "setProfile_image", argTypes, term21748, args);
    }

};


