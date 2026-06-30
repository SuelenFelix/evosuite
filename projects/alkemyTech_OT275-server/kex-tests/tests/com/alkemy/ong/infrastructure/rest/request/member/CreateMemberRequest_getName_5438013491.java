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

public class CreateMemberRequest_getName_5438013491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1214;

    public CreateMemberRequest_getName_5438013491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1214 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term1251 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1214, term1214.getClass(), "name", "onpbIeEKoi");
        setField(term1214, term1214.getClass(), "image", "YRHGsAkhxb");
        setField(term1214, term1214.getClass(), "description", "ffYhPOzlUs");
        setField(term1251, term1251.getClass(), "facebookUrl", "MLqYREekMl");
        setField(term1251, term1251.getClass(), "linkedInUrl", "ytSBIKXogI");
        setField(term1251, term1251.getClass(), "instagramUrl", "nHXjMycHlU");
        setField(term1214, term1214.getClass(), "socialMedia", term1251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1214, args);
    }

};


