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

public class KakaoProfile_KakaoAccount_Profile_init_16603686200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9287;

    public KakaoProfile_KakaoAccount_Profile_init_16603686200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term9288 = new Boolean(false);
        Boolean term9328 = new Boolean(false);
        Boolean term9335 = new Boolean(false);
        Boolean term9337 = new Boolean(true);
        Boolean term9339 = new Boolean(false);
        Boolean term9341 = new Boolean(false);
        Boolean term9343 = new Boolean(true);
        Boolean term9345 = new Boolean(true);
        Boolean term9347 = new Boolean(false);
        Boolean term9349 = new Boolean(false);
        Boolean term9351 = new Boolean(true);
        Boolean term9365 = new Boolean(true);
        Boolean term9367 = new Boolean(true);
        Boolean term9369 = new Boolean(true);
        Boolean term9371 = new Boolean(true);
        term9287 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9290 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9327 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9330 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9334 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term9287, term9287.getClass(), "profile_needs_agreement", term9288);
        setField(term9290, term9290.getClass(), "nickname", "FrTZLybkKk");
        setField(term9290, term9290.getClass(), "thumbnail_image_url", "FlxVmiMYKP");
        setField(term9290, term9290.getClass(), "profile_image_url", "fgOpAWlGYN");
        setField(term9327, term9327.getClass(), "profile_needs_agreement", term9328);
        setField(term9330, term9330.getClass(), "nickname", "");
        setField(term9330, term9330.getClass(), "thumbnail_image_url", "");
        setField(term9330, term9330.getClass(), "profile_image_url", "");
        setField(term9334, term9334.getClass(), "profile_needs_agreement", term9335);
        setField(term9334, term9334.getClass(), "profile", null);
        setField(term9334, term9334.getClass(), "has_email", term9337);
        setField(term9334, term9334.getClass(), "email_needs_agreement", term9339);
        setField(term9334, term9334.getClass(), "is_email_valid", term9341);
        setField(term9334, term9334.getClass(), "is_email_verified", term9343);
        setField(term9334, term9334.getClass(), "email", null);
        setField(term9334, term9334.getClass(), "this$0", null);
        setField(term9330, term9330.getClass(), "this$1", term9334);
        setField(term9327, term9327.getClass(), "profile", term9330);
        setField(term9327, term9327.getClass(), "has_email", term9345);
        setField(term9327, term9327.getClass(), "email_needs_agreement", term9347);
        setField(term9327, term9327.getClass(), "is_email_valid", term9349);
        setField(term9327, term9327.getClass(), "is_email_verified", term9351);
        setField(term9327, term9327.getClass(), "email", "TiUqHrjoEU");
        setField(term9327, term9327.getClass(), "this$0", null);
        setField(term9290, term9290.getClass(), "this$1", term9327);
        setField(term9287, term9287.getClass(), "profile", term9290);
        setField(term9287, term9287.getClass(), "has_email", term9365);
        setField(term9287, term9287.getClass(), "email_needs_agreement", term9367);
        setField(term9287, term9287.getClass(), "is_email_valid", term9369);
        setField(term9287, term9287.getClass(), "is_email_verified", term9371);
        setField(term9287, term9287.getClass(), "email", "eoEvZbdLjL");
        setField(term9287, term9287.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Object[] args = new Object[1];
        args[0] = term9287;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


