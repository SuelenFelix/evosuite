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

public class KakaoProfile_KakaoAccount_setProfile_124334947128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25297;

    public KakaoProfile_KakaoAccount_setProfile_124334947128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25297 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term25297, term25297.getClass(), "profile_needs_agreement", null);
        setField(term25297, term25297.getClass(), "profile", null);
        setField(term25297, term25297.getClass(), "has_email", null);
        setField(term25297, term25297.getClass(), "email_needs_agreement", null);
        setField(term25297, term25297.getClass(), "is_email_valid", null);
        setField(term25297, term25297.getClass(), "is_email_verified", null);
        setField(term25297, term25297.getClass(), "email", null);
        setField(term25297, term25297.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProfile", argTypes, term25297, args);
    }

};


