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
import java.lang.Boolean;
import java.lang.Object;

public class KakaoProfile_KakaoAccount_setEmail_130325791914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24525;

    public KakaoProfile_KakaoAccount_setEmail_130325791914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24526 = new Boolean(true);
        Boolean term24566 = new Boolean(true);
        Boolean term24573 = new Boolean(true);
        Boolean term24575 = new Boolean(true);
        Boolean term24577 = new Boolean(true);
        Boolean term24579 = new Boolean(false);
        Boolean term24581 = new Boolean(true);
        Boolean term24583 = new Boolean(false);
        Boolean term24585 = new Boolean(true);
        Boolean term24587 = new Boolean(false);
        Boolean term24589 = new Boolean(false);
        Boolean term24603 = new Boolean(true);
        Boolean term24605 = new Boolean(false);
        Boolean term24607 = new Boolean(false);
        Boolean term24609 = new Boolean(true);
        term24525 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24528 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24565 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24568 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24572 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24525, term24525.getClass(), "profile_needs_agreement", term24526);
        setField(term24528, term24528.getClass(), "nickname", "TLUhUnoanK");
        setField(term24528, term24528.getClass(), "thumbnail_image_url", "JXyQTIyIrU");
        setField(term24528, term24528.getClass(), "profile_image_url", "uplmRQRGWr");
        setField(term24565, term24565.getClass(), "profile_needs_agreement", term24566);
        setField(term24568, term24568.getClass(), "nickname", "");
        setField(term24568, term24568.getClass(), "thumbnail_image_url", "");
        setField(term24568, term24568.getClass(), "profile_image_url", "");
        setField(term24572, term24572.getClass(), "profile_needs_agreement", term24573);
        setField(term24572, term24572.getClass(), "profile", null);
        setField(term24572, term24572.getClass(), "has_email", term24575);
        setField(term24572, term24572.getClass(), "email_needs_agreement", term24577);
        setField(term24572, term24572.getClass(), "is_email_valid", term24579);
        setField(term24572, term24572.getClass(), "is_email_verified", term24581);
        setField(term24572, term24572.getClass(), "email", null);
        setField(term24572, term24572.getClass(), "this$0", null);
        setField(term24568, term24568.getClass(), "this$1", term24572);
        setField(term24565, term24565.getClass(), "profile", term24568);
        setField(term24565, term24565.getClass(), "has_email", term24583);
        setField(term24565, term24565.getClass(), "email_needs_agreement", term24585);
        setField(term24565, term24565.getClass(), "is_email_valid", term24587);
        setField(term24565, term24565.getClass(), "is_email_verified", term24589);
        setField(term24565, term24565.getClass(), "email", "JUQnEoujef");
        setField(term24565, term24565.getClass(), "this$0", null);
        setField(term24528, term24528.getClass(), "this$1", term24565);
        setField(term24525, term24525.getClass(), "profile", term24528);
        setField(term24525, term24525.getClass(), "has_email", term24603);
        setField(term24525, term24525.getClass(), "email_needs_agreement", term24605);
        setField(term24525, term24525.getClass(), "is_email_valid", term24607);
        setField(term24525, term24525.getClass(), "is_email_verified", term24609);
        setField(term24525, term24525.getClass(), "email", "riXARUiigm");
        setField(term24525, term24525.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RbXhBDZbRT";
        callMethod(klass, "setEmail", argTypes, term24525, args);
    }

};


