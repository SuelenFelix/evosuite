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

public class MemberEntity_setCreateTimestamp_169245157936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6737;

    public MemberEntity_setCreateTimestamp_169245157936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6737 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        setField(term6737, term6737.getClass(), "memberId", null);
        setField(term6737, term6737.getClass(), "name", null);
        setField(term6737, term6737.getClass(), "facebookUrl", null);
        setField(term6737, term6737.getClass(), "instagramUrl", null);
        setField(term6737, term6737.getClass(), "linkedInUrl", null);
        setField(term6737, term6737.getClass(), "imageUrl", null);
        setField(term6737, term6737.getClass(), "description", null);
        setField(term6737, term6737.getClass(), "createTimestamp", null);
        setBooleanField(term6737, term6737.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreateTimestamp", argTypes, term6737, args);
    }

};


