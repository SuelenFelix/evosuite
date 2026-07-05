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

public class GetMemberResponse_getName_14516819831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public GetMemberResponse_getName_14516819831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138 = new Long(6375119433582206027L);
        term137 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term176 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term137, term137.getClass(), "memberId", term138);
        setField(term137, term137.getClass(), "name", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "imageUrl", "MjGYSRKTNF");
        setField(term137, term137.getClass(), "description", "hRNSzYYIrc");
        setField(term176, term176.getClass(), "facebookUrl", "RMFIsYGgne");
        setField(term176, term176.getClass(), "linkedInUrl", "NRdvgJlhkX");
        setField(term176, term176.getClass(), "instagramUrl", "uuaPigETmJ");
        setField(term137, term137.getClass(), "socialMedia", term176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term137, args);
    }

};


