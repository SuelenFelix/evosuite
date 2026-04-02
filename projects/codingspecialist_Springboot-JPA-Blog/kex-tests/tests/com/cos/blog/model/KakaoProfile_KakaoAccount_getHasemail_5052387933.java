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

public class KakaoProfile_KakaoAccount_getHasemail_5052387933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22707;

    public KakaoProfile_KakaoAccount_getHasemail_5052387933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term22708 = new Boolean(false);
        Boolean term22748 = new Boolean(true);
        Boolean term22755 = new Boolean(true);
        Boolean term22757 = new Boolean(false);
        Boolean term22759 = new Boolean(false);
        Boolean term22761 = new Boolean(true);
        Boolean term22763 = new Boolean(true);
        Boolean term22765 = new Boolean(false);
        Boolean term22767 = new Boolean(false);
        Boolean term22769 = new Boolean(false);
        Boolean term22771 = new Boolean(false);
        Boolean term22785 = new Boolean(false);
        Boolean term22787 = new Boolean(false);
        Boolean term22789 = new Boolean(false);
        Boolean term22791 = new Boolean(false);
        term22707 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22710 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22747 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22750 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22754 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term22707, term22707.getClass(), "profile_needs_agreement", term22708);
        setField(term22710, term22710.getClass(), "nickname", "LAOkeXXkDr");
        setField(term22710, term22710.getClass(), "thumbnail_image_url", "YkZqFgrgVM");
        setField(term22710, term22710.getClass(), "profile_image_url", "QEJBgSNviH");
        setField(term22747, term22747.getClass(), "profile_needs_agreement", term22748);
        setField(term22750, term22750.getClass(), "nickname", "");
        setField(term22750, term22750.getClass(), "thumbnail_image_url", "");
        setField(term22750, term22750.getClass(), "profile_image_url", "");
        setField(term22754, term22754.getClass(), "profile_needs_agreement", term22755);
        setField(term22754, term22754.getClass(), "profile", null);
        setField(term22754, term22754.getClass(), "has_email", term22757);
        setField(term22754, term22754.getClass(), "email_needs_agreement", term22759);
        setField(term22754, term22754.getClass(), "is_email_valid", term22761);
        setField(term22754, term22754.getClass(), "is_email_verified", term22763);
        setField(term22754, term22754.getClass(), "email", null);
        setField(term22754, term22754.getClass(), "this$0", null);
        setField(term22750, term22750.getClass(), "this$1", term22754);
        setField(term22747, term22747.getClass(), "profile", term22750);
        setField(term22747, term22747.getClass(), "has_email", term22765);
        setField(term22747, term22747.getClass(), "email_needs_agreement", term22767);
        setField(term22747, term22747.getClass(), "is_email_valid", term22769);
        setField(term22747, term22747.getClass(), "is_email_verified", term22771);
        setField(term22747, term22747.getClass(), "email", "oTnPmmIphJ");
        setField(term22747, term22747.getClass(), "this$0", null);
        setField(term22710, term22710.getClass(), "this$1", term22747);
        setField(term22707, term22707.getClass(), "profile", term22710);
        setField(term22707, term22707.getClass(), "has_email", term22785);
        setField(term22707, term22707.getClass(), "email_needs_agreement", term22787);
        setField(term22707, term22707.getClass(), "is_email_valid", term22789);
        setField(term22707, term22707.getClass(), "is_email_verified", term22791);
        setField(term22707, term22707.getClass(), "email", "vTgJolwQXF");
        setField(term22707, term22707.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHas_email", argTypes, term22707, args);
    }

};


