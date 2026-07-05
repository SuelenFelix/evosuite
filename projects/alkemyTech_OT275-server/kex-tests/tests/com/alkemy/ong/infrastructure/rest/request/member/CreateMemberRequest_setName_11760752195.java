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

public class CreateMemberRequest_setName_11760752195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;

    public CreateMemberRequest_setName_11760752195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1750 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term1787 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1750, term1750.getClass(), "name", "OWKQODBLzb");
        setField(term1750, term1750.getClass(), "image", "wGmYcqUkgE");
        setField(term1750, term1750.getClass(), "description", "idgaQsnJpQ");
        setField(term1787, term1787.getClass(), "facebookUrl", "VgZnGoIFwQ");
        setField(term1787, term1787.getClass(), "linkedInUrl", "jUbSRrkrYZ");
        setField(term1787, term1787.getClass(), "instagramUrl", "bWWfajKbEX");
        setField(term1750, term1750.getClass(), "socialMedia", term1787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cAPeiZHKGJ";
        callMethod(klass, "setName", argTypes, term1750, args);
    }

};


