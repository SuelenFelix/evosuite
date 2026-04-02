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

public class MemberEntity_getName_166986511521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6707;

    public MemberEntity_getName_166986511521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6707 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        setField(term6707, term6707.getClass(), "memberId", null);
        setField(term6707, term6707.getClass(), "name", null);
        setField(term6707, term6707.getClass(), "facebookUrl", null);
        setField(term6707, term6707.getClass(), "instagramUrl", null);
        setField(term6707, term6707.getClass(), "linkedInUrl", null);
        setField(term6707, term6707.getClass(), "imageUrl", null);
        setField(term6707, term6707.getClass(), "description", null);
        setField(term6707, term6707.getClass(), "createTimestamp", null);
        setBooleanField(term6707, term6707.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6707, args);
    }

};


