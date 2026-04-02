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

public class KakaoProfile_KakaoAccount_setHasemail_102402785110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23925;
     Object term24023;

    public KakaoProfile_KakaoAccount_setHasemail_102402785110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term23926 = new Boolean(true);
        Boolean term23966 = new Boolean(false);
        Boolean term23973 = new Boolean(true);
        Boolean term23975 = new Boolean(false);
        Boolean term23977 = new Boolean(false);
        Boolean term23979 = new Boolean(false);
        Boolean term23981 = new Boolean(false);
        Boolean term23983 = new Boolean(false);
        Boolean term23985 = new Boolean(true);
        Boolean term23987 = new Boolean(false);
        Boolean term23989 = new Boolean(true);
        Boolean term24003 = new Boolean(false);
        Boolean term24005 = new Boolean(true);
        Boolean term24007 = new Boolean(true);
        Boolean term24009 = new Boolean(false);
        term23925 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23928 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23965 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term23968 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term23972 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term23925, term23925.getClass(), "profile_needs_agreement", term23926);
        setField(term23928, term23928.getClass(), "nickname", "CbwfWaINrF");
        setField(term23928, term23928.getClass(), "thumbnail_image_url", "AVCzSfXhGU");
        setField(term23928, term23928.getClass(), "profile_image_url", "nTUCmQGFDE");
        setField(term23965, term23965.getClass(), "profile_needs_agreement", term23966);
        setField(term23968, term23968.getClass(), "nickname", "");
        setField(term23968, term23968.getClass(), "thumbnail_image_url", "");
        setField(term23968, term23968.getClass(), "profile_image_url", "");
        setField(term23972, term23972.getClass(), "profile_needs_agreement", term23973);
        setField(term23972, term23972.getClass(), "profile", null);
        setField(term23972, term23972.getClass(), "has_email", term23975);
        setField(term23972, term23972.getClass(), "email_needs_agreement", term23977);
        setField(term23972, term23972.getClass(), "is_email_valid", term23979);
        setField(term23972, term23972.getClass(), "is_email_verified", term23981);
        setField(term23972, term23972.getClass(), "email", null);
        setField(term23972, term23972.getClass(), "this$0", null);
        setField(term23968, term23968.getClass(), "this$1", term23972);
        setField(term23965, term23965.getClass(), "profile", term23968);
        setField(term23965, term23965.getClass(), "has_email", term23983);
        setField(term23965, term23965.getClass(), "email_needs_agreement", term23985);
        setField(term23965, term23965.getClass(), "is_email_valid", term23987);
        setField(term23965, term23965.getClass(), "is_email_verified", term23989);
        setField(term23965, term23965.getClass(), "email", "INFnBrMIka");
        setField(term23965, term23965.getClass(), "this$0", null);
        setField(term23928, term23928.getClass(), "this$1", term23965);
        setField(term23925, term23925.getClass(), "profile", term23928);
        setField(term23925, term23925.getClass(), "has_email", term24003);
        setField(term23925, term23925.getClass(), "email_needs_agreement", term24005);
        setField(term23925, term23925.getClass(), "is_email_valid", term24007);
        setField(term23925, term23925.getClass(), "is_email_verified", term24009);
        setField(term23925, term23925.getClass(), "email", "EwmpEgdvZs");
        setField(term23925, term23925.getClass(), "this$0", null);
        term24023 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term24023;
        callMethod(klass, "setHas_email", argTypes, term23925, args);
    }

};


