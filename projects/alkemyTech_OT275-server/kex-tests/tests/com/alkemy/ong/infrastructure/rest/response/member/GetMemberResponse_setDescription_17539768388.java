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

public class GetMemberResponse_setDescription_17539768388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135;

    public GetMemberResponse_setDescription_17539768388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1136 = new Long(6967924379644551255L);
        term1135 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse"));
        Object term1174 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1135, term1135.getClass(), "memberId", term1136);
        setField(term1135, term1135.getClass(), "name", "nGKItKLYNC");
        setField(term1135, term1135.getClass(), "imageUrl", "UiUYnPrcCi");
        setField(term1135, term1135.getClass(), "description", "UoYtihxVaS");
        setField(term1174, term1174.getClass(), "facebookUrl", "JDswTTCZHV");
        setField(term1174, term1174.getClass(), "linkedInUrl", "onpbIeEKoi");
        setField(term1174, term1174.getClass(), "instagramUrl", "YRHGsAkhxb");
        setField(term1135, term1135.getClass(), "socialMedia", term1174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.member.GetMemberResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setDescription", argTypes, term1135, args);
    }

};


