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

public class KakaoProfile_KakaoAccount_Profile_getProfileimageurl_20063982913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9795;

    public KakaoProfile_KakaoAccount_Profile_getProfileimageurl_20063982913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term9833 = new Boolean(false);
        Boolean term9873 = new Boolean(true);
        Boolean term9876 = new Boolean(true);
        Boolean term9878 = new Boolean(true);
        Boolean term9880 = new Boolean(false);
        Boolean term9882 = new Boolean(false);
        Boolean term9885 = new Boolean(true);
        Boolean term9887 = new Boolean(true);
        Boolean term9889 = new Boolean(true);
        Boolean term9891 = new Boolean(false);
        term9795 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9832 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9835 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9872 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9875 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term9795, term9795.getClass(), "nickname", "QiUprSEluR");
        setField(term9795, term9795.getClass(), "thumbnail_image_url", "cDOXXottZh");
        setField(term9795, term9795.getClass(), "profile_image_url", "rfqJDkDppz");
        setField(term9832, term9832.getClass(), "profile_needs_agreement", term9833);
        setField(term9835, term9835.getClass(), "nickname", "MGorMVGauT");
        setField(term9835, term9835.getClass(), "thumbnail_image_url", "jXKxUGTuEF");
        setField(term9835, term9835.getClass(), "profile_image_url", "nDCcyhiTnS");
        setField(term9872, term9872.getClass(), "profile_needs_agreement", term9873);
        setField(term9875, term9875.getClass(), "nickname", null);
        setField(term9875, term9875.getClass(), "thumbnail_image_url", null);
        setField(term9875, term9875.getClass(), "profile_image_url", null);
        setField(term9875, term9875.getClass(), "this$1", null);
        setField(term9872, term9872.getClass(), "profile", term9875);
        setField(term9872, term9872.getClass(), "has_email", term9876);
        setField(term9872, term9872.getClass(), "email_needs_agreement", term9878);
        setField(term9872, term9872.getClass(), "is_email_valid", term9880);
        setField(term9872, term9872.getClass(), "is_email_verified", term9882);
        setField(term9872, term9872.getClass(), "email", "");
        setField(term9872, term9872.getClass(), "this$0", null);
        setField(term9835, term9835.getClass(), "this$1", term9872);
        setField(term9832, term9832.getClass(), "profile", term9835);
        setField(term9832, term9832.getClass(), "has_email", term9885);
        setField(term9832, term9832.getClass(), "email_needs_agreement", term9887);
        setField(term9832, term9832.getClass(), "is_email_valid", term9889);
        setField(term9832, term9832.getClass(), "is_email_verified", term9891);
        setField(term9832, term9832.getClass(), "email", "lBpveIKbea");
        setField(term9832, term9832.getClass(), "this$0", null);
        setField(term9795, term9795.getClass(), "this$1", term9832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfile_image_url", argTypes, term9795, args);
    }

};


