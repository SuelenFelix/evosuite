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

public class KakaoProfile_KakaoAccount_setIsemailverified_59467534813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24375;
     Object term24473;

    public KakaoProfile_KakaoAccount_setIsemailverified_59467534813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term24376 = new Boolean(false);
        Boolean term24416 = new Boolean(true);
        Boolean term24423 = new Boolean(true);
        Boolean term24425 = new Boolean(false);
        Boolean term24427 = new Boolean(false);
        Boolean term24429 = new Boolean(false);
        Boolean term24431 = new Boolean(false);
        Boolean term24433 = new Boolean(false);
        Boolean term24435 = new Boolean(false);
        Boolean term24437 = new Boolean(true);
        Boolean term24439 = new Boolean(true);
        Boolean term24453 = new Boolean(false);
        Boolean term24455 = new Boolean(true);
        Boolean term24457 = new Boolean(true);
        Boolean term24459 = new Boolean(true);
        term24375 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24378 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24415 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        Object term24418 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount$Profile"));
        Object term24422 = newInstance(Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount"));
        setField(term24375, term24375.getClass(), "profile_needs_agreement", term24376);
        setField(term24378, term24378.getClass(), "nickname", "jELmrpQCNf");
        setField(term24378, term24378.getClass(), "thumbnail_image_url", "NkjAcBXmmT");
        setField(term24378, term24378.getClass(), "profile_image_url", "KgtGJGInhu");
        setField(term24415, term24415.getClass(), "profile_needs_agreement", term24416);
        setField(term24418, term24418.getClass(), "nickname", "");
        setField(term24418, term24418.getClass(), "thumbnail_image_url", "");
        setField(term24418, term24418.getClass(), "profile_image_url", "");
        setField(term24422, term24422.getClass(), "profile_needs_agreement", term24423);
        setField(term24422, term24422.getClass(), "profile", null);
        setField(term24422, term24422.getClass(), "has_email", term24425);
        setField(term24422, term24422.getClass(), "email_needs_agreement", term24427);
        setField(term24422, term24422.getClass(), "is_email_valid", term24429);
        setField(term24422, term24422.getClass(), "is_email_verified", term24431);
        setField(term24422, term24422.getClass(), "email", null);
        setField(term24422, term24422.getClass(), "this$0", null);
        setField(term24418, term24418.getClass(), "this$1", term24422);
        setField(term24415, term24415.getClass(), "profile", term24418);
        setField(term24415, term24415.getClass(), "has_email", term24433);
        setField(term24415, term24415.getClass(), "email_needs_agreement", term24435);
        setField(term24415, term24415.getClass(), "is_email_valid", term24437);
        setField(term24415, term24415.getClass(), "is_email_verified", term24439);
        setField(term24415, term24415.getClass(), "email", "OoRBUdwown");
        setField(term24415, term24415.getClass(), "this$0", null);
        setField(term24378, term24378.getClass(), "this$1", term24415);
        setField(term24375, term24375.getClass(), "profile", term24378);
        setField(term24375, term24375.getClass(), "has_email", term24453);
        setField(term24375, term24375.getClass(), "email_needs_agreement", term24455);
        setField(term24375, term24375.getClass(), "is_email_valid", term24457);
        setField(term24375, term24375.getClass(), "is_email_verified", term24459);
        setField(term24375, term24375.getClass(), "email", "lSidZunNtu");
        setField(term24375, term24375.getClass(), "this$0", null);
        term24473 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.KakaoProfile$KakaoAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term24473;
        callMethod(klass, "setIs_email_verified", argTypes, term24375, args);
    }

};


