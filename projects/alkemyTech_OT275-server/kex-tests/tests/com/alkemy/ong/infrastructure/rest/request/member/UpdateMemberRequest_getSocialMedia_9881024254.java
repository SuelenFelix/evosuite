package com.alkemy.ong.infrastructure.rest.request.member;

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
import static com.alkemy.ong.infrastructure.rest.request.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UpdateMemberRequest_getSocialMedia_9881024254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public UpdateMemberRequest_getSocialMedia_9881024254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest"));
        Object term440 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term403, term403.getClass(), "name", "HyxfbSQYBe");
        setField(term403, term403.getClass(), "image", "pCTimMblYc");
        setField(term403, term403.getClass(), "description", "hNxWaHcfhY");
        setField(term440, term440.getClass(), "facebookUrl", "RkybSrpybU");
        setField(term440, term440.getClass(), "linkedInUrl", "xOEqzGAmDU");
        setField(term440, term440.getClass(), "instagramUrl", "eZFUvlxvGV");
        setField(term403, term403.getClass(), "socialMedia", term440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.UpdateMemberRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term403, args);
    }

};


