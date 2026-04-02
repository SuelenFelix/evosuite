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

public class KakaoProfile_KakaoAccount_getEmailneedsagreement_1615777054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22855;

    public KakaoProfile_KakaoAccount_getEmailneedsagreement_1615777054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term22856 = new Boolean(true);
        Boolean term22896 = new Boolean(true);
        Boolean term22903 = new Boolean(true);
        Boolean term22905 = new Boolean(true);
        Boolean term22907 = new Boolean(false);
        Boolean term22909 = new Boolean(true);
        Boolean term22911 = new Boolean(false);
        Boolean term22913 = new Boolean(true);
        Boolean term22915 = new Boolean(true);
        Boolean term22917 = new Boolean(false);
        Boolean term22919 = new Boolean(false);
        Boolean term22933 = new Boolean(true);
        Boolean term22935 = new Boolean(false);
        Boolean term22937 = new Boolean(false);
        Boolean term22939 = new Boolean(true);
        term22855 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22858 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22895 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22898 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22902 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term22855, term22855.getClass(), "profile_needs_agreement", term22856);
        setField(term22858, term22858.getClass(), "nickname", "QuNSfeKtAH");
        setField(term22858, term22858.getClass(), "thumbnail_image_url", "vFhRdscfFA");
        setField(term22858, term22858.getClass(), "profile_image_url", "ZmfocrvaII");
        setField(term22895, term22895.getClass(), "profile_needs_agreement", term22896);
        setField(term22898, term22898.getClass(), "nickname", "");
        setField(term22898, term22898.getClass(), "thumbnail_image_url", "");
        setField(term22898, term22898.getClass(), "profile_image_url", "");
        setField(term22902, term22902.getClass(), "profile_needs_agreement", term22903);
        setField(term22902, term22902.getClass(), "profile", null);
        setField(term22902, term22902.getClass(), "has_email", term22905);
        setField(term22902, term22902.getClass(), "email_needs_agreement", term22907);
        setField(term22902, term22902.getClass(), "is_email_valid", term22909);
        setField(term22902, term22902.getClass(), "is_email_verified", term22911);
        setField(term22902, term22902.getClass(), "email", null);
        setField(term22902, term22902.getClass(), "this$0", null);
        setField(term22898, term22898.getClass(), "this$1", term22902);
        setField(term22895, term22895.getClass(), "profile", term22898);
        setField(term22895, term22895.getClass(), "has_email", term22913);
        setField(term22895, term22895.getClass(), "email_needs_agreement", term22915);
        setField(term22895, term22895.getClass(), "is_email_valid", term22917);
        setField(term22895, term22895.getClass(), "is_email_verified", term22919);
        setField(term22895, term22895.getClass(), "email", "ivAOXnVjmg");
        setField(term22895, term22895.getClass(), "this$0", null);
        setField(term22858, term22858.getClass(), "this$1", term22895);
        setField(term22855, term22855.getClass(), "profile", term22858);
        setField(term22855, term22855.getClass(), "has_email", term22933);
        setField(term22855, term22855.getClass(), "email_needs_agreement", term22935);
        setField(term22855, term22855.getClass(), "is_email_valid", term22937);
        setField(term22855, term22855.getClass(), "is_email_verified", term22939);
        setField(term22855, term22855.getClass(), "email", "FivesaUeHG");
        setField(term22855, term22855.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail_needs_agreement", argTypes, term22855, args);
    }

};


