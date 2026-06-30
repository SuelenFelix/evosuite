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
import java.lang.Long;
import java.lang.Object;

public class MemberEntity_setCreateTimestamp_169245157916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6283;
     Object term6362;

    public MemberEntity_setCreateTimestamp_169245157916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6284 = new Long(6682528376118987775L);
        term6283 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term6358 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6283, term6283.getClass(), "memberId", term6284);
        setField(term6283, term6283.getClass(), "name", "ZKMLioamsY");
        setField(term6283, term6283.getClass(), "facebookUrl", "WVbxuoDBcn");
        setField(term6283, term6283.getClass(), "instagramUrl", "pvDEABOxLt");
        setField(term6283, term6283.getClass(), "linkedInUrl", "beAMpkroCQ");
        setField(term6283, term6283.getClass(), "imageUrl", "uSUvKAyuvd");
        setField(term6283, term6283.getClass(), "description", "onQLVONGuf");
        setIntField(term6358, term6358.getClass(), "nanos", 294000000);
        setLongField(term6358, term6358.getClass(), "fastTime", 1263733356000L);
        setField(term6358, term6358.getClass(), "cdate", null);
        setField(term6283, term6283.getClass(), "createTimestamp", term6358);
        setBooleanField(term6283, term6283.getClass(), "softDeleted", true);
        term6362 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6362, term6362.getClass(), "nanos", 70000000);
        setLongField(term6362, term6362.getClass(), "fastTime", 1490945490000L);
        setField(term6362, term6362.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term6362;
        callMethod(klass, "setCreateTimestamp", argTypes, term6283, args);
    }

};


