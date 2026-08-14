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

public class KakaoProfile_KakaoAccount_Profile_getThumbnailimageurl_7494137822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9615;

    public KakaoProfile_KakaoAccount_Profile_getThumbnailimageurl_7494137822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term9653 = new Boolean(false);
        Boolean term9693 = new Boolean(false);
        Boolean term9696 = new Boolean(true);
        Boolean term9698 = new Boolean(true);
        Boolean term9700 = new Boolean(false);
        Boolean term9702 = new Boolean(false);
        Boolean term9705 = new Boolean(false);
        Boolean term9707 = new Boolean(false);
        Boolean term9709 = new Boolean(false);
        Boolean term9711 = new Boolean(false);
        term9615 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9652 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9655 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term9692 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term9695 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        setField(term9615, term9615.getClass(), "nickname", "XCZmhkblRc");
        setField(term9615, term9615.getClass(), "thumbnail_image_url", "gFUWMydGCU");
        setField(term9615, term9615.getClass(), "profile_image_url", "LLegSTfqJt");
        setField(term9652, term9652.getClass(), "profile_needs_agreement", term9653);
        setField(term9655, term9655.getClass(), "nickname", "XQfmqLbqHS");
        setField(term9655, term9655.getClass(), "thumbnail_image_url", "jLVLqQSjqg");
        setField(term9655, term9655.getClass(), "profile_image_url", "JKGueoHesL");
        setField(term9692, term9692.getClass(), "profile_needs_agreement", term9693);
        setField(term9695, term9695.getClass(), "nickname", null);
        setField(term9695, term9695.getClass(), "thumbnail_image_url", null);
        setField(term9695, term9695.getClass(), "profile_image_url", null);
        setField(term9695, term9695.getClass(), "this$1", null);
        setField(term9692, term9692.getClass(), "profile", term9695);
        setField(term9692, term9692.getClass(), "has_email", term9696);
        setField(term9692, term9692.getClass(), "email_needs_agreement", term9698);
        setField(term9692, term9692.getClass(), "is_email_valid", term9700);
        setField(term9692, term9692.getClass(), "is_email_verified", term9702);
        setField(term9692, term9692.getClass(), "email", "");
        setField(term9692, term9692.getClass(), "this$0", null);
        setField(term9655, term9655.getClass(), "this$1", term9692);
        setField(term9652, term9652.getClass(), "profile", term9655);
        setField(term9652, term9652.getClass(), "has_email", term9705);
        setField(term9652, term9652.getClass(), "email_needs_agreement", term9707);
        setField(term9652, term9652.getClass(), "is_email_valid", term9709);
        setField(term9652, term9652.getClass(), "is_email_verified", term9711);
        setField(term9652, term9652.getClass(), "email", "OFTJwdPiTG");
        setField(term9652, term9652.getClass(), "this$0", null);
        setField(term9615, term9615.getClass(), "this$1", term9652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThumbnail_image_url", argTypes, term9615, args);
    }

};


