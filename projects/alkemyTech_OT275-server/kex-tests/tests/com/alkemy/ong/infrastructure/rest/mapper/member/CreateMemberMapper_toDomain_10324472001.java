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

public class CreateMemberMapper_toDomain_10324472001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term4;

    public CreateMemberMapper_toDomain_10324472001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.CreateMemberMapper"));
        Object term3 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term2, term2.getClass(), "socialMediaMapper", term3);
        term4 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term41 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "image", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "description", "MuLcgQHgqz");
        setField(term41, term41.getClass(), "facebookUrl", "xxtlPwDYFs");
        setField(term41, term41.getClass(), "linkedInUrl", "jJCZpVmanW");
        setField(term41, term41.getClass(), "instagramUrl", "EGtDIRbSSb");
        setField(term4, term4.getClass(), "socialMedia", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.CreateMemberMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "toDomain", argTypes, term2, args);
    }

};


