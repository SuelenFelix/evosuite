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

public class KakaoProfile_KakaoAccount_equals_76750089815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24695;
     Object term24793;

    public KakaoProfile_KakaoAccount_equals_76750089815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24696 = new Boolean(false);
        Boolean term24736 = new Boolean(false);
        Boolean term24743 = new Boolean(true);
        Boolean term24745 = new Boolean(false);
        Boolean term24747 = new Boolean(true);
        Boolean term24749 = new Boolean(false);
        Boolean term24751 = new Boolean(false);
        Boolean term24753 = new Boolean(false);
        Boolean term24755 = new Boolean(false);
        Boolean term24757 = new Boolean(false);
        Boolean term24759 = new Boolean(true);
        Boolean term24773 = new Boolean(false);
        Boolean term24775 = new Boolean(false);
        Boolean term24777 = new Boolean(true);
        Boolean term24779 = new Boolean(false);
        term24695 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24698 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24735 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24738 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24742 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24695, term24695.getClass(), "profile_needs_agreement", term24696);
        setField(term24698, term24698.getClass(), "nickname", "QDaTqkWnGj");
        setField(term24698, term24698.getClass(), "thumbnail_image_url", "vNObzQvzxo");
        setField(term24698, term24698.getClass(), "profile_image_url", "uyuWzXeJvn");
        setField(term24735, term24735.getClass(), "profile_needs_agreement", term24736);
        setField(term24738, term24738.getClass(), "nickname", "");
        setField(term24738, term24738.getClass(), "thumbnail_image_url", "");
        setField(term24738, term24738.getClass(), "profile_image_url", "");
        setField(term24742, term24742.getClass(), "profile_needs_agreement", term24743);
        setField(term24742, term24742.getClass(), "profile", null);
        setField(term24742, term24742.getClass(), "has_email", term24745);
        setField(term24742, term24742.getClass(), "email_needs_agreement", term24747);
        setField(term24742, term24742.getClass(), "is_email_valid", term24749);
        setField(term24742, term24742.getClass(), "is_email_verified", term24751);
        setField(term24742, term24742.getClass(), "email", null);
        setField(term24742, term24742.getClass(), "this$0", null);
        setField(term24738, term24738.getClass(), "this$1", term24742);
        setField(term24735, term24735.getClass(), "profile", term24738);
        setField(term24735, term24735.getClass(), "has_email", term24753);
        setField(term24735, term24735.getClass(), "email_needs_agreement", term24755);
        setField(term24735, term24735.getClass(), "is_email_valid", term24757);
        setField(term24735, term24735.getClass(), "is_email_verified", term24759);
        setField(term24735, term24735.getClass(), "email", "aDEuPKrSZt");
        setField(term24735, term24735.getClass(), "this$0", null);
        setField(term24698, term24698.getClass(), "this$1", term24735);
        setField(term24695, term24695.getClass(), "profile", term24698);
        setField(term24695, term24695.getClass(), "has_email", term24773);
        setField(term24695, term24695.getClass(), "email_needs_agreement", term24775);
        setField(term24695, term24695.getClass(), "is_email_valid", term24777);
        setField(term24695, term24695.getClass(), "is_email_verified", term24779);
        setField(term24695, term24695.getClass(), "email", "aDhkmoCCUK");
        setField(term24695, term24695.getClass(), "this$0", null);
        term24793 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24793;
        callMethod(klass, "equals", argTypes, term24695, args);
    }

};


