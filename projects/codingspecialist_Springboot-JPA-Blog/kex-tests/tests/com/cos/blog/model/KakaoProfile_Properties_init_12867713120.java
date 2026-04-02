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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class KakaoProfile_Properties_init_12867713120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21253;

    public KakaoProfile_Properties_init_12867713120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21254 = new Integer(568599855);
        Boolean term21306 = new Boolean(false);
        Boolean term21346 = new Boolean(false);
        Boolean term21349 = new Boolean(false);
        Boolean term21351 = new Boolean(false);
        Boolean term21353 = new Boolean(true);
        Boolean term21355 = new Boolean(true);
        Boolean term21358 = new Boolean(false);
        Boolean term21360 = new Boolean(false);
        Boolean term21362 = new Boolean(false);
        Boolean term21364 = new Boolean(false);
        term21253 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term21268 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term21305 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term21308 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term21345 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term21348 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term21253, term21253.getClass(), "id", term21254);
        setField(term21253, term21253.getClass(), "connected_at", "WRisHdgnmm");
        setField(term21268, term21268.getClass(), "nickname", "XxZiwWPLOx");
        setField(term21268, term21268.getClass(), "profile_image", "nyqsjMHTba");
        setField(term21268, term21268.getClass(), "thumbnail_image", "ylUHzURWyg");
        setField(term21268, term21268.getClass(), "this$0", null);
        setField(term21253, term21253.getClass(), "properties", term21268);
        setField(term21305, term21305.getClass(), "profile_needs_agreement", term21306);
        setField(term21308, term21308.getClass(), "nickname", "VuAuFBlHxQ");
        setField(term21308, term21308.getClass(), "thumbnail_image_url", "nOLtCslMMH");
        setField(term21308, term21308.getClass(), "profile_image_url", "dIQWOeKQVj");
        setField(term21345, term21345.getClass(), "profile_needs_agreement", term21346);
        setField(term21348, term21348.getClass(), "nickname", null);
        setField(term21348, term21348.getClass(), "thumbnail_image_url", null);
        setField(term21348, term21348.getClass(), "profile_image_url", null);
        setField(term21348, term21348.getClass(), "this$1", null);
        setField(term21345, term21345.getClass(), "profile", term21348);
        setField(term21345, term21345.getClass(), "has_email", term21349);
        setField(term21345, term21345.getClass(), "email_needs_agreement", term21351);
        setField(term21345, term21345.getClass(), "is_email_valid", term21353);
        setField(term21345, term21345.getClass(), "is_email_verified", term21355);
        setField(term21345, term21345.getClass(), "email", "");
        setField(term21345, term21345.getClass(), "this$0", null);
        setField(term21308, term21308.getClass(), "this$1", term21345);
        setField(term21305, term21305.getClass(), "profile", term21308);
        setField(term21305, term21305.getClass(), "has_email", term21358);
        setField(term21305, term21305.getClass(), "email_needs_agreement", term21360);
        setField(term21305, term21305.getClass(), "is_email_valid", term21362);
        setField(term21305, term21305.getClass(), "is_email_verified", term21364);
        setField(term21305, term21305.getClass(), "email", "nPfruizWey");
        setField(term21305, term21305.getClass(), "this$0", null);
        setField(term21253, term21253.getClass(), "kakao_account", term21305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.KakaoProfile");
        Object[] args = new Object[1];
        args[0] = term21253;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


