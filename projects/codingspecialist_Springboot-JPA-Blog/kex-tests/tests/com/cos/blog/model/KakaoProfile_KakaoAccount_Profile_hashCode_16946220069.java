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

public class KakaoProfile_KakaoAccount_Profile_hashCode_16946220069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10943;

    public KakaoProfile_KakaoAccount_Profile_hashCode_16946220069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10981 = new Boolean(true);
        Boolean term11021 = new Boolean(false);
        Boolean term11024 = new Boolean(false);
        Boolean term11026 = new Boolean(false);
        Boolean term11028 = new Boolean(true);
        Boolean term11030 = new Boolean(false);
        Boolean term11033 = new Boolean(false);
        Boolean term11035 = new Boolean(false);
        Boolean term11037 = new Boolean(false);
        Boolean term11039 = new Boolean(false);
        term10943 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10980 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10983 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term11020 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term11023 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term10943, term10943.getClass(), "nickname", "QKYBpCjuYt");
        setField(term10943, term10943.getClass(), "thumbnail_image_url", "vjiRfoGdkl");
        setField(term10943, term10943.getClass(), "profile_image_url", "TwaxeSHvnR");
        setField(term10980, term10980.getClass(), "profile_needs_agreement", term10981);
        setField(term10983, term10983.getClass(), "nickname", "paPzDETzIq");
        setField(term10983, term10983.getClass(), "thumbnail_image_url", "fufeuGfwpN");
        setField(term10983, term10983.getClass(), "profile_image_url", "XJbkXbljvz");
        setField(term11020, term11020.getClass(), "profile_needs_agreement", term11021);
        setField(term11023, term11023.getClass(), "nickname", null);
        setField(term11023, term11023.getClass(), "thumbnail_image_url", null);
        setField(term11023, term11023.getClass(), "profile_image_url", null);
        setField(term11023, term11023.getClass(), "this$1", null);
        setField(term11020, term11020.getClass(), "profile", term11023);
        setField(term11020, term11020.getClass(), "has_email", term11024);
        setField(term11020, term11020.getClass(), "email_needs_agreement", term11026);
        setField(term11020, term11020.getClass(), "is_email_valid", term11028);
        setField(term11020, term11020.getClass(), "is_email_verified", term11030);
        setField(term11020, term11020.getClass(), "email", "");
        setField(term11020, term11020.getClass(), "this$0", null);
        setField(term10983, term10983.getClass(), "this$1", term11020);
        setField(term10980, term10980.getClass(), "profile", term10983);
        setField(term10980, term10980.getClass(), "has_email", term11033);
        setField(term10980, term10980.getClass(), "email_needs_agreement", term11035);
        setField(term10980, term10980.getClass(), "is_email_valid", term11037);
        setField(term10980, term10980.getClass(), "is_email_verified", term11039);
        setField(term10980, term10980.getClass(), "email", "ZKVeStsSNT");
        setField(term10980, term10980.getClass(), "this$0", null);
        setField(term10943, term10943.getClass(), "this$1", term10980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10943, args);
    }

};


