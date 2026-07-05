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
import java.lang.Boolean;

public class MemberEntity_setSoftDeleted_35001917617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6425;
     Object term6504;

    public MemberEntity_setSoftDeleted_35001917617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6426 = new Long(682356318767179819L);
        term6425 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term6500 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6425, term6425.getClass(), "memberId", term6426);
        setField(term6425, term6425.getClass(), "name", "SOrEHbcbmn");
        setField(term6425, term6425.getClass(), "facebookUrl", "bnsyeQXFdu");
        setField(term6425, term6425.getClass(), "instagramUrl", "BwtdjiefJn");
        setField(term6425, term6425.getClass(), "linkedInUrl", "jDmhBrIoDa");
        setField(term6425, term6425.getClass(), "imageUrl", "SPtPatHeOm");
        setField(term6425, term6425.getClass(), "description", "ywmcuThdfL");
        setIntField(term6500, term6500.getClass(), "nanos", 273000000);
        setLongField(term6500, term6500.getClass(), "fastTime", 1285650698000L);
        setField(term6500, term6500.getClass(), "cdate", null);
        setField(term6425, term6425.getClass(), "createTimestamp", term6500);
        setBooleanField(term6425, term6425.getClass(), "softDeleted", true);
        term6504 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6504;
        callMethod(klass, "setSoftDeleted", argTypes, term6425, args);
    }

};


