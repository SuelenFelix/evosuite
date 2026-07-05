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

public class MemberEntity_isSoftDeleted_46904130628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6721;

    public MemberEntity_isSoftDeleted_46904130628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6721 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        setField(term6721, term6721.getClass(), "memberId", null);
        setField(term6721, term6721.getClass(), "name", null);
        setField(term6721, term6721.getClass(), "facebookUrl", null);
        setField(term6721, term6721.getClass(), "instagramUrl", null);
        setField(term6721, term6721.getClass(), "linkedInUrl", null);
        setField(term6721, term6721.getClass(), "imageUrl", null);
        setField(term6721, term6721.getClass(), "description", null);
        setField(term6721, term6721.getClass(), "createTimestamp", null);
        setBooleanField(term6721, term6721.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term6721, args);
    }

};


