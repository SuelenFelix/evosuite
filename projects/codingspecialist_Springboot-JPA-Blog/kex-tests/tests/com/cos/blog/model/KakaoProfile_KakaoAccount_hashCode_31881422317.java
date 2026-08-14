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

public class KakaoProfile_KakaoAccount_hashCode_31881422317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24993;

    public KakaoProfile_KakaoAccount_hashCode_31881422317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24994 = new Boolean(false);
        Boolean term25034 = new Boolean(true);
        Boolean term25041 = new Boolean(false);
        Boolean term25043 = new Boolean(false);
        Boolean term25045 = new Boolean(true);
        Boolean term25047 = new Boolean(false);
        Boolean term25049 = new Boolean(true);
        Boolean term25051 = new Boolean(false);
        Boolean term25053 = new Boolean(false);
        Boolean term25055 = new Boolean(false);
        Boolean term25057 = new Boolean(false);
        Boolean term25071 = new Boolean(true);
        Boolean term25073 = new Boolean(true);
        Boolean term25075 = new Boolean(true);
        Boolean term25077 = new Boolean(false);
        term24993 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24996 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term25033 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term25036 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term25040 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24993, term24993.getClass(), "profile_needs_agreement", term24994);
        setField(term24996, term24996.getClass(), "nickname", "GzmFcFoYft");
        setField(term24996, term24996.getClass(), "thumbnail_image_url", "LYRdIFgbgt");
        setField(term24996, term24996.getClass(), "profile_image_url", "NiKeRXajei");
        setField(term25033, term25033.getClass(), "profile_needs_agreement", term25034);
        setField(term25036, term25036.getClass(), "nickname", "");
        setField(term25036, term25036.getClass(), "thumbnail_image_url", "");
        setField(term25036, term25036.getClass(), "profile_image_url", "");
        setField(term25040, term25040.getClass(), "profile_needs_agreement", term25041);
        setField(term25040, term25040.getClass(), "profile", null);
        setField(term25040, term25040.getClass(), "has_email", term25043);
        setField(term25040, term25040.getClass(), "email_needs_agreement", term25045);
        setField(term25040, term25040.getClass(), "is_email_valid", term25047);
        setField(term25040, term25040.getClass(), "is_email_verified", term25049);
        setField(term25040, term25040.getClass(), "email", null);
        setField(term25040, term25040.getClass(), "this$0", null);
        setField(term25036, term25036.getClass(), "this$1", term25040);
        setField(term25033, term25033.getClass(), "profile", term25036);
        setField(term25033, term25033.getClass(), "has_email", term25051);
        setField(term25033, term25033.getClass(), "email_needs_agreement", term25053);
        setField(term25033, term25033.getClass(), "is_email_valid", term25055);
        setField(term25033, term25033.getClass(), "is_email_verified", term25057);
        setField(term25033, term25033.getClass(), "email", "uHcUlIseio");
        setField(term25033, term25033.getClass(), "this$0", null);
        setField(term24996, term24996.getClass(), "this$1", term25033);
        setField(term24993, term24993.getClass(), "profile", term24996);
        setField(term24993, term24993.getClass(), "has_email", term25071);
        setField(term24993, term24993.getClass(), "email_needs_agreement", term25073);
        setField(term24993, term24993.getClass(), "is_email_valid", term25075);
        setField(term24993, term24993.getClass(), "is_email_verified", term25077);
        setField(term24993, term24993.getClass(), "email", "bsmWXOcLZJ");
        setField(term24993, term24993.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24993, args);
    }

};


