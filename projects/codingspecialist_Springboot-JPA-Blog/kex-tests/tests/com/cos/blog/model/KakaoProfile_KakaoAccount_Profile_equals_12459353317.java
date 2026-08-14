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

public class KakaoProfile_KakaoAccount_Profile_equals_12459353317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10581;
     Object term10691;

    public KakaoProfile_KakaoAccount_Profile_equals_12459353317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10619 = new Boolean(true);
        Boolean term10659 = new Boolean(true);
        Boolean term10662 = new Boolean(false);
        Boolean term10664 = new Boolean(true);
        Boolean term10666 = new Boolean(true);
        Boolean term10668 = new Boolean(true);
        Boolean term10671 = new Boolean(false);
        Boolean term10673 = new Boolean(true);
        Boolean term10675 = new Boolean(false);
        Boolean term10677 = new Boolean(true);
        term10581 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10618 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10621 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10658 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10661 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term10581, term10581.getClass(), "nickname", "EyojsbSjWT");
        setField(term10581, term10581.getClass(), "thumbnail_image_url", "szGicGyWDL");
        setField(term10581, term10581.getClass(), "profile_image_url", "lkdvUiYwRq");
        setField(term10618, term10618.getClass(), "profile_needs_agreement", term10619);
        setField(term10621, term10621.getClass(), "nickname", "XuxkPrpfND");
        setField(term10621, term10621.getClass(), "thumbnail_image_url", "OxNXeKMDje");
        setField(term10621, term10621.getClass(), "profile_image_url", "hGTqHomrbc");
        setField(term10658, term10658.getClass(), "profile_needs_agreement", term10659);
        setField(term10661, term10661.getClass(), "nickname", null);
        setField(term10661, term10661.getClass(), "thumbnail_image_url", null);
        setField(term10661, term10661.getClass(), "profile_image_url", null);
        setField(term10661, term10661.getClass(), "this$1", null);
        setField(term10658, term10658.getClass(), "profile", term10661);
        setField(term10658, term10658.getClass(), "has_email", term10662);
        setField(term10658, term10658.getClass(), "email_needs_agreement", term10664);
        setField(term10658, term10658.getClass(), "is_email_valid", term10666);
        setField(term10658, term10658.getClass(), "is_email_verified", term10668);
        setField(term10658, term10658.getClass(), "email", "");
        setField(term10658, term10658.getClass(), "this$0", null);
        setField(term10621, term10621.getClass(), "this$1", term10658);
        setField(term10618, term10618.getClass(), "profile", term10621);
        setField(term10618, term10618.getClass(), "has_email", term10671);
        setField(term10618, term10618.getClass(), "email_needs_agreement", term10673);
        setField(term10618, term10618.getClass(), "is_email_valid", term10675);
        setField(term10618, term10618.getClass(), "is_email_verified", term10677);
        setField(term10618, term10618.getClass(), "email", "Yrvtdcltri");
        setField(term10618, term10618.getClass(), "this$0", null);
        setField(term10581, term10581.getClass(), "this$1", term10618);
        term10691 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10691;
        callMethod(klass, "equals", argTypes, term10581, args);
    }

};


