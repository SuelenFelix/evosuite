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

public class Member_getDescription_13589008045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14166;

    public Member_getDescription_13589008045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14167 = new Long(-1449569009562240465L);
        term14166 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14181 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14166, term14166.getClass(), "memberId", term14167);
        setField(term14166, term14166.getClass(), "name", "anncJTnzrg");
        setField(term14181, term14181.getClass(), "facebookUrl", "GMylOocLnB");
        setField(term14181, term14181.getClass(), "linkedInUrl", "spOehuHwSl");
        setField(term14181, term14181.getClass(), "instagramUrl", "cyobgydTWP");
        setField(term14166, term14166.getClass(), "socialMedia", term14181);
        setField(term14166, term14166.getClass(), "imageUrl", "moHYQFfLnp");
        setField(term14166, term14166.getClass(), "description", "BrPqlvIbEQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term14166, args);
    }

};


