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

public class KakaoProfile_equals_5750701669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35840;
     Object term35965;

    public KakaoProfile_equals_5750701669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35841 = new Integer(-522618178);
        Boolean term35893 = new Boolean(true);
        Boolean term35933 = new Boolean(false);
        Boolean term35936 = new Boolean(true);
        Boolean term35938 = new Boolean(false);
        Boolean term35940 = new Boolean(true);
        Boolean term35942 = new Boolean(true);
        Boolean term35945 = new Boolean(true);
        Boolean term35947 = new Boolean(false);
        Boolean term35949 = new Boolean(false);
        Boolean term35951 = new Boolean(false);
        term35840 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term35855 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term35892 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35895 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term35932 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35935 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term35840, term35840.getClass(), "id", term35841);
        setField(term35840, term35840.getClass(), "connected_at", "JhehNkztDU");
        setField(term35855, term35855.getClass(), "nickname", "axzwQpwfps");
        setField(term35855, term35855.getClass(), "profile_image", "SRphuuiFTJ");
        setField(term35855, term35855.getClass(), "thumbnail_image", "SLJslBhpEj");
        setField(term35855, term35855.getClass(), "this$0", null);
        setField(term35840, term35840.getClass(), "properties", term35855);
        setField(term35892, term35892.getClass(), "profile_needs_agreement", term35893);
        setField(term35895, term35895.getClass(), "nickname", "BkSzKYsyMt");
        setField(term35895, term35895.getClass(), "thumbnail_image_url", "BehEjNaXVK");
        setField(term35895, term35895.getClass(), "profile_image_url", "TrunCyrewP");
        setField(term35932, term35932.getClass(), "profile_needs_agreement", term35933);
        setField(term35935, term35935.getClass(), "nickname", null);
        setField(term35935, term35935.getClass(), "thumbnail_image_url", null);
        setField(term35935, term35935.getClass(), "profile_image_url", null);
        setField(term35935, term35935.getClass(), "this$1", null);
        setField(term35932, term35932.getClass(), "profile", term35935);
        setField(term35932, term35932.getClass(), "has_email", term35936);
        setField(term35932, term35932.getClass(), "email_needs_agreement", term35938);
        setField(term35932, term35932.getClass(), "is_email_valid", term35940);
        setField(term35932, term35932.getClass(), "is_email_verified", term35942);
        setField(term35932, term35932.getClass(), "email", "");
        setField(term35932, term35932.getClass(), "this$0", null);
        setField(term35895, term35895.getClass(), "this$1", term35932);
        setField(term35892, term35892.getClass(), "profile", term35895);
        setField(term35892, term35892.getClass(), "has_email", term35945);
        setField(term35892, term35892.getClass(), "email_needs_agreement", term35947);
        setField(term35892, term35892.getClass(), "is_email_valid", term35949);
        setField(term35892, term35892.getClass(), "is_email_verified", term35951);
        setField(term35892, term35892.getClass(), "email", "PoxurfXwit");
        setField(term35892, term35892.getClass(), "this$0", null);
        setField(term35840, term35840.getClass(), "kakao_account", term35892);
        term35965 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term35965;
        callMethod(klass, "equals", argTypes, term35840, args);
    }

};


