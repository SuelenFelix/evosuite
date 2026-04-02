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

public class KakaoProfile_KakaoAccount_Profile_canEqual_4417727028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10762;
     Object term10872;

    public KakaoProfile_KakaoAccount_Profile_canEqual_4417727028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10800 = new Boolean(true);
        Boolean term10840 = new Boolean(false);
        Boolean term10843 = new Boolean(true);
        Boolean term10845 = new Boolean(false);
        Boolean term10847 = new Boolean(false);
        Boolean term10849 = new Boolean(false);
        Boolean term10852 = new Boolean(false);
        Boolean term10854 = new Boolean(true);
        Boolean term10856 = new Boolean(true);
        Boolean term10858 = new Boolean(true);
        term10762 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10799 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10802 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10839 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10842 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term10762, term10762.getClass(), "nickname", "RxrsjXRVcT");
        setField(term10762, term10762.getClass(), "thumbnail_image_url", "cfRimmJxqA");
        setField(term10762, term10762.getClass(), "profile_image_url", "oOnRVGqFmy");
        setField(term10799, term10799.getClass(), "profile_needs_agreement", term10800);
        setField(term10802, term10802.getClass(), "nickname", "LaXzFIlWMk");
        setField(term10802, term10802.getClass(), "thumbnail_image_url", "GuVQjhBxma");
        setField(term10802, term10802.getClass(), "profile_image_url", "WAVMPPbIfL");
        setField(term10839, term10839.getClass(), "profile_needs_agreement", term10840);
        setField(term10842, term10842.getClass(), "nickname", null);
        setField(term10842, term10842.getClass(), "thumbnail_image_url", null);
        setField(term10842, term10842.getClass(), "profile_image_url", null);
        setField(term10842, term10842.getClass(), "this$1", null);
        setField(term10839, term10839.getClass(), "profile", term10842);
        setField(term10839, term10839.getClass(), "has_email", term10843);
        setField(term10839, term10839.getClass(), "email_needs_agreement", term10845);
        setField(term10839, term10839.getClass(), "is_email_valid", term10847);
        setField(term10839, term10839.getClass(), "is_email_verified", term10849);
        setField(term10839, term10839.getClass(), "email", "");
        setField(term10839, term10839.getClass(), "this$0", null);
        setField(term10802, term10802.getClass(), "this$1", term10839);
        setField(term10799, term10799.getClass(), "profile", term10802);
        setField(term10799, term10799.getClass(), "has_email", term10852);
        setField(term10799, term10799.getClass(), "email_needs_agreement", term10854);
        setField(term10799, term10799.getClass(), "is_email_valid", term10856);
        setField(term10799, term10799.getClass(), "is_email_verified", term10858);
        setField(term10799, term10799.getClass(), "email", "scpIQUfPKw");
        setField(term10799, term10799.getClass(), "this$0", null);
        setField(term10762, term10762.getClass(), "this$1", term10799);
        term10872 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10872;
        callMethod(klass, "canEqual", argTypes, term10762, args);
    }

};


