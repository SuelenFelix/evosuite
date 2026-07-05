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

public class MemberEntity_setDescription_58055664015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;

    public MemberEntity_setDescription_58055664015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6123 = new Long(41775768178052008L);
        term6122 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term6197 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6122, term6122.getClass(), "memberId", term6123);
        setField(term6122, term6122.getClass(), "name", "UBRmXJmfrt");
        setField(term6122, term6122.getClass(), "facebookUrl", "WZzvmIHhzZ");
        setField(term6122, term6122.getClass(), "instagramUrl", "doQLHkjpNm");
        setField(term6122, term6122.getClass(), "linkedInUrl", "lCyLIcSuom");
        setField(term6122, term6122.getClass(), "imageUrl", "CGOpQSZZwI");
        setField(term6122, term6122.getClass(), "description", "ypEdrstygY");
        setIntField(term6197, term6197.getClass(), "nanos", 651000000);
        setLongField(term6197, term6197.getClass(), "fastTime", 1663402967000L);
        setField(term6197, term6197.getClass(), "cdate", null);
        setField(term6122, term6122.getClass(), "createTimestamp", term6197);
        setBooleanField(term6122, term6122.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sNQFlATEeQ";
        callMethod(klass, "setDescription", argTypes, term6122, args);
    }

};


