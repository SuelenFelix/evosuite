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

public class KakaoProfile_KakaoAccount_Profile_toString_208958560010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11123;

    public KakaoProfile_KakaoAccount_Profile_toString_208958560010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term11161 = new Boolean(false);
        Boolean term11201 = new Boolean(false);
        Boolean term11204 = new Boolean(false);
        Boolean term11206 = new Boolean(true);
        Boolean term11208 = new Boolean(true);
        Boolean term11210 = new Boolean(false);
        Boolean term11213 = new Boolean(true);
        Boolean term11215 = new Boolean(true);
        Boolean term11217 = new Boolean(false);
        Boolean term11219 = new Boolean(false);
        term11123 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term11160 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term11163 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term11200 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term11203 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term11123, term11123.getClass(), "nickname", "cqCXYaAnFB");
        setField(term11123, term11123.getClass(), "thumbnail_image_url", "UPLNFZHXjw");
        setField(term11123, term11123.getClass(), "profile_image_url", "CwrrJlrGmg");
        setField(term11160, term11160.getClass(), "profile_needs_agreement", term11161);
        setField(term11163, term11163.getClass(), "nickname", "HejzvyejjG");
        setField(term11163, term11163.getClass(), "thumbnail_image_url", "pbqJjeooBM");
        setField(term11163, term11163.getClass(), "profile_image_url", "ccnotFfPXt");
        setField(term11200, term11200.getClass(), "profile_needs_agreement", term11201);
        setField(term11203, term11203.getClass(), "nickname", null);
        setField(term11203, term11203.getClass(), "thumbnail_image_url", null);
        setField(term11203, term11203.getClass(), "profile_image_url", null);
        setField(term11203, term11203.getClass(), "this$1", null);
        setField(term11200, term11200.getClass(), "profile", term11203);
        setField(term11200, term11200.getClass(), "has_email", term11204);
        setField(term11200, term11200.getClass(), "email_needs_agreement", term11206);
        setField(term11200, term11200.getClass(), "is_email_valid", term11208);
        setField(term11200, term11200.getClass(), "is_email_verified", term11210);
        setField(term11200, term11200.getClass(), "email", "");
        setField(term11200, term11200.getClass(), "this$0", null);
        setField(term11163, term11163.getClass(), "this$1", term11200);
        setField(term11160, term11160.getClass(), "profile", term11163);
        setField(term11160, term11160.getClass(), "has_email", term11213);
        setField(term11160, term11160.getClass(), "email_needs_agreement", term11215);
        setField(term11160, term11160.getClass(), "is_email_valid", term11217);
        setField(term11160, term11160.getClass(), "is_email_verified", term11219);
        setField(term11160, term11160.getClass(), "email", "TbiwoiebNe");
        setField(term11160, term11160.getClass(), "this$0", null);
        setField(term11123, term11123.getClass(), "this$1", term11160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11123, args);
    }

};


