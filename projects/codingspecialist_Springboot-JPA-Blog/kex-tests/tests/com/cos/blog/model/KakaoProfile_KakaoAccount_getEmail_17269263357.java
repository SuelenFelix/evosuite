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

public class KakaoProfile_KakaoAccount_getEmail_17269263357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23299;

    public KakaoProfile_KakaoAccount_getEmail_17269263357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term23300 = new Boolean(true);
        Boolean term23340 = new Boolean(true);
        Boolean term23347 = new Boolean(true);
        Boolean term23349 = new Boolean(false);
        Boolean term23351 = new Boolean(true);
        Boolean term23353 = new Boolean(false);
        Boolean term23355 = new Boolean(true);
        Boolean term23357 = new Boolean(true);
        Boolean term23359 = new Boolean(false);
        Boolean term23361 = new Boolean(true);
        Boolean term23363 = new Boolean(false);
        Boolean term23377 = new Boolean(false);
        Boolean term23379 = new Boolean(true);
        Boolean term23381 = new Boolean(false);
        Boolean term23383 = new Boolean(false);
        term23299 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23302 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23339 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23342 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23346 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term23299, term23299.getClass(), "profile_needs_agreement", term23300);
        setField(term23302, term23302.getClass(), "nickname", "JvKKIGdUWh");
        setField(term23302, term23302.getClass(), "thumbnail_image_url", "DInvDrzBtt");
        setField(term23302, term23302.getClass(), "profile_image_url", "igZJubDPuK");
        setField(term23339, term23339.getClass(), "profile_needs_agreement", term23340);
        setField(term23342, term23342.getClass(), "nickname", "");
        setField(term23342, term23342.getClass(), "thumbnail_image_url", "");
        setField(term23342, term23342.getClass(), "profile_image_url", "");
        setField(term23346, term23346.getClass(), "profile_needs_agreement", term23347);
        setField(term23346, term23346.getClass(), "profile", null);
        setField(term23346, term23346.getClass(), "has_email", term23349);
        setField(term23346, term23346.getClass(), "email_needs_agreement", term23351);
        setField(term23346, term23346.getClass(), "is_email_valid", term23353);
        setField(term23346, term23346.getClass(), "is_email_verified", term23355);
        setField(term23346, term23346.getClass(), "email", null);
        setField(term23346, term23346.getClass(), "this$0", null);
        setField(term23342, term23342.getClass(), "this$1", term23346);
        setField(term23339, term23339.getClass(), "profile", term23342);
        setField(term23339, term23339.getClass(), "has_email", term23357);
        setField(term23339, term23339.getClass(), "email_needs_agreement", term23359);
        setField(term23339, term23339.getClass(), "is_email_valid", term23361);
        setField(term23339, term23339.getClass(), "is_email_verified", term23363);
        setField(term23339, term23339.getClass(), "email", "VAFSknHLsZ");
        setField(term23339, term23339.getClass(), "this$0", null);
        setField(term23302, term23302.getClass(), "this$1", term23339);
        setField(term23299, term23299.getClass(), "profile", term23302);
        setField(term23299, term23299.getClass(), "has_email", term23377);
        setField(term23299, term23299.getClass(), "email_needs_agreement", term23379);
        setField(term23299, term23299.getClass(), "is_email_valid", term23381);
        setField(term23299, term23299.getClass(), "is_email_verified", term23383);
        setField(term23299, term23299.getClass(), "email", "MamzBtwhiz");
        setField(term23299, term23299.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term23299, args);
    }

};


