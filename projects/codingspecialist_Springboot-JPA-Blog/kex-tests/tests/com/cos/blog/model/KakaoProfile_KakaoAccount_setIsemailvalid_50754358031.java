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

public class KakaoProfile_KakaoAccount_setIsemailvalid_50754358031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25300;

    public KakaoProfile_KakaoAccount_setIsemailvalid_50754358031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25300 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term25300, term25300.getClass(), "profile_needs_agreement", null);
        setField(term25300, term25300.getClass(), "profile", null);
        setField(term25300, term25300.getClass(), "has_email", null);
        setField(term25300, term25300.getClass(), "email_needs_agreement", null);
        setField(term25300, term25300.getClass(), "is_email_valid", null);
        setField(term25300, term25300.getClass(), "is_email_verified", null);
        setField(term25300, term25300.getClass(), "email", null);
        setField(term25300, term25300.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIs_email_valid", argTypes, term25300, args);
    }

};


