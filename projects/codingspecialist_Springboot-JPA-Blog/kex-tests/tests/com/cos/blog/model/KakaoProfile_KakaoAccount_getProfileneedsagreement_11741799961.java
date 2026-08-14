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

public class KakaoProfile_KakaoAccount_getProfileneedsagreement_11741799961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22411;

    public KakaoProfile_KakaoAccount_getProfileneedsagreement_11741799961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term22412 = new Boolean(true);
        Boolean term22452 = new Boolean(true);
        Boolean term22459 = new Boolean(false);
        Boolean term22461 = new Boolean(false);
        Boolean term22463 = new Boolean(true);
        Boolean term22465 = new Boolean(false);
        Boolean term22467 = new Boolean(false);
        Boolean term22469 = new Boolean(false);
        Boolean term22471 = new Boolean(true);
        Boolean term22473 = new Boolean(true);
        Boolean term22475 = new Boolean(false);
        Boolean term22489 = new Boolean(true);
        Boolean term22491 = new Boolean(true);
        Boolean term22493 = new Boolean(true);
        Boolean term22495 = new Boolean(false);
        term22411 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22414 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22451 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22454 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22458 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term22411, term22411.getClass(), "profile_needs_agreement", term22412);
        setField(term22414, term22414.getClass(), "nickname", "HCiwohQDUV");
        setField(term22414, term22414.getClass(), "thumbnail_image_url", "RRWTUIdKkl");
        setField(term22414, term22414.getClass(), "profile_image_url", "pBnfJsGPNO");
        setField(term22451, term22451.getClass(), "profile_needs_agreement", term22452);
        setField(term22454, term22454.getClass(), "nickname", "");
        setField(term22454, term22454.getClass(), "thumbnail_image_url", "");
        setField(term22454, term22454.getClass(), "profile_image_url", "");
        setField(term22458, term22458.getClass(), "profile_needs_agreement", term22459);
        setField(term22458, term22458.getClass(), "profile", null);
        setField(term22458, term22458.getClass(), "has_email", term22461);
        setField(term22458, term22458.getClass(), "email_needs_agreement", term22463);
        setField(term22458, term22458.getClass(), "is_email_valid", term22465);
        setField(term22458, term22458.getClass(), "is_email_verified", term22467);
        setField(term22458, term22458.getClass(), "email", null);
        setField(term22458, term22458.getClass(), "this$0", null);
        setField(term22454, term22454.getClass(), "this$1", term22458);
        setField(term22451, term22451.getClass(), "profile", term22454);
        setField(term22451, term22451.getClass(), "has_email", term22469);
        setField(term22451, term22451.getClass(), "email_needs_agreement", term22471);
        setField(term22451, term22451.getClass(), "is_email_valid", term22473);
        setField(term22451, term22451.getClass(), "is_email_verified", term22475);
        setField(term22451, term22451.getClass(), "email", "iFFcolxwcm");
        setField(term22451, term22451.getClass(), "this$0", null);
        setField(term22414, term22414.getClass(), "this$1", term22451);
        setField(term22411, term22411.getClass(), "profile", term22414);
        setField(term22411, term22411.getClass(), "has_email", term22489);
        setField(term22411, term22411.getClass(), "email_needs_agreement", term22491);
        setField(term22411, term22411.getClass(), "is_email_valid", term22493);
        setField(term22411, term22411.getClass(), "is_email_verified", term22495);
        setField(term22411, term22411.getClass(), "email", "bAsZBSqnyM");
        setField(term22411, term22411.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfile_needs_agreement", argTypes, term22411, args);
    }

};


