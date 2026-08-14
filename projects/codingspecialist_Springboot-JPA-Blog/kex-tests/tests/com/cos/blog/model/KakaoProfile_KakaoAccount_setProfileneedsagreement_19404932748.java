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

public class KakaoProfile_KakaoAccount_setProfileneedsagreement_19404932748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23447;
     Object term23545;

    public KakaoProfile_KakaoAccount_setProfileneedsagreement_19404932748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term23448 = new Boolean(true);
        Boolean term23488 = new Boolean(false);
        Boolean term23495 = new Boolean(true);
        Boolean term23497 = new Boolean(true);
        Boolean term23499 = new Boolean(false);
        Boolean term23501 = new Boolean(true);
        Boolean term23503 = new Boolean(false);
        Boolean term23505 = new Boolean(false);
        Boolean term23507 = new Boolean(true);
        Boolean term23509 = new Boolean(true);
        Boolean term23511 = new Boolean(false);
        Boolean term23525 = new Boolean(true);
        Boolean term23527 = new Boolean(true);
        Boolean term23529 = new Boolean(false);
        Boolean term23531 = new Boolean(false);
        term23447 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23450 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23487 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23490 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23494 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term23447, term23447.getClass(), "profile_needs_agreement", term23448);
        setField(term23450, term23450.getClass(), "nickname", "wVOypfVLsP");
        setField(term23450, term23450.getClass(), "thumbnail_image_url", "pEazBcUUWX");
        setField(term23450, term23450.getClass(), "profile_image_url", "nlvRWrTxvz");
        setField(term23487, term23487.getClass(), "profile_needs_agreement", term23488);
        setField(term23490, term23490.getClass(), "nickname", "");
        setField(term23490, term23490.getClass(), "thumbnail_image_url", "");
        setField(term23490, term23490.getClass(), "profile_image_url", "");
        setField(term23494, term23494.getClass(), "profile_needs_agreement", term23495);
        setField(term23494, term23494.getClass(), "profile", null);
        setField(term23494, term23494.getClass(), "has_email", term23497);
        setField(term23494, term23494.getClass(), "email_needs_agreement", term23499);
        setField(term23494, term23494.getClass(), "is_email_valid", term23501);
        setField(term23494, term23494.getClass(), "is_email_verified", term23503);
        setField(term23494, term23494.getClass(), "email", null);
        setField(term23494, term23494.getClass(), "this$0", null);
        setField(term23490, term23490.getClass(), "this$1", term23494);
        setField(term23487, term23487.getClass(), "profile", term23490);
        setField(term23487, term23487.getClass(), "has_email", term23505);
        setField(term23487, term23487.getClass(), "email_needs_agreement", term23507);
        setField(term23487, term23487.getClass(), "is_email_valid", term23509);
        setField(term23487, term23487.getClass(), "is_email_verified", term23511);
        setField(term23487, term23487.getClass(), "email", "uQGMBLrmAj");
        setField(term23487, term23487.getClass(), "this$0", null);
        setField(term23450, term23450.getClass(), "this$1", term23487);
        setField(term23447, term23447.getClass(), "profile", term23450);
        setField(term23447, term23447.getClass(), "has_email", term23525);
        setField(term23447, term23447.getClass(), "email_needs_agreement", term23527);
        setField(term23447, term23447.getClass(), "is_email_valid", term23529);
        setField(term23447, term23447.getClass(), "is_email_verified", term23531);
        setField(term23447, term23447.getClass(), "email", "vNFaheDeBv");
        setField(term23447, term23447.getClass(), "this$0", null);
        term23545 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term23545;
        callMethod(klass, "setProfile_needs_agreement", argTypes, term23447, args);
    }

};


