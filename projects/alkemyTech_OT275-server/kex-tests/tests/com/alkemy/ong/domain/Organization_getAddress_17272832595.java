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

public class Organization_getAddress_17272832595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1466;

    public Organization_getAddress_17272832595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1467 = new Long(1967728129628047933L);
        ArrayList term1590 = new ArrayList();
        term1466 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1529 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term1466, term1466.getClass(), "id", term1467);
        setField(term1466, term1466.getClass(), "name", "mvrkADEgpp");
        setField(term1466, term1466.getClass(), "image", "pXOkjyeIRb");
        setField(term1466, term1466.getClass(), "phone", "GgZWSjxjyE");
        setField(term1466, term1466.getClass(), "address", "EeBVbzjcCI");
        setField(term1466, term1466.getClass(), "email", "UfQtPRyWRC");
        setField(term1529, term1529.getClass(), "facebookUrl", "FPvxVzzSvD");
        setField(term1529, term1529.getClass(), "linkedInUrl", "WHcwFgsGFC");
        setField(term1529, term1529.getClass(), "instagramUrl", "HzqpegHiRq");
        setField(term1466, term1466.getClass(), "socialMedia", term1529);
        setField(term1466, term1466.getClass(), "aboutUsText", "jwsfVjMoJT");
        setField(term1466, term1466.getClass(), "welcomeText", "ZfdXfCCFDf");
        setField(term1466, term1466.getClass(), "slides", term1590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term1466, args);
    }

};


