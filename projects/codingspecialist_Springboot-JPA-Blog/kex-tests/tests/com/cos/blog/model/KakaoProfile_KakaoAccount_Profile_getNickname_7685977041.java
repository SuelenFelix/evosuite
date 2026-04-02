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

public class KakaoProfile_KakaoAccount_Profile_getNickname_7685977041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9435;

    public KakaoProfile_KakaoAccount_Profile_getNickname_7685977041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term9473 = new Boolean(false);
        Boolean term9513 = new Boolean(false);
        Boolean term9516 = new Boolean(true);
        Boolean term9518 = new Boolean(true);
        Boolean term9520 = new Boolean(false);
        Boolean term9522 = new Boolean(true);
        Boolean term9525 = new Boolean(true);
        Boolean term9527 = new Boolean(true);
        Boolean term9529 = new Boolean(false);
        Boolean term9531 = new Boolean(true);
        term9435 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9472 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9475 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9512 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9515 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term9435, term9435.getClass(), "nickname", "BkIxsyPkGy");
        setField(term9435, term9435.getClass(), "thumbnail_image_url", "mrMGwoRgVY");
        setField(term9435, term9435.getClass(), "profile_image_url", "mxVLTgCwki");
        setField(term9472, term9472.getClass(), "profile_needs_agreement", term9473);
        setField(term9475, term9475.getClass(), "nickname", "wCurppnDSA");
        setField(term9475, term9475.getClass(), "thumbnail_image_url", "JydxSNTMYt");
        setField(term9475, term9475.getClass(), "profile_image_url", "KpurAcrHYT");
        setField(term9512, term9512.getClass(), "profile_needs_agreement", term9513);
        setField(term9515, term9515.getClass(), "nickname", null);
        setField(term9515, term9515.getClass(), "thumbnail_image_url", null);
        setField(term9515, term9515.getClass(), "profile_image_url", null);
        setField(term9515, term9515.getClass(), "this$1", null);
        setField(term9512, term9512.getClass(), "profile", term9515);
        setField(term9512, term9512.getClass(), "has_email", term9516);
        setField(term9512, term9512.getClass(), "email_needs_agreement", term9518);
        setField(term9512, term9512.getClass(), "is_email_valid", term9520);
        setField(term9512, term9512.getClass(), "is_email_verified", term9522);
        setField(term9512, term9512.getClass(), "email", "");
        setField(term9512, term9512.getClass(), "this$0", null);
        setField(term9475, term9475.getClass(), "this$1", term9512);
        setField(term9472, term9472.getClass(), "profile", term9475);
        setField(term9472, term9472.getClass(), "has_email", term9525);
        setField(term9472, term9472.getClass(), "email_needs_agreement", term9527);
        setField(term9472, term9472.getClass(), "is_email_valid", term9529);
        setField(term9472, term9472.getClass(), "is_email_verified", term9531);
        setField(term9472, term9472.getClass(), "email", "pMfTuAFXxg");
        setField(term9472, term9472.getClass(), "this$0", null);
        setField(term9435, term9435.getClass(), "this$1", term9472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickname", argTypes, term9435, args);
    }

};


