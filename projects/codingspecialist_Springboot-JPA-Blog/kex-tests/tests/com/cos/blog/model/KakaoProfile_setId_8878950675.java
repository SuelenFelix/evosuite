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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class KakaoProfile_setId_8878950675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34781;
     Object term34906;

    public KakaoProfile_setId_8878950675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34782 = new Integer(-1955890973);
        Boolean term34834 = new Boolean(false);
        Boolean term34874 = new Boolean(false);
        Boolean term34877 = new Boolean(false);
        Boolean term34879 = new Boolean(true);
        Boolean term34881 = new Boolean(false);
        Boolean term34883 = new Boolean(false);
        Boolean term34886 = new Boolean(false);
        Boolean term34888 = new Boolean(false);
        Boolean term34890 = new Boolean(true);
        Boolean term34892 = new Boolean(true);
        term34781 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term34796 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term34833 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34836 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term34873 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34876 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term34781, term34781.getClass(), "id", term34782);
        setField(term34781, term34781.getClass(), "connected_at", "BuJzsOARZG");
        setField(term34796, term34796.getClass(), "nickname", "lIqJQDMmVL");
        setField(term34796, term34796.getClass(), "profile_image", "cXTrsrxYFN");
        setField(term34796, term34796.getClass(), "thumbnail_image", "pEUndHGBiE");
        setField(term34796, term34796.getClass(), "this$0", null);
        setField(term34781, term34781.getClass(), "properties", term34796);
        setField(term34833, term34833.getClass(), "profile_needs_agreement", term34834);
        setField(term34836, term34836.getClass(), "nickname", "PCzKLiLqoO");
        setField(term34836, term34836.getClass(), "thumbnail_image_url", "JuYhKUgElF");
        setField(term34836, term34836.getClass(), "profile_image_url", "NInWPlYtwe");
        setField(term34873, term34873.getClass(), "profile_needs_agreement", term34874);
        setField(term34876, term34876.getClass(), "nickname", null);
        setField(term34876, term34876.getClass(), "thumbnail_image_url", null);
        setField(term34876, term34876.getClass(), "profile_image_url", null);
        setField(term34876, term34876.getClass(), "this$1", null);
        setField(term34873, term34873.getClass(), "profile", term34876);
        setField(term34873, term34873.getClass(), "has_email", term34877);
        setField(term34873, term34873.getClass(), "email_needs_agreement", term34879);
        setField(term34873, term34873.getClass(), "is_email_valid", term34881);
        setField(term34873, term34873.getClass(), "is_email_verified", term34883);
        setField(term34873, term34873.getClass(), "email", "");
        setField(term34873, term34873.getClass(), "this$0", null);
        setField(term34836, term34836.getClass(), "this$1", term34873);
        setField(term34833, term34833.getClass(), "profile", term34836);
        setField(term34833, term34833.getClass(), "has_email", term34886);
        setField(term34833, term34833.getClass(), "email_needs_agreement", term34888);
        setField(term34833, term34833.getClass(), "is_email_valid", term34890);
        setField(term34833, term34833.getClass(), "is_email_verified", term34892);
        setField(term34833, term34833.getClass(), "email", "AXVMtieJQT");
        setField(term34833, term34833.getClass(), "this$0", null);
        setField(term34781, term34781.getClass(), "kakao_account", term34833);
        term34906 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term34906;
        callMethod(klass, "setId", argTypes, term34781, args);
    }

};


