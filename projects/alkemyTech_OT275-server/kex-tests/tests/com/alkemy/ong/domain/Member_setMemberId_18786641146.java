package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Member_setMemberId_18786641146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14302;
     Object term14378;

    public Member_setMemberId_18786641146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14303 = new Long(2287449183416662404L);
        term14302 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14317 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14302, term14302.getClass(), "memberId", term14303);
        setField(term14302, term14302.getClass(), "name", "JDTrhGRsDT");
        setField(term14317, term14317.getClass(), "facebookUrl", "vHxsVQImjS");
        setField(term14317, term14317.getClass(), "linkedInUrl", "jkVaRrZHQX");
        setField(term14317, term14317.getClass(), "instagramUrl", "gSFFUuJipG");
        setField(term14302, term14302.getClass(), "socialMedia", term14317);
        setField(term14302, term14302.getClass(), "imageUrl", "bQWfIFvxkQ");
        setField(term14302, term14302.getClass(), "description", "aDoBLXfFQI");
        term14378 = new Long(-1223573843683081410L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term14378;
        callMethod(klass, "setMemberId", argTypes, term14302, args);
    }

};


