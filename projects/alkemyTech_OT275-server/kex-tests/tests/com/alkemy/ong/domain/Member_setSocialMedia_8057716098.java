package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Member_setSocialMedia_8057716098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14598;
     Object term14674;

    public Member_setSocialMedia_8057716098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14599 = new Long(3931473624300151730L);
        term14598 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14613 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14598, term14598.getClass(), "memberId", term14599);
        setField(term14598, term14598.getClass(), "name", "gqhqalMaKC");
        setField(term14613, term14613.getClass(), "facebookUrl", "qkMduZHBXR");
        setField(term14613, term14613.getClass(), "linkedInUrl", "jMQsCLYfKd");
        setField(term14613, term14613.getClass(), "instagramUrl", "dpcpGqEQLd");
        setField(term14598, term14598.getClass(), "socialMedia", term14613);
        setField(term14598, term14598.getClass(), "imageUrl", "pButgbcWlR");
        setField(term14598, term14598.getClass(), "description", "tPiZMhJIXj");
        term14674 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14674, term14674.getClass(), "facebookUrl", "lrEkNimddJ");
        setField(term14674, term14674.getClass(), "linkedInUrl", "fkeYGEUxMA");
        setField(term14674, term14674.getClass(), "instagramUrl", "aJUGPodUIW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.SocialMedia");
        Object[] args = new Object[1];
        args[0] = term14674;
        callMethod(klass, "setSocialMedia", argTypes, term14598, args);
    }

};


