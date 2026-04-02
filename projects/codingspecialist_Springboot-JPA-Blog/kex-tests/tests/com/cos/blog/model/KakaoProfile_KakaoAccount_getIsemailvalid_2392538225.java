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

public class KakaoProfile_KakaoAccount_getIsemailvalid_2392538225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23003;

    public KakaoProfile_KakaoAccount_getIsemailvalid_2392538225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term23004 = new Boolean(false);
        Boolean term23044 = new Boolean(false);
        Boolean term23051 = new Boolean(false);
        Boolean term23053 = new Boolean(true);
        Boolean term23055 = new Boolean(true);
        Boolean term23057 = new Boolean(true);
        Boolean term23059 = new Boolean(false);
        Boolean term23061 = new Boolean(false);
        Boolean term23063 = new Boolean(false);
        Boolean term23065 = new Boolean(true);
        Boolean term23067 = new Boolean(true);
        Boolean term23081 = new Boolean(false);
        Boolean term23083 = new Boolean(true);
        Boolean term23085 = new Boolean(true);
        Boolean term23087 = new Boolean(false);
        term23003 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23006 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23043 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23046 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23050 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term23003, term23003.getClass(), "profile_needs_agreement", term23004);
        setField(term23006, term23006.getClass(), "nickname", "TnpXhZmCRY");
        setField(term23006, term23006.getClass(), "thumbnail_image_url", "ECVAXFhrTP");
        setField(term23006, term23006.getClass(), "profile_image_url", "ypytdNbrBc");
        setField(term23043, term23043.getClass(), "profile_needs_agreement", term23044);
        setField(term23046, term23046.getClass(), "nickname", "");
        setField(term23046, term23046.getClass(), "thumbnail_image_url", "");
        setField(term23046, term23046.getClass(), "profile_image_url", "");
        setField(term23050, term23050.getClass(), "profile_needs_agreement", term23051);
        setField(term23050, term23050.getClass(), "profile", null);
        setField(term23050, term23050.getClass(), "has_email", term23053);
        setField(term23050, term23050.getClass(), "email_needs_agreement", term23055);
        setField(term23050, term23050.getClass(), "is_email_valid", term23057);
        setField(term23050, term23050.getClass(), "is_email_verified", term23059);
        setField(term23050, term23050.getClass(), "email", null);
        setField(term23050, term23050.getClass(), "this$0", null);
        setField(term23046, term23046.getClass(), "this$1", term23050);
        setField(term23043, term23043.getClass(), "profile", term23046);
        setField(term23043, term23043.getClass(), "has_email", term23061);
        setField(term23043, term23043.getClass(), "email_needs_agreement", term23063);
        setField(term23043, term23043.getClass(), "is_email_valid", term23065);
        setField(term23043, term23043.getClass(), "is_email_verified", term23067);
        setField(term23043, term23043.getClass(), "email", "rwbfUcOMVc");
        setField(term23043, term23043.getClass(), "this$0", null);
        setField(term23006, term23006.getClass(), "this$1", term23043);
        setField(term23003, term23003.getClass(), "profile", term23006);
        setField(term23003, term23003.getClass(), "has_email", term23081);
        setField(term23003, term23003.getClass(), "email_needs_agreement", term23083);
        setField(term23003, term23003.getClass(), "is_email_valid", term23085);
        setField(term23003, term23003.getClass(), "is_email_verified", term23087);
        setField(term23003, term23003.getClass(), "email", "ljTkNgJRUl");
        setField(term23003, term23003.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIs_email_valid", argTypes, term23003, args);
    }

};


