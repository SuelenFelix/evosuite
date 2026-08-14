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

public class KakaoProfile_hashCode_102375684111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36252;

    public KakaoProfile_hashCode_102375684111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36253 = new Integer(-883034806);
        Boolean term36305 = new Boolean(false);
        Boolean term36345 = new Boolean(true);
        Boolean term36348 = new Boolean(false);
        Boolean term36350 = new Boolean(true);
        Boolean term36352 = new Boolean(false);
        Boolean term36354 = new Boolean(true);
        Boolean term36357 = new Boolean(false);
        Boolean term36359 = new Boolean(true);
        Boolean term36361 = new Boolean(false);
        Boolean term36363 = new Boolean(false);
        term36252 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term36267 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term36304 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term36307 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term36344 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term36347 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term36252, term36252.getClass(), "id", term36253);
        setField(term36252, term36252.getClass(), "connected_at", "VNJLpmwKSs");
        setField(term36267, term36267.getClass(), "nickname", "kOHYxuEOpb");
        setField(term36267, term36267.getClass(), "profile_image", "kyzuYwxwKl");
        setField(term36267, term36267.getClass(), "thumbnail_image", "plqwsHlTLA");
        setField(term36267, term36267.getClass(), "this$0", null);
        setField(term36252, term36252.getClass(), "properties", term36267);
        setField(term36304, term36304.getClass(), "profile_needs_agreement", term36305);
        setField(term36307, term36307.getClass(), "nickname", "DDkbTPlKrm");
        setField(term36307, term36307.getClass(), "thumbnail_image_url", "EElRQZBfvW");
        setField(term36307, term36307.getClass(), "profile_image_url", "grlbPsQxaR");
        setField(term36344, term36344.getClass(), "profile_needs_agreement", term36345);
        setField(term36347, term36347.getClass(), "nickname", null);
        setField(term36347, term36347.getClass(), "thumbnail_image_url", null);
        setField(term36347, term36347.getClass(), "profile_image_url", null);
        setField(term36347, term36347.getClass(), "this$1", null);
        setField(term36344, term36344.getClass(), "profile", term36347);
        setField(term36344, term36344.getClass(), "has_email", term36348);
        setField(term36344, term36344.getClass(), "email_needs_agreement", term36350);
        setField(term36344, term36344.getClass(), "is_email_valid", term36352);
        setField(term36344, term36344.getClass(), "is_email_verified", term36354);
        setField(term36344, term36344.getClass(), "email", "");
        setField(term36344, term36344.getClass(), "this$0", null);
        setField(term36307, term36307.getClass(), "this$1", term36344);
        setField(term36304, term36304.getClass(), "profile", term36307);
        setField(term36304, term36304.getClass(), "has_email", term36357);
        setField(term36304, term36304.getClass(), "email_needs_agreement", term36359);
        setField(term36304, term36304.getClass(), "is_email_valid", term36361);
        setField(term36304, term36304.getClass(), "is_email_verified", term36363);
        setField(term36304, term36304.getClass(), "email", "aqayJgOWOQ");
        setField(term36304, term36304.getClass(), "this$0", null);
        setField(term36252, term36252.getClass(), "kakao_account", term36304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term36252, args);
    }

};


