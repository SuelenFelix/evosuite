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

public class KakaoProfile_getId_19092009051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33961;

    public KakaoProfile_getId_19092009051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33962 = new Integer(1484323161);
        Boolean term34014 = new Boolean(true);
        Boolean term34054 = new Boolean(true);
        Boolean term34057 = new Boolean(false);
        Boolean term34059 = new Boolean(true);
        Boolean term34061 = new Boolean(true);
        Boolean term34063 = new Boolean(false);
        Boolean term34066 = new Boolean(false);
        Boolean term34068 = new Boolean(true);
        Boolean term34070 = new Boolean(false);
        Boolean term34072 = new Boolean(false);
        term33961 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term33976 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term34013 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34016 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term34053 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34056 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term33961, term33961.getClass(), "id", term33962);
        setField(term33961, term33961.getClass(), "connected_at", "vasBXGWtux");
        setField(term33976, term33976.getClass(), "nickname", "UfUIICYJWk");
        setField(term33976, term33976.getClass(), "profile_image", "vuGxdvURpp");
        setField(term33976, term33976.getClass(), "thumbnail_image", "zUgAERZZFZ");
        setField(term33976, term33976.getClass(), "this$0", null);
        setField(term33961, term33961.getClass(), "properties", term33976);
        setField(term34013, term34013.getClass(), "profile_needs_agreement", term34014);
        setField(term34016, term34016.getClass(), "nickname", "QhkdVFKaoy");
        setField(term34016, term34016.getClass(), "thumbnail_image_url", "WCQDPwVjsS");
        setField(term34016, term34016.getClass(), "profile_image_url", "XkZOYFvTGI");
        setField(term34053, term34053.getClass(), "profile_needs_agreement", term34054);
        setField(term34056, term34056.getClass(), "nickname", null);
        setField(term34056, term34056.getClass(), "thumbnail_image_url", null);
        setField(term34056, term34056.getClass(), "profile_image_url", null);
        setField(term34056, term34056.getClass(), "this$1", null);
        setField(term34053, term34053.getClass(), "profile", term34056);
        setField(term34053, term34053.getClass(), "has_email", term34057);
        setField(term34053, term34053.getClass(), "email_needs_agreement", term34059);
        setField(term34053, term34053.getClass(), "is_email_valid", term34061);
        setField(term34053, term34053.getClass(), "is_email_verified", term34063);
        setField(term34053, term34053.getClass(), "email", "");
        setField(term34053, term34053.getClass(), "this$0", null);
        setField(term34016, term34016.getClass(), "this$1", term34053);
        setField(term34013, term34013.getClass(), "profile", term34016);
        setField(term34013, term34013.getClass(), "has_email", term34066);
        setField(term34013, term34013.getClass(), "email_needs_agreement", term34068);
        setField(term34013, term34013.getClass(), "is_email_valid", term34070);
        setField(term34013, term34013.getClass(), "is_email_verified", term34072);
        setField(term34013, term34013.getClass(), "email", "UYWsaWaOUS");
        setField(term34013, term34013.getClass(), "this$0", null);
        setField(term33961, term33961.getClass(), "kakao_account", term34013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term33961, args);
    }

};


