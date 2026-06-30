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

public class MemberEntity_setLinkedInUrl_97273098713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5800;

    public MemberEntity_setLinkedInUrl_97273098713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5801 = new Long(-5248475803419977214L);
        term5800 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term5875 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5800, term5800.getClass(), "memberId", term5801);
        setField(term5800, term5800.getClass(), "name", "pJbnHTYrxn");
        setField(term5800, term5800.getClass(), "facebookUrl", "iIRsCSYqXH");
        setField(term5800, term5800.getClass(), "instagramUrl", "nghfqDXyCG");
        setField(term5800, term5800.getClass(), "linkedInUrl", "WBAOTqErtm");
        setField(term5800, term5800.getClass(), "imageUrl", "PqtVXXZMqK");
        setField(term5800, term5800.getClass(), "description", "rYbtIDVdnd");
        setIntField(term5875, term5875.getClass(), "nanos", 295000000);
        setLongField(term5875, term5875.getClass(), "fastTime", 1597341597000L);
        setField(term5875, term5875.getClass(), "cdate", null);
        setField(term5800, term5800.getClass(), "createTimestamp", term5875);
        setBooleanField(term5800, term5800.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setLinkedInUrl", argTypes, term5800, args);
    }

};


