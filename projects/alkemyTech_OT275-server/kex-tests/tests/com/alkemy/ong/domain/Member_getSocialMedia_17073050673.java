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

public class Member_getSocialMedia_17073050673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13894;

    public Member_getSocialMedia_17073050673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13895 = new Long(-1526328443223793465L);
        term13894 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term13909 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term13894, term13894.getClass(), "memberId", term13895);
        setField(term13894, term13894.getClass(), "name", "qdIiMKwfzT");
        setField(term13909, term13909.getClass(), "facebookUrl", "qrmUWIxufo");
        setField(term13909, term13909.getClass(), "linkedInUrl", "SeWCUkXfZv");
        setField(term13909, term13909.getClass(), "instagramUrl", "woQcQRYwNH");
        setField(term13894, term13894.getClass(), "socialMedia", term13909);
        setField(term13894, term13894.getClass(), "imageUrl", "uQjzusifTg");
        setField(term13894, term13894.getClass(), "description", "mOulGkUjOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term13894, args);
    }

};


