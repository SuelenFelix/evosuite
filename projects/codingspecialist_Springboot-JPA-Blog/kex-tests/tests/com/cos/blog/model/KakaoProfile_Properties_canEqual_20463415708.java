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

public class KakaoProfile_Properties_canEqual_20463415708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21994;
     Object term22031;

    public KakaoProfile_Properties_canEqual_20463415708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21994 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term21994, term21994.getClass(), "nickname", "ylGHeywyhx");
        setField(term21994, term21994.getClass(), "profile_image", "SqMpUczXhg");
        setField(term21994, term21994.getClass(), "thumbnail_image", "voDQuoTpgt");
        setField(term21994, term21994.getClass(), "this$0", null);
        term22031 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22031;
        callMethod(klass, "canEqual", argTypes, term21994, args);
    }

};


