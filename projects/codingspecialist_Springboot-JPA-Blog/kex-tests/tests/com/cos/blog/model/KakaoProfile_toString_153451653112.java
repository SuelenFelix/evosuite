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

public class KakaoProfile_toString_153451653112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36457;

    public KakaoProfile_toString_153451653112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36458 = new Integer(1585847225);
        Boolean term36510 = new Boolean(true);
        Boolean term36550 = new Boolean(false);
        Boolean term36553 = new Boolean(true);
        Boolean term36555 = new Boolean(true);
        Boolean term36557 = new Boolean(false);
        Boolean term36559 = new Boolean(true);
        Boolean term36562 = new Boolean(true);
        Boolean term36564 = new Boolean(true);
        Boolean term36566 = new Boolean(false);
        Boolean term36568 = new Boolean(true);
        term36457 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term36472 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term36509 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term36512 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term36549 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term36552 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term36457, term36457.getClass(), "id", term36458);
        setField(term36457, term36457.getClass(), "connected_at", "YStxlrcedL");
        setField(term36472, term36472.getClass(), "nickname", "mDLwflwlja");
        setField(term36472, term36472.getClass(), "profile_image", "RqkgPxDFnv");
        setField(term36472, term36472.getClass(), "thumbnail_image", "egaLajwFgY");
        setField(term36472, term36472.getClass(), "this$0", null);
        setField(term36457, term36457.getClass(), "properties", term36472);
        setField(term36509, term36509.getClass(), "profile_needs_agreement", term36510);
        setField(term36512, term36512.getClass(), "nickname", "wUXTYOJezz");
        setField(term36512, term36512.getClass(), "thumbnail_image_url", "dovCZEmPER");
        setField(term36512, term36512.getClass(), "profile_image_url", "QIADULuFso");
        setField(term36549, term36549.getClass(), "profile_needs_agreement", term36550);
        setField(term36552, term36552.getClass(), "nickname", null);
        setField(term36552, term36552.getClass(), "thumbnail_image_url", null);
        setField(term36552, term36552.getClass(), "profile_image_url", null);
        setField(term36552, term36552.getClass(), "this$1", null);
        setField(term36549, term36549.getClass(), "profile", term36552);
        setField(term36549, term36549.getClass(), "has_email", term36553);
        setField(term36549, term36549.getClass(), "email_needs_agreement", term36555);
        setField(term36549, term36549.getClass(), "is_email_valid", term36557);
        setField(term36549, term36549.getClass(), "is_email_verified", term36559);
        setField(term36549, term36549.getClass(), "email", "");
        setField(term36549, term36549.getClass(), "this$0", null);
        setField(term36512, term36512.getClass(), "this$1", term36549);
        setField(term36509, term36509.getClass(), "profile", term36512);
        setField(term36509, term36509.getClass(), "has_email", term36562);
        setField(term36509, term36509.getClass(), "email_needs_agreement", term36564);
        setField(term36509, term36509.getClass(), "is_email_valid", term36566);
        setField(term36509, term36509.getClass(), "is_email_verified", term36568);
        setField(term36509, term36509.getClass(), "email", "qkZsBlbGpw");
        setField(term36509, term36509.getClass(), "this$0", null);
        setField(term36457, term36457.getClass(), "kakao_account", term36509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term36457, args);
    }

};


