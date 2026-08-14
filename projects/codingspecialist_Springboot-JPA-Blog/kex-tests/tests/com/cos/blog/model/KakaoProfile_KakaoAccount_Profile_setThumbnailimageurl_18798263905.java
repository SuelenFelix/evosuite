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

public class KakaoProfile_KakaoAccount_Profile_setThumbnailimageurl_18798263905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10177;

    public KakaoProfile_KakaoAccount_Profile_setThumbnailimageurl_18798263905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10215 = new Boolean(false);
        Boolean term10255 = new Boolean(true);
        Boolean term10258 = new Boolean(true);
        Boolean term10260 = new Boolean(false);
        Boolean term10262 = new Boolean(false);
        Boolean term10264 = new Boolean(true);
        Boolean term10267 = new Boolean(false);
        Boolean term10269 = new Boolean(false);
        Boolean term10271 = new Boolean(false);
        Boolean term10273 = new Boolean(true);
        term10177 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10214 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10217 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term10254 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term10257 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term10177, term10177.getClass(), "nickname", "nSWdsVyJRI");
        setField(term10177, term10177.getClass(), "thumbnail_image_url", "JBOPGgGKnc");
        setField(term10177, term10177.getClass(), "profile_image_url", "GlPTiCMCGP");
        setField(term10214, term10214.getClass(), "profile_needs_agreement", term10215);
        setField(term10217, term10217.getClass(), "nickname", "jlcBpLoWfd");
        setField(term10217, term10217.getClass(), "thumbnail_image_url", "oYymmLqbfJ");
        setField(term10217, term10217.getClass(), "profile_image_url", "YaDWphDOSz");
        setField(term10254, term10254.getClass(), "profile_needs_agreement", term10255);
        setField(term10257, term10257.getClass(), "nickname", null);
        setField(term10257, term10257.getClass(), "thumbnail_image_url", null);
        setField(term10257, term10257.getClass(), "profile_image_url", null);
        setField(term10257, term10257.getClass(), "this$1", null);
        setField(term10254, term10254.getClass(), "profile", term10257);
        setField(term10254, term10254.getClass(), "has_email", term10258);
        setField(term10254, term10254.getClass(), "email_needs_agreement", term10260);
        setField(term10254, term10254.getClass(), "is_email_valid", term10262);
        setField(term10254, term10254.getClass(), "is_email_verified", term10264);
        setField(term10254, term10254.getClass(), "email", "");
        setField(term10254, term10254.getClass(), "this$0", null);
        setField(term10217, term10217.getClass(), "this$1", term10254);
        setField(term10214, term10214.getClass(), "profile", term10217);
        setField(term10214, term10214.getClass(), "has_email", term10267);
        setField(term10214, term10214.getClass(), "email_needs_agreement", term10269);
        setField(term10214, term10214.getClass(), "is_email_valid", term10271);
        setField(term10214, term10214.getClass(), "is_email_verified", term10273);
        setField(term10214, term10214.getClass(), "email", "LgXdqWrsLL");
        setField(term10214, term10214.getClass(), "this$0", null);
        setField(term10177, term10177.getClass(), "this$1", term10214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bbHWyibNmy";
        callMethod(klass, "setThumbnail_image_url", argTypes, term10177, args);
    }

};


