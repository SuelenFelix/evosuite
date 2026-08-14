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

public class KakaoProfile_KakaoAccount_init_19637335110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22206;

    public KakaoProfile_KakaoAccount_init_19637335110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22207 = new Integer(1162663216);
        Boolean term22259 = new Boolean(true);
        Boolean term22299 = new Boolean(true);
        Boolean term22302 = new Boolean(false);
        Boolean term22304 = new Boolean(false);
        Boolean term22306 = new Boolean(true);
        Boolean term22308 = new Boolean(false);
        Boolean term22311 = new Boolean(true);
        Boolean term22313 = new Boolean(true);
        Boolean term22315 = new Boolean(false);
        Boolean term22317 = new Boolean(false);
        term22206 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term22221 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term22258 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22261 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22298 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22301 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term22206, term22206.getClass(), "id", term22207);
        setField(term22206, term22206.getClass(), "connected_at", "qPgbFtsgtk");
        setField(term22221, term22221.getClass(), "nickname", "nkmiePLZgp");
        setField(term22221, term22221.getClass(), "profile_image", "VoCvDpwwFr");
        setField(term22221, term22221.getClass(), "thumbnail_image", "zYOmoQqDOd");
        setField(term22221, term22221.getClass(), "this$0", null);
        setField(term22206, term22206.getClass(), "properties", term22221);
        setField(term22258, term22258.getClass(), "profile_needs_agreement", term22259);
        setField(term22261, term22261.getClass(), "nickname", "kmgEVEqTGa");
        setField(term22261, term22261.getClass(), "thumbnail_image_url", "qakIqInzyM");
        setField(term22261, term22261.getClass(), "profile_image_url", "EOsBgwlmva");
        setField(term22298, term22298.getClass(), "profile_needs_agreement", term22299);
        setField(term22301, term22301.getClass(), "nickname", null);
        setField(term22301, term22301.getClass(), "thumbnail_image_url", null);
        setField(term22301, term22301.getClass(), "profile_image_url", null);
        setField(term22301, term22301.getClass(), "this$1", null);
        setField(term22298, term22298.getClass(), "profile", term22301);
        setField(term22298, term22298.getClass(), "has_email", term22302);
        setField(term22298, term22298.getClass(), "email_needs_agreement", term22304);
        setField(term22298, term22298.getClass(), "is_email_valid", term22306);
        setField(term22298, term22298.getClass(), "is_email_verified", term22308);
        setField(term22298, term22298.getClass(), "email", "");
        setField(term22298, term22298.getClass(), "this$0", null);
        setField(term22261, term22261.getClass(), "this$1", term22298);
        setField(term22258, term22258.getClass(), "profile", term22261);
        setField(term22258, term22258.getClass(), "has_email", term22311);
        setField(term22258, term22258.getClass(), "email_needs_agreement", term22313);
        setField(term22258, term22258.getClass(), "is_email_valid", term22315);
        setField(term22258, term22258.getClass(), "is_email_verified", term22317);
        setField(term22258, term22258.getClass(), "email", "eMlkqCfrnK");
        setField(term22258, term22258.getClass(), "this$0", null);
        setField(term22206, term22206.getClass(), "kakao_account", term22258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.KakaoProfile");
        Object[] args = new Object[1];
        args[0] = term22206;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


