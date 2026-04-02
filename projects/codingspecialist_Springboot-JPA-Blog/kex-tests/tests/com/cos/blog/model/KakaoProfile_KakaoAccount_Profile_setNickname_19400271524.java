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

public class KakaoProfile_KakaoAccount_Profile_setNickname_19400271524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9975;

    public KakaoProfile_KakaoAccount_Profile_setNickname_19400271524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10013 = new Boolean(true);
        Boolean term10053 = new Boolean(true);
        Boolean term10056 = new Boolean(true);
        Boolean term10058 = new Boolean(false);
        Boolean term10060 = new Boolean(false);
        Boolean term10062 = new Boolean(false);
        Boolean term10065 = new Boolean(false);
        Boolean term10067 = new Boolean(false);
        Boolean term10069 = new Boolean(false);
        Boolean term10071 = new Boolean(false);
        term9975 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10012 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10015 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10052 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10055 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term9975, term9975.getClass(), "nickname", "uyLBVQYcOV");
        setField(term9975, term9975.getClass(), "thumbnail_image_url", "PoTZjDuBHa");
        setField(term9975, term9975.getClass(), "profile_image_url", "MIwvgVrhzP");
        setField(term10012, term10012.getClass(), "profile_needs_agreement", term10013);
        setField(term10015, term10015.getClass(), "nickname", "HcUUieXdep");
        setField(term10015, term10015.getClass(), "thumbnail_image_url", "AbonCTtbef");
        setField(term10015, term10015.getClass(), "profile_image_url", "maXrGOGoKA");
        setField(term10052, term10052.getClass(), "profile_needs_agreement", term10053);
        setField(term10055, term10055.getClass(), "nickname", null);
        setField(term10055, term10055.getClass(), "thumbnail_image_url", null);
        setField(term10055, term10055.getClass(), "profile_image_url", null);
        setField(term10055, term10055.getClass(), "this$1", null);
        setField(term10052, term10052.getClass(), "profile", term10055);
        setField(term10052, term10052.getClass(), "has_email", term10056);
        setField(term10052, term10052.getClass(), "email_needs_agreement", term10058);
        setField(term10052, term10052.getClass(), "is_email_valid", term10060);
        setField(term10052, term10052.getClass(), "is_email_verified", term10062);
        setField(term10052, term10052.getClass(), "email", "");
        setField(term10052, term10052.getClass(), "this$0", null);
        setField(term10015, term10015.getClass(), "this$1", term10052);
        setField(term10012, term10012.getClass(), "profile", term10015);
        setField(term10012, term10012.getClass(), "has_email", term10065);
        setField(term10012, term10012.getClass(), "email_needs_agreement", term10067);
        setField(term10012, term10012.getClass(), "is_email_valid", term10069);
        setField(term10012, term10012.getClass(), "is_email_verified", term10071);
        setField(term10012, term10012.getClass(), "email", "iMsqJaKlDC");
        setField(term10012, term10012.getClass(), "this$0", null);
        setField(term9975, term9975.getClass(), "this$1", term10012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aPkGHbZyjj";
        callMethod(klass, "setNickname", argTypes, term9975, args);
    }

};


