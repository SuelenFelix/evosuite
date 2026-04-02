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

public class KakaoProfile_setProperties_12289867717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35215;
     Object term35340;

    public KakaoProfile_setProperties_12289867717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35216 = new Integer(-1339778481);
        Boolean term35268 = new Boolean(false);
        Boolean term35308 = new Boolean(true);
        Boolean term35311 = new Boolean(true);
        Boolean term35313 = new Boolean(false);
        Boolean term35315 = new Boolean(true);
        Boolean term35317 = new Boolean(false);
        Boolean term35320 = new Boolean(true);
        Boolean term35322 = new Boolean(true);
        Boolean term35324 = new Boolean(true);
        Boolean term35326 = new Boolean(false);
        term35215 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term35230 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term35267 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35270 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term35307 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35310 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term35215, term35215.getClass(), "id", term35216);
        setField(term35215, term35215.getClass(), "connected_at", "BIcjuljzhc");
        setField(term35230, term35230.getClass(), "nickname", "SQDHGXSyaX");
        setField(term35230, term35230.getClass(), "profile_image", "apdJoJDItV");
        setField(term35230, term35230.getClass(), "thumbnail_image", "UidjRWfqYK");
        setField(term35230, term35230.getClass(), "this$0", null);
        setField(term35215, term35215.getClass(), "properties", term35230);
        setField(term35267, term35267.getClass(), "profile_needs_agreement", term35268);
        setField(term35270, term35270.getClass(), "nickname", "SrmUNtssfz");
        setField(term35270, term35270.getClass(), "thumbnail_image_url", "ARMUeNVaDF");
        setField(term35270, term35270.getClass(), "profile_image_url", "EUduJelZVE");
        setField(term35307, term35307.getClass(), "profile_needs_agreement", term35308);
        setField(term35310, term35310.getClass(), "nickname", null);
        setField(term35310, term35310.getClass(), "thumbnail_image_url", null);
        setField(term35310, term35310.getClass(), "profile_image_url", null);
        setField(term35310, term35310.getClass(), "this$1", null);
        setField(term35307, term35307.getClass(), "profile", term35310);
        setField(term35307, term35307.getClass(), "has_email", term35311);
        setField(term35307, term35307.getClass(), "email_needs_agreement", term35313);
        setField(term35307, term35307.getClass(), "is_email_valid", term35315);
        setField(term35307, term35307.getClass(), "is_email_verified", term35317);
        setField(term35307, term35307.getClass(), "email", "");
        setField(term35307, term35307.getClass(), "this$0", null);
        setField(term35270, term35270.getClass(), "this$1", term35307);
        setField(term35267, term35267.getClass(), "profile", term35270);
        setField(term35267, term35267.getClass(), "has_email", term35320);
        setField(term35267, term35267.getClass(), "email_needs_agreement", term35322);
        setField(term35267, term35267.getClass(), "is_email_valid", term35324);
        setField(term35267, term35267.getClass(), "is_email_verified", term35326);
        setField(term35267, term35267.getClass(), "email", "VtfNPRNIuG");
        setField(term35267, term35267.getClass(), "this$0", null);
        setField(term35215, term35215.getClass(), "kakao_account", term35267);
        term35340 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        setField(term35340, term35340.getClass(), "nickname", "ttqikiUUcN");
        setField(term35340, term35340.getClass(), "profile_image", "NiLxAEvTVO");
        setField(term35340, term35340.getClass(), "thumbnail_image", "SffiObxUZK");
        setField(term35340, term35340.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.KakaoProfile$Properties");
        Object[] args = new Object[1];
        args[0] = term35340;
        callMethod(klass, "setProperties", argTypes, term35215, args);
    }

};


