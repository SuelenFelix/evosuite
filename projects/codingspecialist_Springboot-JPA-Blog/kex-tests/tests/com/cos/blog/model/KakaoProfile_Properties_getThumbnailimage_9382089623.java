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

public class KakaoProfile_Properties_getThumbnailimage_9382089623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21592;

    public KakaoProfile_Properties_getThumbnailimage_9382089623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21592 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term21592, term21592.getClass(), "nickname", "VjtXZcUFNx");
        setField(term21592, term21592.getClass(), "profile_image", "bOZSTccXbt");
        setField(term21592, term21592.getClass(), "thumbnail_image", "MBSsxxeNUU");
        setField(term21592, term21592.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThumbnail_image", argTypes, term21592, args);
    }

};


