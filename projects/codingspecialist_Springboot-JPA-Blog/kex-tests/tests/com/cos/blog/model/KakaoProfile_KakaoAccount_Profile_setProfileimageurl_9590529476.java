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
import java.lang.Object;
import java.lang.Boolean;

public class KakaoProfile_KakaoAccount_Profile_setProfileimageurl_9590529476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10379;

    public KakaoProfile_KakaoAccount_Profile_setProfileimageurl_9590529476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10417 = new Boolean(true);
        Boolean term10457 = new Boolean(false);
        Boolean term10460 = new Boolean(true);
        Boolean term10462 = new Boolean(true);
        Boolean term10464 = new Boolean(false);
        Boolean term10466 = new Boolean(false);
        Boolean term10469 = new Boolean(true);
        Boolean term10471 = new Boolean(false);
        Boolean term10473 = new Boolean(true);
        Boolean term10475 = new Boolean(false);
        term10379 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10416 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10419 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10456 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10459 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term10379, term10379.getClass(), "nickname", "vYYOYhWMWZ");
        setField(term10379, term10379.getClass(), "thumbnail_image_url", "FLQJOzEXff");
        setField(term10379, term10379.getClass(), "profile_image_url", "qlaIVJBSfQ");
        setField(term10416, term10416.getClass(), "profile_needs_agreement", term10417);
        setField(term10419, term10419.getClass(), "nickname", "lYvIWBFFsq");
        setField(term10419, term10419.getClass(), "thumbnail_image_url", "tThwsqWKcE");
        setField(term10419, term10419.getClass(), "profile_image_url", "bkSgsDrkCN");
        setField(term10456, term10456.getClass(), "profile_needs_agreement", term10457);
        setField(term10459, term10459.getClass(), "nickname", null);
        setField(term10459, term10459.getClass(), "thumbnail_image_url", null);
        setField(term10459, term10459.getClass(), "profile_image_url", null);
        setField(term10459, term10459.getClass(), "this$1", null);
        setField(term10456, term10456.getClass(), "profile", term10459);
        setField(term10456, term10456.getClass(), "has_email", term10460);
        setField(term10456, term10456.getClass(), "email_needs_agreement", term10462);
        setField(term10456, term10456.getClass(), "is_email_valid", term10464);
        setField(term10456, term10456.getClass(), "is_email_verified", term10466);
        setField(term10456, term10456.getClass(), "email", "");
        setField(term10456, term10456.getClass(), "this$0", null);
        setField(term10419, term10419.getClass(), "this$1", term10456);
        setField(term10416, term10416.getClass(), "profile", term10419);
        setField(term10416, term10416.getClass(), "has_email", term10469);
        setField(term10416, term10416.getClass(), "email_needs_agreement", term10471);
        setField(term10416, term10416.getClass(), "is_email_valid", term10473);
        setField(term10416, term10416.getClass(), "is_email_verified", term10475);
        setField(term10416, term10416.getClass(), "email", "VZwkkQktrm");
        setField(term10416, term10416.getClass(), "this$0", null);
        setField(term10379, term10379.getClass(), "this$1", term10416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wIuJvIvEMb";
        callMethod(klass, "setProfile_image_url", argTypes, term10379, args);
    }

};


