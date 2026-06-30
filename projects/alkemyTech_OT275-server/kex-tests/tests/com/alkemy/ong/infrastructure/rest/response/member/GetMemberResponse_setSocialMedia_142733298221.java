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

public class GetMemberResponse_setSocialMedia_142733298221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640;

    public GetMemberResponse_setSocialMedia_142733298221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1640 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        setField(term1640, term1640.getClass(), "memberId", null);
        setField(term1640, term1640.getClass(), "name", null);
        setField(term1640, term1640.getClass(), "imageUrl", null);
        setField(term1640, term1640.getClass(), "description", null);
        setField(term1640, term1640.getClass(), "socialMedia", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSocialMedia", argTypes, term1640, args);
    }

};


