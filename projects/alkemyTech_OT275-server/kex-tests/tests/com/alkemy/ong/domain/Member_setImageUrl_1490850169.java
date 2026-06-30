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

public class Member_setImageUrl_1490850169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14801;

    public Member_setImageUrl_1490850169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14802 = new Long(661905373566913125L);
        term14801 = newInstance(Class.forName("com.alkemy.ong.domain.Member"));
        Object term14816 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term14801, term14801.getClass(), "memberId", term14802);
        setField(term14801, term14801.getClass(), "name", "NpjPDfnDRd");
        setField(term14816, term14816.getClass(), "facebookUrl", "SWMYovqYdk");
        setField(term14816, term14816.getClass(), "linkedInUrl", "TQuvAoQcBe");
        setField(term14816, term14816.getClass(), "instagramUrl", "nGYLfZrtWO");
        setField(term14801, term14801.getClass(), "socialMedia", term14816);
        setField(term14801, term14801.getClass(), "imageUrl", "DBufEhhBCQ");
        setField(term14801, term14801.getClass(), "description", "GiNZRBZjgO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ceGAKcClsG";
        callMethod(klass, "setImageUrl", argTypes, term14801, args);
    }

};


