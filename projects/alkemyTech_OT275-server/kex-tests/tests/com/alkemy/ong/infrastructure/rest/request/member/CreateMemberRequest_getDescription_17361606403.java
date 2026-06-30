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

public class CreateMemberRequest_getDescription_17361606403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;

    public CreateMemberRequest_getDescription_17361606403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term1519 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1482, term1482.getClass(), "name", "kBdSllIBVz");
        setField(term1482, term1482.getClass(), "image", "TJmVBGfTML");
        setField(term1482, term1482.getClass(), "description", "tPlsykYBqO");
        setField(term1519, term1519.getClass(), "facebookUrl", "bLPjGVBhlX");
        setField(term1519, term1519.getClass(), "linkedInUrl", "whBvTVIIlC");
        setField(term1519, term1519.getClass(), "instagramUrl", "IgRJUzaCwW");
        setField(term1482, term1482.getClass(), "socialMedia", term1519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1482, args);
    }

};


