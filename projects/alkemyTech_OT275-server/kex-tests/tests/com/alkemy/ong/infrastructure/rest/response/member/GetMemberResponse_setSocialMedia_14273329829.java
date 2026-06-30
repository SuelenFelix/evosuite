package com.alkemy.ong.infrastructure.rest.response.member;

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
import static com.alkemy.ong.infrastructure.rest.response.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class GetMemberResponse_setSocialMedia_14273329829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293;
     Object term1369;

    public GetMemberResponse_setSocialMedia_14273329829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1294 = new Long(-2813493605142626659L);
        term1293 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term1332 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1293, term1293.getClass(), "memberId", term1294);
        setField(term1293, term1293.getClass(), "name", "MLqYREekMl");
        setField(term1293, term1293.getClass(), "imageUrl", "ytSBIKXogI");
        setField(term1293, term1293.getClass(), "description", "nHXjMycHlU");
        setField(term1332, term1332.getClass(), "facebookUrl", "ieCtQFdkii");
        setField(term1332, term1332.getClass(), "linkedInUrl", "dEnhdmILtU");
        setField(term1332, term1332.getClass(), "instagramUrl", "hoicvmsovO");
        setField(term1293, term1293.getClass(), "socialMedia", term1332);
        term1369 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1369, term1369.getClass(), "facebookUrl", "eqJfYWRaEL");
        setField(term1369, term1369.getClass(), "linkedInUrl", "fhkbdRViHi");
        setField(term1369, term1369.getClass(), "instagramUrl", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Object[] args = new Object[1];
        args[0] = term1369;
        callMethod(klass, "setSocialMedia", argTypes, term1293, args);
    }

};


