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

public class KakaoProfile_Properties_setNickname_3354582844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21659;

    public KakaoProfile_Properties_setNickname_3354582844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21659 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term21659, term21659.getClass(), "nickname", "NmUhmPLSgG");
        setField(term21659, term21659.getClass(), "profile_image", "WJosrfBMfA");
        setField(term21659, term21659.getClass(), "thumbnail_image", "ttlGywalKc");
        setField(term21659, term21659.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rQFBspqBzf";
        callMethod(klass, "setNickname", argTypes, term21659, args);
    }

};


