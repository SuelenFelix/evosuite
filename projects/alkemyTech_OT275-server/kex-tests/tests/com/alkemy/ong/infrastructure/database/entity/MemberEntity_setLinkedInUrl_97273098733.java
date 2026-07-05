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

public class MemberEntity_setLinkedInUrl_97273098733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6731;

    public MemberEntity_setLinkedInUrl_97273098733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6731 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        setField(term6731, term6731.getClass(), "memberId", null);
        setField(term6731, term6731.getClass(), "name", null);
        setField(term6731, term6731.getClass(), "facebookUrl", null);
        setField(term6731, term6731.getClass(), "instagramUrl", null);
        setField(term6731, term6731.getClass(), "linkedInUrl", null);
        setField(term6731, term6731.getClass(), "imageUrl", null);
        setField(term6731, term6731.getClass(), "description", null);
        setField(term6731, term6731.getClass(), "createTimestamp", null);
        setBooleanField(term6731, term6731.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLinkedInUrl", argTypes, term6731, args);
    }

};


