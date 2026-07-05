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

public class GetMemberResponse_getImageUrl_4502869862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public GetMemberResponse_getImageUrl_4502869862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274 = new Long(-8257434502486459194L);
        term273 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term312 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term273, term273.getClass(), "memberId", term274);
        setField(term273, term273.getClass(), "name", "MxlszYVzRf");
        setField(term273, term273.getClass(), "imageUrl", "LQFpaHEwXR");
        setField(term273, term273.getClass(), "description", "oVcInYnLWB");
        setField(term312, term312.getClass(), "facebookUrl", "aJlieCFVtF");
        setField(term312, term312.getClass(), "linkedInUrl", "ZiaGIbnzTs");
        setField(term312, term312.getClass(), "instagramUrl", "tbcdzjIfER");
        setField(term273, term273.getClass(), "socialMedia", term312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term273, args);
    }

};


