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

public class KakaoProfile_getConnectedat_19147265922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34166;

    public KakaoProfile_getConnectedat_19147265922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34167 = new Integer(391863371);
        Boolean term34219 = new Boolean(true);
        Boolean term34259 = new Boolean(false);
        Boolean term34262 = new Boolean(false);
        Boolean term34264 = new Boolean(true);
        Boolean term34266 = new Boolean(true);
        Boolean term34268 = new Boolean(true);
        Boolean term34271 = new Boolean(false);
        Boolean term34273 = new Boolean(true);
        Boolean term34275 = new Boolean(true);
        Boolean term34277 = new Boolean(true);
        term34166 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term34181 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term34218 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34221 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term34258 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34261 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term34166, term34166.getClass(), "id", term34167);
        setField(term34166, term34166.getClass(), "connected_at", "oOxKzvqxUJ");
        setField(term34181, term34181.getClass(), "nickname", "tjqgiPrtgj");
        setField(term34181, term34181.getClass(), "profile_image", "atajdBiCpk");
        setField(term34181, term34181.getClass(), "thumbnail_image", "iZkNHOfNWw");
        setField(term34181, term34181.getClass(), "this$0", null);
        setField(term34166, term34166.getClass(), "properties", term34181);
        setField(term34218, term34218.getClass(), "profile_needs_agreement", term34219);
        setField(term34221, term34221.getClass(), "nickname", "SxvlCppquX");
        setField(term34221, term34221.getClass(), "thumbnail_image_url", "KXtTCHHVWr");
        setField(term34221, term34221.getClass(), "profile_image_url", "ylbTmYKeKr");
        setField(term34258, term34258.getClass(), "profile_needs_agreement", term34259);
        setField(term34261, term34261.getClass(), "nickname", null);
        setField(term34261, term34261.getClass(), "thumbnail_image_url", null);
        setField(term34261, term34261.getClass(), "profile_image_url", null);
        setField(term34261, term34261.getClass(), "this$1", null);
        setField(term34258, term34258.getClass(), "profile", term34261);
        setField(term34258, term34258.getClass(), "has_email", term34262);
        setField(term34258, term34258.getClass(), "email_needs_agreement", term34264);
        setField(term34258, term34258.getClass(), "is_email_valid", term34266);
        setField(term34258, term34258.getClass(), "is_email_verified", term34268);
        setField(term34258, term34258.getClass(), "email", "");
        setField(term34258, term34258.getClass(), "this$0", null);
        setField(term34221, term34221.getClass(), "this$1", term34258);
        setField(term34218, term34218.getClass(), "profile", term34221);
        setField(term34218, term34218.getClass(), "has_email", term34271);
        setField(term34218, term34218.getClass(), "email_needs_agreement", term34273);
        setField(term34218, term34218.getClass(), "is_email_valid", term34275);
        setField(term34218, term34218.getClass(), "is_email_verified", term34277);
        setField(term34218, term34218.getClass(), "email", "BczZfNSwaD");
        setField(term34218, term34218.getClass(), "this$0", null);
        setField(term34166, term34166.getClass(), "kakao_account", term34218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnected_at", argTypes, term34166, args);
    }

};


