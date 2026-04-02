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

public class KakaoProfile_setConnectedat_9203857686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34988;

    public KakaoProfile_setConnectedat_9203857686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34989 = new Integer(1227103734);
        Boolean term35041 = new Boolean(false);
        Boolean term35081 = new Boolean(true);
        Boolean term35084 = new Boolean(false);
        Boolean term35086 = new Boolean(false);
        Boolean term35088 = new Boolean(false);
        Boolean term35090 = new Boolean(true);
        Boolean term35093 = new Boolean(true);
        Boolean term35095 = new Boolean(true);
        Boolean term35097 = new Boolean(true);
        Boolean term35099 = new Boolean(false);
        term34988 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile"));
        Object term35003 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$Properties"));
        Object term35040 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35043 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term35080 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term35083 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term34988, term34988.getClass(), "id", term34989);
        setField(term34988, term34988.getClass(), "connected_at", "BKaXfQaGqm");
        setField(term35003, term35003.getClass(), "nickname", "OpadJlQqJc");
        setField(term35003, term35003.getClass(), "profile_image", "ZXdFbwHLvQ");
        setField(term35003, term35003.getClass(), "thumbnail_image", "VEastYHDbF");
        setField(term35003, term35003.getClass(), "this$0", null);
        setField(term34988, term34988.getClass(), "properties", term35003);
        setField(term35040, term35040.getClass(), "profile_needs_agreement", term35041);
        setField(term35043, term35043.getClass(), "nickname", "CVrxrIRbBP");
        setField(term35043, term35043.getClass(), "thumbnail_image_url", "qMveUiByVL");
        setField(term35043, term35043.getClass(), "profile_image_url", "VfhPQKCIrE");
        setField(term35080, term35080.getClass(), "profile_needs_agreement", term35081);
        setField(term35083, term35083.getClass(), "nickname", null);
        setField(term35083, term35083.getClass(), "thumbnail_image_url", null);
        setField(term35083, term35083.getClass(), "profile_image_url", null);
        setField(term35083, term35083.getClass(), "this$1", null);
        setField(term35080, term35080.getClass(), "profile", term35083);
        setField(term35080, term35080.getClass(), "has_email", term35084);
        setField(term35080, term35080.getClass(), "email_needs_agreement", term35086);
        setField(term35080, term35080.getClass(), "is_email_valid", term35088);
        setField(term35080, term35080.getClass(), "is_email_verified", term35090);
        setField(term35080, term35080.getClass(), "email", "");
        setField(term35080, term35080.getClass(), "this$0", null);
        setField(term35043, term35043.getClass(), "this$1", term35080);
        setField(term35040, term35040.getClass(), "profile", term35043);
        setField(term35040, term35040.getClass(), "has_email", term35093);
        setField(term35040, term35040.getClass(), "email_needs_agreement", term35095);
        setField(term35040, term35040.getClass(), "is_email_valid", term35097);
        setField(term35040, term35040.getClass(), "is_email_verified", term35099);
        setField(term35040, term35040.getClass(), "email", "TwTeGrJqeV");
        setField(term35040, term35040.getClass(), "this$0", null);
        setField(term34988, term34988.getClass(), "kakao_account", term35040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EmqjtKbtwp";
        callMethod(klass, "setConnected_at", argTypes, term34988, args);
    }

};


