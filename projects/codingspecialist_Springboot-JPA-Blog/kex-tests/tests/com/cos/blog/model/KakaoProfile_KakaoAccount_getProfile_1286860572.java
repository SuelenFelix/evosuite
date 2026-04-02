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

public class KakaoProfile_KakaoAccount_getProfile_1286860572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22559;

    public KakaoProfile_KakaoAccount_getProfile_1286860572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term22560 = new Boolean(true);
        Boolean term22600 = new Boolean(false);
        Boolean term22607 = new Boolean(true);
        Boolean term22609 = new Boolean(true);
        Boolean term22611 = new Boolean(false);
        Boolean term22613 = new Boolean(true);
        Boolean term22615 = new Boolean(true);
        Boolean term22617 = new Boolean(false);
        Boolean term22619 = new Boolean(true);
        Boolean term22621 = new Boolean(false);
        Boolean term22623 = new Boolean(true);
        Boolean term22637 = new Boolean(false);
        Boolean term22639 = new Boolean(false);
        Boolean term22641 = new Boolean(true);
        Boolean term22643 = new Boolean(false);
        term22559 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22562 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22599 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term22602 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term22606 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term22559, term22559.getClass(), "profile_needs_agreement", term22560);
        setField(term22562, term22562.getClass(), "nickname", "urrmpQzmTU");
        setField(term22562, term22562.getClass(), "thumbnail_image_url", "GWoZyTTlNx");
        setField(term22562, term22562.getClass(), "profile_image_url", "ntUYcalSmz");
        setField(term22599, term22599.getClass(), "profile_needs_agreement", term22600);
        setField(term22602, term22602.getClass(), "nickname", "");
        setField(term22602, term22602.getClass(), "thumbnail_image_url", "");
        setField(term22602, term22602.getClass(), "profile_image_url", "");
        setField(term22606, term22606.getClass(), "profile_needs_agreement", term22607);
        setField(term22606, term22606.getClass(), "profile", null);
        setField(term22606, term22606.getClass(), "has_email", term22609);
        setField(term22606, term22606.getClass(), "email_needs_agreement", term22611);
        setField(term22606, term22606.getClass(), "is_email_valid", term22613);
        setField(term22606, term22606.getClass(), "is_email_verified", term22615);
        setField(term22606, term22606.getClass(), "email", null);
        setField(term22606, term22606.getClass(), "this$0", null);
        setField(term22602, term22602.getClass(), "this$1", term22606);
        setField(term22599, term22599.getClass(), "profile", term22602);
        setField(term22599, term22599.getClass(), "has_email", term22617);
        setField(term22599, term22599.getClass(), "email_needs_agreement", term22619);
        setField(term22599, term22599.getClass(), "is_email_valid", term22621);
        setField(term22599, term22599.getClass(), "is_email_verified", term22623);
        setField(term22599, term22599.getClass(), "email", "AgQWngzXPH");
        setField(term22599, term22599.getClass(), "this$0", null);
        setField(term22562, term22562.getClass(), "this$1", term22599);
        setField(term22559, term22559.getClass(), "profile", term22562);
        setField(term22559, term22559.getClass(), "has_email", term22637);
        setField(term22559, term22559.getClass(), "email_needs_agreement", term22639);
        setField(term22559, term22559.getClass(), "is_email_valid", term22641);
        setField(term22559, term22559.getClass(), "is_email_verified", term22643);
        setField(term22559, term22559.getClass(), "email", "EZJmAIzdHM");
        setField(term22559, term22559.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfile", argTypes, term22559, args);
    }

};


