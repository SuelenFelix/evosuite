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

public class KakaoProfile_KakaoAccount_getIsemailverified_12859890746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23151;

    public KakaoProfile_KakaoAccount_getIsemailverified_12859890746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term23152 = new Boolean(false);
        Boolean term23192 = new Boolean(false);
        Boolean term23199 = new Boolean(true);
        Boolean term23201 = new Boolean(false);
        Boolean term23203 = new Boolean(true);
        Boolean term23205 = new Boolean(false);
        Boolean term23207 = new Boolean(false);
        Boolean term23209 = new Boolean(true);
        Boolean term23211 = new Boolean(true);
        Boolean term23213 = new Boolean(false);
        Boolean term23215 = new Boolean(true);
        Boolean term23229 = new Boolean(false);
        Boolean term23231 = new Boolean(true);
        Boolean term23233 = new Boolean(false);
        Boolean term23235 = new Boolean(false);
        term23151 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23154 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23191 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23194 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23198 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term23151, term23151.getClass(), "profile_needs_agreement", term23152);
        setField(term23154, term23154.getClass(), "nickname", "siRXAywvyp");
        setField(term23154, term23154.getClass(), "thumbnail_image_url", "ZRLaReQeFg");
        setField(term23154, term23154.getClass(), "profile_image_url", "cOcXspUxKR");
        setField(term23191, term23191.getClass(), "profile_needs_agreement", term23192);
        setField(term23194, term23194.getClass(), "nickname", "");
        setField(term23194, term23194.getClass(), "thumbnail_image_url", "");
        setField(term23194, term23194.getClass(), "profile_image_url", "");
        setField(term23198, term23198.getClass(), "profile_needs_agreement", term23199);
        setField(term23198, term23198.getClass(), "profile", null);
        setField(term23198, term23198.getClass(), "has_email", term23201);
        setField(term23198, term23198.getClass(), "email_needs_agreement", term23203);
        setField(term23198, term23198.getClass(), "is_email_valid", term23205);
        setField(term23198, term23198.getClass(), "is_email_verified", term23207);
        setField(term23198, term23198.getClass(), "email", null);
        setField(term23198, term23198.getClass(), "this$0", null);
        setField(term23194, term23194.getClass(), "this$1", term23198);
        setField(term23191, term23191.getClass(), "profile", term23194);
        setField(term23191, term23191.getClass(), "has_email", term23209);
        setField(term23191, term23191.getClass(), "email_needs_agreement", term23211);
        setField(term23191, term23191.getClass(), "is_email_valid", term23213);
        setField(term23191, term23191.getClass(), "is_email_verified", term23215);
        setField(term23191, term23191.getClass(), "email", "umsYdaPflb");
        setField(term23191, term23191.getClass(), "this$0", null);
        setField(term23154, term23154.getClass(), "this$1", term23191);
        setField(term23151, term23151.getClass(), "profile", term23154);
        setField(term23151, term23151.getClass(), "has_email", term23229);
        setField(term23151, term23151.getClass(), "email_needs_agreement", term23231);
        setField(term23151, term23151.getClass(), "is_email_valid", term23233);
        setField(term23151, term23151.getClass(), "is_email_verified", term23235);
        setField(term23151, term23151.getClass(), "email", "CnNmpSyiBE");
        setField(term23151, term23151.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIs_email_verified", argTypes, term23151, args);
    }

};


