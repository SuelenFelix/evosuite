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

public class KakaoProfile_KakaoAccount_canEqual_157166352716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24844;
     Object term24942;

    public KakaoProfile_KakaoAccount_canEqual_157166352716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24845 = new Boolean(true);
        Boolean term24885 = new Boolean(true);
        Boolean term24892 = new Boolean(true);
        Boolean term24894 = new Boolean(true);
        Boolean term24896 = new Boolean(true);
        Boolean term24898 = new Boolean(true);
        Boolean term24900 = new Boolean(false);
        Boolean term24902 = new Boolean(false);
        Boolean term24904 = new Boolean(false);
        Boolean term24906 = new Boolean(true);
        Boolean term24908 = new Boolean(true);
        Boolean term24922 = new Boolean(true);
        Boolean term24924 = new Boolean(true);
        Boolean term24926 = new Boolean(false);
        Boolean term24928 = new Boolean(true);
        term24844 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24847 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24884 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24887 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24891 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24844, term24844.getClass(), "profile_needs_agreement", term24845);
        setField(term24847, term24847.getClass(), "nickname", "ibnuoVVkVm");
        setField(term24847, term24847.getClass(), "thumbnail_image_url", "mXVgkxjTjD");
        setField(term24847, term24847.getClass(), "profile_image_url", "qodBmKUkev");
        setField(term24884, term24884.getClass(), "profile_needs_agreement", term24885);
        setField(term24887, term24887.getClass(), "nickname", "");
        setField(term24887, term24887.getClass(), "thumbnail_image_url", "");
        setField(term24887, term24887.getClass(), "profile_image_url", "");
        setField(term24891, term24891.getClass(), "profile_needs_agreement", term24892);
        setField(term24891, term24891.getClass(), "profile", null);
        setField(term24891, term24891.getClass(), "has_email", term24894);
        setField(term24891, term24891.getClass(), "email_needs_agreement", term24896);
        setField(term24891, term24891.getClass(), "is_email_valid", term24898);
        setField(term24891, term24891.getClass(), "is_email_verified", term24900);
        setField(term24891, term24891.getClass(), "email", null);
        setField(term24891, term24891.getClass(), "this$0", null);
        setField(term24887, term24887.getClass(), "this$1", term24891);
        setField(term24884, term24884.getClass(), "profile", term24887);
        setField(term24884, term24884.getClass(), "has_email", term24902);
        setField(term24884, term24884.getClass(), "email_needs_agreement", term24904);
        setField(term24884, term24884.getClass(), "is_email_valid", term24906);
        setField(term24884, term24884.getClass(), "is_email_verified", term24908);
        setField(term24884, term24884.getClass(), "email", "xwBoTnuoQg");
        setField(term24884, term24884.getClass(), "this$0", null);
        setField(term24847, term24847.getClass(), "this$1", term24884);
        setField(term24844, term24844.getClass(), "profile", term24847);
        setField(term24844, term24844.getClass(), "has_email", term24922);
        setField(term24844, term24844.getClass(), "email_needs_agreement", term24924);
        setField(term24844, term24844.getClass(), "is_email_valid", term24926);
        setField(term24844, term24844.getClass(), "is_email_verified", term24928);
        setField(term24844, term24844.getClass(), "email", "HHAcgDPghN");
        setField(term24844, term24844.getClass(), "this$0", null);
        term24942 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24942;
        callMethod(klass, "canEqual", argTypes, term24844, args);
    }

};


