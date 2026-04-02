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

public class KakaoProfile_getKakaoaccount_6014268184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34576;

    public KakaoProfile_getKakaoaccount_6014268184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34577 = new Integer(-616727354);
        Boolean term34629 = new Boolean(true);
        Boolean term34669 = new Boolean(false);
        Boolean term34672 = new Boolean(false);
        Boolean term34674 = new Boolean(true);
        Boolean term34676 = new Boolean(true);
        Boolean term34678 = new Boolean(false);
        Boolean term34681 = new Boolean(false);
        Boolean term34683 = new Boolean(false);
        Boolean term34685 = new Boolean(true);
        Boolean term34687 = new Boolean(true);
        term34576 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term34591 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term34628 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34631 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term34668 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34671 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term34576, term34576.getClass(), "id", term34577);
        setField(term34576, term34576.getClass(), "connected_at", "ILplPJhYrB");
        setField(term34591, term34591.getClass(), "nickname", "ZLOixiOrLS");
        setField(term34591, term34591.getClass(), "profile_image", "jyRmrZMyEy");
        setField(term34591, term34591.getClass(), "thumbnail_image", "EMhKuKuvTr");
        setField(term34591, term34591.getClass(), "this$0", null);
        setField(term34576, term34576.getClass(), "properties", term34591);
        setField(term34628, term34628.getClass(), "profile_needs_agreement", term34629);
        setField(term34631, term34631.getClass(), "nickname", "hjuOnNVIUc");
        setField(term34631, term34631.getClass(), "thumbnail_image_url", "MTxeYrMCEJ");
        setField(term34631, term34631.getClass(), "profile_image_url", "SbPIlRKXLL");
        setField(term34668, term34668.getClass(), "profile_needs_agreement", term34669);
        setField(term34671, term34671.getClass(), "nickname", null);
        setField(term34671, term34671.getClass(), "thumbnail_image_url", null);
        setField(term34671, term34671.getClass(), "profile_image_url", null);
        setField(term34671, term34671.getClass(), "this$1", null);
        setField(term34668, term34668.getClass(), "profile", term34671);
        setField(term34668, term34668.getClass(), "has_email", term34672);
        setField(term34668, term34668.getClass(), "email_needs_agreement", term34674);
        setField(term34668, term34668.getClass(), "is_email_valid", term34676);
        setField(term34668, term34668.getClass(), "is_email_verified", term34678);
        setField(term34668, term34668.getClass(), "email", "");
        setField(term34668, term34668.getClass(), "this$0", null);
        setField(term34631, term34631.getClass(), "this$1", term34668);
        setField(term34628, term34628.getClass(), "profile", term34631);
        setField(term34628, term34628.getClass(), "has_email", term34681);
        setField(term34628, term34628.getClass(), "email_needs_agreement", term34683);
        setField(term34628, term34628.getClass(), "is_email_valid", term34685);
        setField(term34628, term34628.getClass(), "is_email_verified", term34687);
        setField(term34628, term34628.getClass(), "email", "pWmmwQMysX");
        setField(term34628, term34628.getClass(), "this$0", null);
        setField(term34576, term34576.getClass(), "kakao_account", term34628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKakao_account", argTypes, term34576, args);
    }

};


