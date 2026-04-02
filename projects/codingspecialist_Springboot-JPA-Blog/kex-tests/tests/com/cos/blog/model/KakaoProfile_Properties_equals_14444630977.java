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

public class KakaoProfile_Properties_equals_14444630977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21926;
     Object term21963;

    public KakaoProfile_Properties_equals_14444630977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21926 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term21926, term21926.getClass(), "nickname", "uodLjxczjr");
        setField(term21926, term21926.getClass(), "profile_image", "HJLVBQAtGs");
        setField(term21926, term21926.getClass(), "thumbnail_image", "dxAxECMYEm");
        setField(term21926, term21926.getClass(), "this$0", null);
        term21963 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21963;
        callMethod(klass, "equals", argTypes, term21926, args);
    }

};


