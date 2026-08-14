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

public class KakaoProfile_canEqual_22909246310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36046;
     Object term36171;

    public KakaoProfile_canEqual_22909246310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36047 = new Integer(1134449235);
        Boolean term36099 = new Boolean(true);
        Boolean term36139 = new Boolean(true);
        Boolean term36142 = new Boolean(false);
        Boolean term36144 = new Boolean(true);
        Boolean term36146 = new Boolean(true);
        Boolean term36148 = new Boolean(true);
        Boolean term36151 = new Boolean(true);
        Boolean term36153 = new Boolean(false);
        Boolean term36155 = new Boolean(false);
        Boolean term36157 = new Boolean(false);
        term36046 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term36061 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term36098 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term36101 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term36138 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term36141 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term36046, term36046.getClass(), "id", term36047);
        setField(term36046, term36046.getClass(), "connected_at", "fhKxidKBbV");
        setField(term36061, term36061.getClass(), "nickname", "SIJmlwIkel");
        setField(term36061, term36061.getClass(), "profile_image", "lqucbHOiHE");
        setField(term36061, term36061.getClass(), "thumbnail_image", "AtnEadrVWF");
        setField(term36061, term36061.getClass(), "this$0", null);
        setField(term36046, term36046.getClass(), "properties", term36061);
        setField(term36098, term36098.getClass(), "profile_needs_agreement", term36099);
        setField(term36101, term36101.getClass(), "nickname", "YghxvBBBOW");
        setField(term36101, term36101.getClass(), "thumbnail_image_url", "LHuytJdqwq");
        setField(term36101, term36101.getClass(), "profile_image_url", "SqSvcPPMTC");
        setField(term36138, term36138.getClass(), "profile_needs_agreement", term36139);
        setField(term36141, term36141.getClass(), "nickname", null);
        setField(term36141, term36141.getClass(), "thumbnail_image_url", null);
        setField(term36141, term36141.getClass(), "profile_image_url", null);
        setField(term36141, term36141.getClass(), "this$1", null);
        setField(term36138, term36138.getClass(), "profile", term36141);
        setField(term36138, term36138.getClass(), "has_email", term36142);
        setField(term36138, term36138.getClass(), "email_needs_agreement", term36144);
        setField(term36138, term36138.getClass(), "is_email_valid", term36146);
        setField(term36138, term36138.getClass(), "is_email_verified", term36148);
        setField(term36138, term36138.getClass(), "email", "");
        setField(term36138, term36138.getClass(), "this$0", null);
        setField(term36101, term36101.getClass(), "this$1", term36138);
        setField(term36098, term36098.getClass(), "profile", term36101);
        setField(term36098, term36098.getClass(), "has_email", term36151);
        setField(term36098, term36098.getClass(), "email_needs_agreement", term36153);
        setField(term36098, term36098.getClass(), "is_email_valid", term36155);
        setField(term36098, term36098.getClass(), "is_email_verified", term36157);
        setField(term36098, term36098.getClass(), "email", "UjNsLLEXru");
        setField(term36098, term36098.getClass(), "this$0", null);
        setField(term36046, term36046.getClass(), "kakao_account", term36098);
        term36171 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36171;
        callMethod(klass, "canEqual", argTypes, term36046, args);
    }

};


