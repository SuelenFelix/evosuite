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

public class KakaoProfile_getProperties_18384784073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34371;

    public KakaoProfile_getProperties_18384784073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34372 = new Integer(-1922583790);
        Boolean term34424 = new Boolean(false);
        Boolean term34464 = new Boolean(false);
        Boolean term34467 = new Boolean(false);
        Boolean term34469 = new Boolean(true);
        Boolean term34471 = new Boolean(false);
        Boolean term34473 = new Boolean(false);
        Boolean term34476 = new Boolean(false);
        Boolean term34478 = new Boolean(false);
        Boolean term34480 = new Boolean(false);
        Boolean term34482 = new Boolean(false);
        term34371 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term34386 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term34423 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34426 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term34463 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term34466 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term34371, term34371.getClass(), "id", term34372);
        setField(term34371, term34371.getClass(), "connected_at", "UqBrzYVNgu");
        setField(term34386, term34386.getClass(), "nickname", "yETjenqbhE");
        setField(term34386, term34386.getClass(), "profile_image", "XzpzIeoooh");
        setField(term34386, term34386.getClass(), "thumbnail_image", "sbsbTdToVA");
        setField(term34386, term34386.getClass(), "this$0", null);
        setField(term34371, term34371.getClass(), "properties", term34386);
        setField(term34423, term34423.getClass(), "profile_needs_agreement", term34424);
        setField(term34426, term34426.getClass(), "nickname", "PTMnmtfPDP");
        setField(term34426, term34426.getClass(), "thumbnail_image_url", "POLJqDqHhk");
        setField(term34426, term34426.getClass(), "profile_image_url", "eXlhmImRUd");
        setField(term34463, term34463.getClass(), "profile_needs_agreement", term34464);
        setField(term34466, term34466.getClass(), "nickname", null);
        setField(term34466, term34466.getClass(), "thumbnail_image_url", null);
        setField(term34466, term34466.getClass(), "profile_image_url", null);
        setField(term34466, term34466.getClass(), "this$1", null);
        setField(term34463, term34463.getClass(), "profile", term34466);
        setField(term34463, term34463.getClass(), "has_email", term34467);
        setField(term34463, term34463.getClass(), "email_needs_agreement", term34469);
        setField(term34463, term34463.getClass(), "is_email_valid", term34471);
        setField(term34463, term34463.getClass(), "is_email_verified", term34473);
        setField(term34463, term34463.getClass(), "email", "");
        setField(term34463, term34463.getClass(), "this$0", null);
        setField(term34426, term34426.getClass(), "this$1", term34463);
        setField(term34423, term34423.getClass(), "profile", term34426);
        setField(term34423, term34423.getClass(), "has_email", term34476);
        setField(term34423, term34423.getClass(), "email_needs_agreement", term34478);
        setField(term34423, term34423.getClass(), "is_email_valid", term34480);
        setField(term34423, term34423.getClass(), "is_email_verified", term34482);
        setField(term34423, term34423.getClass(), "email", "PbMQbuzByL");
        setField(term34423, term34423.getClass(), "this$0", null);
        setField(term34371, term34371.getClass(), "kakao_account", term34423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperties", argTypes, term34371, args);
    }

};


