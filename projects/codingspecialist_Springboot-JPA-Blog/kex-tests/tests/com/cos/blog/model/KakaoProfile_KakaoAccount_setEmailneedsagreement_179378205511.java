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

public class KakaoProfile_KakaoAccount_setEmailneedsagreement_179378205511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24075;
     Object term24173;

    public KakaoProfile_KakaoAccount_setEmailneedsagreement_179378205511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24076 = new Boolean(false);
        Boolean term24116 = new Boolean(false);
        Boolean term24123 = new Boolean(false);
        Boolean term24125 = new Boolean(true);
        Boolean term24127 = new Boolean(true);
        Boolean term24129 = new Boolean(false);
        Boolean term24131 = new Boolean(true);
        Boolean term24133 = new Boolean(false);
        Boolean term24135 = new Boolean(true);
        Boolean term24137 = new Boolean(true);
        Boolean term24139 = new Boolean(true);
        Boolean term24153 = new Boolean(false);
        Boolean term24155 = new Boolean(true);
        Boolean term24157 = new Boolean(false);
        Boolean term24159 = new Boolean(true);
        term24075 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24078 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24115 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24118 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24122 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24075, term24075.getClass(), "profile_needs_agreement", term24076);
        setField(term24078, term24078.getClass(), "nickname", "vRjHouXWLC");
        setField(term24078, term24078.getClass(), "thumbnail_image_url", "XghDInkWEe");
        setField(term24078, term24078.getClass(), "profile_image_url", "zPDuGbsYGT");
        setField(term24115, term24115.getClass(), "profile_needs_agreement", term24116);
        setField(term24118, term24118.getClass(), "nickname", "");
        setField(term24118, term24118.getClass(), "thumbnail_image_url", "");
        setField(term24118, term24118.getClass(), "profile_image_url", "");
        setField(term24122, term24122.getClass(), "profile_needs_agreement", term24123);
        setField(term24122, term24122.getClass(), "profile", null);
        setField(term24122, term24122.getClass(), "has_email", term24125);
        setField(term24122, term24122.getClass(), "email_needs_agreement", term24127);
        setField(term24122, term24122.getClass(), "is_email_valid", term24129);
        setField(term24122, term24122.getClass(), "is_email_verified", term24131);
        setField(term24122, term24122.getClass(), "email", null);
        setField(term24122, term24122.getClass(), "this$0", null);
        setField(term24118, term24118.getClass(), "this$1", term24122);
        setField(term24115, term24115.getClass(), "profile", term24118);
        setField(term24115, term24115.getClass(), "has_email", term24133);
        setField(term24115, term24115.getClass(), "email_needs_agreement", term24135);
        setField(term24115, term24115.getClass(), "is_email_valid", term24137);
        setField(term24115, term24115.getClass(), "is_email_verified", term24139);
        setField(term24115, term24115.getClass(), "email", "uxoFwkPfXf");
        setField(term24115, term24115.getClass(), "this$0", null);
        setField(term24078, term24078.getClass(), "this$1", term24115);
        setField(term24075, term24075.getClass(), "profile", term24078);
        setField(term24075, term24075.getClass(), "has_email", term24153);
        setField(term24075, term24075.getClass(), "email_needs_agreement", term24155);
        setField(term24075, term24075.getClass(), "is_email_valid", term24157);
        setField(term24075, term24075.getClass(), "is_email_verified", term24159);
        setField(term24075, term24075.getClass(), "email", "OoVnZTvxUt");
        setField(term24075, term24075.getClass(), "this$0", null);
        term24173 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term24173;
        callMethod(klass, "setEmail_needs_agreement", argTypes, term24075, args);
    }

};


