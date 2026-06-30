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

public class Member_getImageUrl_17354274564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14030;

    public Member_getImageUrl_17354274564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14031 = new Long(-412186147449928821L);
        term14030 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14045 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14030, term14030.getClass(), "memberId", term14031);
        setField(term14030, term14030.getClass(), "name", "hNWRuNEgOf");
        setField(term14045, term14045.getClass(), "facebookUrl", "CEtjGBplmv");
        setField(term14045, term14045.getClass(), "linkedInUrl", "XosDTAzIAT");
        setField(term14045, term14045.getClass(), "instagramUrl", "lcCEhCpiZM");
        setField(term14030, term14030.getClass(), "socialMedia", term14045);
        setField(term14030, term14030.getClass(), "imageUrl", "OPJlqMJxdq");
        setField(term14030, term14030.getClass(), "description", "COhzwXcfds");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term14030, args);
    }

};


