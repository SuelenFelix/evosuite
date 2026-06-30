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

public class Member_setName_15533350557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14440;

    public Member_setName_15533350557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14441 = new Long(3453457027014743006L);
        term14440 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14455 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14440, term14440.getClass(), "memberId", term14441);
        setField(term14440, term14440.getClass(), "name", "HTimNhSNVi");
        setField(term14455, term14455.getClass(), "facebookUrl", "IWJWbrHcqm");
        setField(term14455, term14455.getClass(), "linkedInUrl", "ucTcadpUdW");
        setField(term14455, term14455.getClass(), "instagramUrl", "AscVKZhCwm");
        setField(term14440, term14440.getClass(), "socialMedia", term14455);
        setField(term14440, term14440.getClass(), "imageUrl", "HCvSsQWjLn");
        setField(term14440, term14440.getClass(), "description", "FTuOcSieav");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qSnwPXRuzC";
        callMethod(klass, "setName", argTypes, term14440, args);
    }

};


