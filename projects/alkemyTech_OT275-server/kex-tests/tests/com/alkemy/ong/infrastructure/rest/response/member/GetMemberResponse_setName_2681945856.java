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

public class GetMemberResponse_setName_2681945856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819;

    public GetMemberResponse_setName_2681945856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term820 = new Long(6811161968424632369L);
        term819 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term858 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term819, term819.getClass(), "memberId", term820);
        setField(term819, term819.getClass(), "name", "xrwlQZdwCp");
        setField(term819, term819.getClass(), "imageUrl", "IDCWpPLRkE");
        setField(term819, term819.getClass(), "description", "nyiiPDVjAc");
        setField(term858, term858.getClass(), "facebookUrl", "aKnKipADSo");
        setField(term858, term858.getClass(), "linkedInUrl", "wSQxaModmm");
        setField(term858, term858.getClass(), "instagramUrl", "UlajhuVLaP");
        setField(term819, term819.getClass(), "socialMedia", term858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setName", argTypes, term819, args);
    }

};


