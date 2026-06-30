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

public class Organization_getName_15055274862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701;

    public Organization_getName_15055274862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term702 = new Long(-316468845751588286L);
        ArrayList term825 = new ArrayList();
        term701 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term764 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term701, term701.getClass(), "id", term702);
        setField(term701, term701.getClass(), "name", "oVgzLbrsFr");
        setField(term701, term701.getClass(), "image", "vQVyKLdtaz");
        setField(term701, term701.getClass(), "phone", "OWKQODBLzb");
        setField(term701, term701.getClass(), "address", "wGmYcqUkgE");
        setField(term701, term701.getClass(), "email", "idgaQsnJpQ");
        setField(term764, term764.getClass(), "facebookUrl", "VgZnGoIFwQ");
        setField(term764, term764.getClass(), "linkedInUrl", "jUbSRrkrYZ");
        setField(term764, term764.getClass(), "instagramUrl", "bWWfajKbEX");
        setField(term701, term701.getClass(), "socialMedia", term764);
        setField(term701, term701.getClass(), "aboutUsText", "cAPeiZHKGJ");
        setField(term701, term701.getClass(), "welcomeText", "LvJFtLBaxj");
        setField(term701, term701.getClass(), "slides", term825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term701, args);
    }

};


