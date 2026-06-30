package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class MemberEntity_setSoftDeleted_35001917637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6739;
     Object term6741;

    public MemberEntity_setSoftDeleted_35001917637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6739 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        setField(term6739, term6739.getClass(), "memberId", null);
        setField(term6739, term6739.getClass(), "name", null);
        setField(term6739, term6739.getClass(), "facebookUrl", null);
        setField(term6739, term6739.getClass(), "instagramUrl", null);
        setField(term6739, term6739.getClass(), "linkedInUrl", null);
        setField(term6739, term6739.getClass(), "imageUrl", null);
        setField(term6739, term6739.getClass(), "description", null);
        setField(term6739, term6739.getClass(), "createTimestamp", null);
        setBooleanField(term6739, term6739.getClass(), "softDeleted", false);
        term6741 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6741;
        callMethod(klass, "setSoftDeleted", argTypes, term6739, args);
    }

};


