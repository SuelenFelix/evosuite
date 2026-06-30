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

public class CreateMemberRequest_getSocialMedia_13659550844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616;

    public CreateMemberRequest_getSocialMedia_13659550844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1616 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term1653 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1616, term1616.getClass(), "name", "JUmudUmaaV");
        setField(term1616, term1616.getClass(), "image", "KoyGrUJeJW");
        setField(term1616, term1616.getClass(), "description", "HqBOwkVqjD");
        setField(term1653, term1653.getClass(), "facebookUrl", "MAcUBcBckh");
        setField(term1653, term1653.getClass(), "linkedInUrl", "oVgzLbrsFr");
        setField(term1653, term1653.getClass(), "instagramUrl", "vQVyKLdtaz");
        setField(term1616, term1616.getClass(), "socialMedia", term1653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term1616, args);
    }

};


