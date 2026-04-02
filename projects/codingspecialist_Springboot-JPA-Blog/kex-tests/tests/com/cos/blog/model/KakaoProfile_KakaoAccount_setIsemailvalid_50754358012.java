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

public class KakaoProfile_KakaoAccount_setIsemailvalid_50754358012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24225;
     Object term24323;

    public KakaoProfile_KakaoAccount_setIsemailvalid_50754358012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24226 = new Boolean(false);
        Boolean term24266 = new Boolean(false);
        Boolean term24273 = new Boolean(true);
        Boolean term24275 = new Boolean(true);
        Boolean term24277 = new Boolean(false);
        Boolean term24279 = new Boolean(true);
        Boolean term24281 = new Boolean(true);
        Boolean term24283 = new Boolean(false);
        Boolean term24285 = new Boolean(false);
        Boolean term24287 = new Boolean(true);
        Boolean term24289 = new Boolean(false);
        Boolean term24303 = new Boolean(true);
        Boolean term24305 = new Boolean(false);
        Boolean term24307 = new Boolean(false);
        Boolean term24309 = new Boolean(false);
        term24225 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24228 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24265 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24268 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24272 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24225, term24225.getClass(), "profile_needs_agreement", term24226);
        setField(term24228, term24228.getClass(), "nickname", "MnqnyndkhF");
        setField(term24228, term24228.getClass(), "thumbnail_image_url", "MZzoPKpFlh");
        setField(term24228, term24228.getClass(), "profile_image_url", "skVZETaBKX");
        setField(term24265, term24265.getClass(), "profile_needs_agreement", term24266);
        setField(term24268, term24268.getClass(), "nickname", "");
        setField(term24268, term24268.getClass(), "thumbnail_image_url", "");
        setField(term24268, term24268.getClass(), "profile_image_url", "");
        setField(term24272, term24272.getClass(), "profile_needs_agreement", term24273);
        setField(term24272, term24272.getClass(), "profile", null);
        setField(term24272, term24272.getClass(), "has_email", term24275);
        setField(term24272, term24272.getClass(), "email_needs_agreement", term24277);
        setField(term24272, term24272.getClass(), "is_email_valid", term24279);
        setField(term24272, term24272.getClass(), "is_email_verified", term24281);
        setField(term24272, term24272.getClass(), "email", null);
        setField(term24272, term24272.getClass(), "this$0", null);
        setField(term24268, term24268.getClass(), "this$1", term24272);
        setField(term24265, term24265.getClass(), "profile", term24268);
        setField(term24265, term24265.getClass(), "has_email", term24283);
        setField(term24265, term24265.getClass(), "email_needs_agreement", term24285);
        setField(term24265, term24265.getClass(), "is_email_valid", term24287);
        setField(term24265, term24265.getClass(), "is_email_verified", term24289);
        setField(term24265, term24265.getClass(), "email", "mukHRKZmND");
        setField(term24265, term24265.getClass(), "this$0", null);
        setField(term24228, term24228.getClass(), "this$1", term24265);
        setField(term24225, term24225.getClass(), "profile", term24228);
        setField(term24225, term24225.getClass(), "has_email", term24303);
        setField(term24225, term24225.getClass(), "email_needs_agreement", term24305);
        setField(term24225, term24225.getClass(), "is_email_valid", term24307);
        setField(term24225, term24225.getClass(), "is_email_verified", term24309);
        setField(term24225, term24225.getClass(), "email", "WVPSokrFPV");
        setField(term24225, term24225.getClass(), "this$0", null);
        term24323 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term24323;
        callMethod(klass, "setIs_email_valid", argTypes, term24225, args);
    }

};


