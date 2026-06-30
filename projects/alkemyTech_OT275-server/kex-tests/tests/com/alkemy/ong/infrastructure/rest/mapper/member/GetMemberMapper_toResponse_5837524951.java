package com.alkemy.ong.infrastructure.rest.mapper.member;

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
import static com.alkemy.ong.infrastructure.rest.mapper.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class GetMemberMapper_toResponse_5837524951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;
     Object term277;

    public GetMemberMapper_toResponse_5837524951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper"));
        Object term276 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term275, term275.getClass(), "socialMediaMapper", term276);
        Long term278 = new Long(7411271909051562686L);
        term277 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term292 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term277, term277.getClass(), "memberId", term278);
        setField(term277, term277.getClass(), "name", "xrwlQZdwCp");
        setField(term292, term292.getClass(), "facebookUrl", "IDCWpPLRkE");
        setField(term292, term292.getClass(), "linkedInUrl", "nyiiPDVjAc");
        setField(term292, term292.getClass(), "instagramUrl", "aKnKipADSo");
        setField(term277, term277.getClass(), "socialMedia", term292);
        setField(term277, term277.getClass(), "imageUrl", "wSQxaModmm");
        setField(term277, term277.getClass(), "description", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Member");
        Object[] args = new Object[1];
        args[0] = term277;
        callMethod(klass, "toResponse", argTypes, term275, args);
    }

};


