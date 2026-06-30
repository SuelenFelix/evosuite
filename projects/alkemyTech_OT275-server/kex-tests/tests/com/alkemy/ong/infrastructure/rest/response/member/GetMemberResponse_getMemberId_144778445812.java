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

public class GetMemberResponse_getMemberId_144778445812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1631;

    public GetMemberResponse_getMemberId_144778445812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1631 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        setField(term1631, term1631.getClass(), "memberId", null);
        setField(term1631, term1631.getClass(), "name", null);
        setField(term1631, term1631.getClass(), "imageUrl", null);
        setField(term1631, term1631.getClass(), "description", null);
        setField(term1631, term1631.getClass(), "socialMedia", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberId", argTypes, term1631, args);
    }

};


