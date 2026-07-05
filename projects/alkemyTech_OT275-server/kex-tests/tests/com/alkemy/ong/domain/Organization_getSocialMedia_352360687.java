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
import java.util.ArrayList;

public class Organization_getSocialMedia_352360687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003;

    public Organization_getSocialMedia_352360687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2004 = new Long(5907001541142728739L);
        ArrayList term2127 = new ArrayList();
        term2003 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term2066 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term2003, term2003.getClass(), "id", term2004);
        setField(term2003, term2003.getClass(), "name", "XJJNClzHRf");
        setField(term2003, term2003.getClass(), "image", "HDaezxQfQR");
        setField(term2003, term2003.getClass(), "phone", "iikZEapDlu");
        setField(term2003, term2003.getClass(), "address", "nhoHrZfnIN");
        setField(term2003, term2003.getClass(), "email", "ZkMALXpEAZ");
        setField(term2066, term2066.getClass(), "facebookUrl", "tXfQjSqDzN");
        setField(term2066, term2066.getClass(), "linkedInUrl", "BjugTaMcxJ");
        setField(term2066, term2066.getClass(), "instagramUrl", "vGiuZVPJNH");
        setField(term2003, term2003.getClass(), "socialMedia", term2066);
        setField(term2003, term2003.getClass(), "aboutUsText", "tlzpzIjMib");
        setField(term2003, term2003.getClass(), "welcomeText", "AZdLeSugwv");
        setField(term2003, term2003.getClass(), "slides", term2127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term2003, args);
    }

};


