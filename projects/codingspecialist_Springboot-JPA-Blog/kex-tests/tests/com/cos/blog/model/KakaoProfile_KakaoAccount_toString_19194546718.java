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

public class KakaoProfile_KakaoAccount_toString_19194546718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25141;

    public KakaoProfile_KakaoAccount_toString_19194546718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term25142 = new Boolean(false);
        Boolean term25182 = new Boolean(true);
        Boolean term25189 = new Boolean(true);
        Boolean term25191 = new Boolean(true);
        Boolean term25193 = new Boolean(false);
        Boolean term25195 = new Boolean(true);
        Boolean term25197 = new Boolean(false);
        Boolean term25199 = new Boolean(false);
        Boolean term25201 = new Boolean(false);
        Boolean term25203 = new Boolean(false);
        Boolean term25205 = new Boolean(false);
        Boolean term25219 = new Boolean(false);
        Boolean term25221 = new Boolean(true);
        Boolean term25223 = new Boolean(false);
        Boolean term25225 = new Boolean(true);
        term25141 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term25144 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term25181 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term25184 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term25188 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term25141, term25141.getClass(), "profile_needs_agreement", term25142);
        setField(term25144, term25144.getClass(), "nickname", "ltTwdndtbe");
        setField(term25144, term25144.getClass(), "thumbnail_image_url", "XaldiIeyMi");
        setField(term25144, term25144.getClass(), "profile_image_url", "lkujDCFpdm");
        setField(term25181, term25181.getClass(), "profile_needs_agreement", term25182);
        setField(term25184, term25184.getClass(), "nickname", "");
        setField(term25184, term25184.getClass(), "thumbnail_image_url", "");
        setField(term25184, term25184.getClass(), "profile_image_url", "");
        setField(term25188, term25188.getClass(), "profile_needs_agreement", term25189);
        setField(term25188, term25188.getClass(), "profile", null);
        setField(term25188, term25188.getClass(), "has_email", term25191);
        setField(term25188, term25188.getClass(), "email_needs_agreement", term25193);
        setField(term25188, term25188.getClass(), "is_email_valid", term25195);
        setField(term25188, term25188.getClass(), "is_email_verified", term25197);
        setField(term25188, term25188.getClass(), "email", null);
        setField(term25188, term25188.getClass(), "this$0", null);
        setField(term25184, term25184.getClass(), "this$1", term25188);
        setField(term25181, term25181.getClass(), "profile", term25184);
        setField(term25181, term25181.getClass(), "has_email", term25199);
        setField(term25181, term25181.getClass(), "email_needs_agreement", term25201);
        setField(term25181, term25181.getClass(), "is_email_valid", term25203);
        setField(term25181, term25181.getClass(), "is_email_verified", term25205);
        setField(term25181, term25181.getClass(), "email", "enWkULOykY");
        setField(term25181, term25181.getClass(), "this$0", null);
        setField(term25144, term25144.getClass(), "this$1", term25181);
        setField(term25141, term25141.getClass(), "profile", term25144);
        setField(term25141, term25141.getClass(), "has_email", term25219);
        setField(term25141, term25141.getClass(), "email_needs_agreement", term25221);
        setField(term25141, term25141.getClass(), "is_email_valid", term25223);
        setField(term25141, term25141.getClass(), "is_email_verified", term25225);
        setField(term25141, term25141.getClass(), "email", "BPdcafiAQX");
        setField(term25141, term25141.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25141, args);
    }

};


