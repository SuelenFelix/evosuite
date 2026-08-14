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

public class KakaoProfile_setKakaoaccount_16375750948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35487;
     Object term35612;

    public KakaoProfile_setKakaoaccount_16375750948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35488 = new Integer(1725571209);
        Boolean term35540 = new Boolean(false);
        Boolean term35580 = new Boolean(false);
        Boolean term35583 = new Boolean(false);
        Boolean term35585 = new Boolean(false);
        Boolean term35587 = new Boolean(false);
        Boolean term35589 = new Boolean(true);
        Boolean term35592 = new Boolean(true);
        Boolean term35594 = new Boolean(false);
        Boolean term35596 = new Boolean(false);
        Boolean term35598 = new Boolean(true);
        term35487 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term35502 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term35539 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35542 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term35579 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35582 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term35487, term35487.getClass(), "id", term35488);
        setField(term35487, term35487.getClass(), "connected_at", "uzPbXEJVpP");
        setField(term35502, term35502.getClass(), "nickname", "vDorZRqjUi");
        setField(term35502, term35502.getClass(), "profile_image", "pTjttMNuyX");
        setField(term35502, term35502.getClass(), "thumbnail_image", "fFPyzrPhJi");
        setField(term35502, term35502.getClass(), "this$0", null);
        setField(term35487, term35487.getClass(), "properties", term35502);
        setField(term35539, term35539.getClass(), "profile_needs_agreement", term35540);
        setField(term35542, term35542.getClass(), "nickname", "tiYwzLkwHD");
        setField(term35542, term35542.getClass(), "thumbnail_image_url", "vHPMbWTklV");
        setField(term35542, term35542.getClass(), "profile_image_url", "phgJprcnjd");
        setField(term35579, term35579.getClass(), "profile_needs_agreement", term35580);
        setField(term35582, term35582.getClass(), "nickname", null);
        setField(term35582, term35582.getClass(), "thumbnail_image_url", null);
        setField(term35582, term35582.getClass(), "profile_image_url", null);
        setField(term35582, term35582.getClass(), "this$1", null);
        setField(term35579, term35579.getClass(), "profile", term35582);
        setField(term35579, term35579.getClass(), "has_email", term35583);
        setField(term35579, term35579.getClass(), "email_needs_agreement", term35585);
        setField(term35579, term35579.getClass(), "is_email_valid", term35587);
        setField(term35579, term35579.getClass(), "is_email_verified", term35589);
        setField(term35579, term35579.getClass(), "email", "");
        setField(term35579, term35579.getClass(), "this$0", null);
        setField(term35542, term35542.getClass(), "this$1", term35579);
        setField(term35539, term35539.getClass(), "profile", term35542);
        setField(term35539, term35539.getClass(), "has_email", term35592);
        setField(term35539, term35539.getClass(), "email_needs_agreement", term35594);
        setField(term35539, term35539.getClass(), "is_email_valid", term35596);
        setField(term35539, term35539.getClass(), "is_email_verified", term35598);
        setField(term35539, term35539.getClass(), "email", "vmxQPAehpJ");
        setField(term35539, term35539.getClass(), "this$0", null);
        setField(term35487, term35487.getClass(), "kakao_account", term35539);
        Boolean term35613 = new Boolean(true);
        Boolean term35653 = new Boolean(true);
        Boolean term35660 = new Boolean(true);
        Boolean term35662 = new Boolean(true);
        Boolean term35664 = new Boolean(false);
        Boolean term35666 = new Boolean(true);
        Boolean term35668 = new Boolean(false);
        Boolean term35670 = new Boolean(true);
        Boolean term35672 = new Boolean(true);
        Boolean term35674 = new Boolean(false);
        Boolean term35676 = new Boolean(false);
        Boolean term35690 = new Boolean(false);
        Boolean term35692 = new Boolean(true);
        Boolean term35694 = new Boolean(false);
        Boolean term35696 = new Boolean(true);
        term35612 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35615 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term35652 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35655 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term35659 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term35612, term35612.getClass(), "profile_needs_agreement", term35613);
        setField(term35615, term35615.getClass(), "nickname", "xoFNyRpjCp");
        setField(term35615, term35615.getClass(), "thumbnail_image_url", "WPaMGzqiDs");
        setField(term35615, term35615.getClass(), "profile_image_url", "YtgjAWKCrQ");
        setField(term35652, term35652.getClass(), "profile_needs_agreement", term35653);
        setField(term35655, term35655.getClass(), "nickname", "");
        setField(term35655, term35655.getClass(), "thumbnail_image_url", "");
        setField(term35655, term35655.getClass(), "profile_image_url", "");
        setField(term35659, term35659.getClass(), "profile_needs_agreement", term35660);
        setField(term35659, term35659.getClass(), "profile", null);
        setField(term35659, term35659.getClass(), "has_email", term35662);
        setField(term35659, term35659.getClass(), "email_needs_agreement", term35664);
        setField(term35659, term35659.getClass(), "is_email_valid", term35666);
        setField(term35659, term35659.getClass(), "is_email_verified", term35668);
        setField(term35659, term35659.getClass(), "email", null);
        setField(term35659, term35659.getClass(), "this$0", null);
        setField(term35655, term35655.getClass(), "this$1", term35659);
        setField(term35652, term35652.getClass(), "profile", term35655);
        setField(term35652, term35652.getClass(), "has_email", term35670);
        setField(term35652, term35652.getClass(), "email_needs_agreement", term35672);
        setField(term35652, term35652.getClass(), "is_email_valid", term35674);
        setField(term35652, term35652.getClass(), "is_email_verified", term35676);
        setField(term35652, term35652.getClass(), "email", "IOLqavRFIA");
        setField(term35652, term35652.getClass(), "this$0", null);
        setField(term35615, term35615.getClass(), "this$1", term35652);
        setField(term35612, term35612.getClass(), "profile", term35615);
        setField(term35612, term35612.getClass(), "has_email", term35690);
        setField(term35612, term35612.getClass(), "email_needs_agreement", term35692);
        setField(term35612, term35612.getClass(), "is_email_valid", term35694);
        setField(term35612, term35612.getClass(), "is_email_verified", term35696);
        setField(term35612, term35612.getClass(), "email", "FpmxstceWP");
        setField(term35612, term35612.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Object[] args = new Object[1];
        args[0] = term35612;
        callMethod(klass, "setKakao_account", argTypes, term35487, args);
    }

};


