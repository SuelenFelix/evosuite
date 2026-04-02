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

public class KakaoProfile_KakaoAccount_getEmailneedsagreement_16157770523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25292;

    public KakaoProfile_KakaoAccount_getEmailneedsagreement_16157770523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25292 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term25292, term25292.getClass(), "profile_needs_agreement", null);
        setField(term25292, term25292.getClass(), "profile", null);
        setField(term25292, term25292.getClass(), "has_email", null);
        setField(term25292, term25292.getClass(), "email_needs_agreement", null);
        setField(term25292, term25292.getClass(), "is_email_valid", null);
        setField(term25292, term25292.getClass(), "is_email_verified", null);
        setField(term25292, term25292.getClass(), "email", null);
        setField(term25292, term25292.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail_needs_agreement", argTypes, term25292, args);
    }

};


