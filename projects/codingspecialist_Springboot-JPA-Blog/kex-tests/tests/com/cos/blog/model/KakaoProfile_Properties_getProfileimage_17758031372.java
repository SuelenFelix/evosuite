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

public class KakaoProfile_Properties_getProfileimage_17758031372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21525;

    public KakaoProfile_Properties_getProfileimage_17758031372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21525 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term21525, term21525.getClass(), "nickname", "faGVqjLquQ");
        setField(term21525, term21525.getClass(), "profile_image", "MbsTNUmNqV");
        setField(term21525, term21525.getClass(), "thumbnail_image", "VdDIonpedU");
        setField(term21525, term21525.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfile_image", argTypes, term21525, args);
    }

};


