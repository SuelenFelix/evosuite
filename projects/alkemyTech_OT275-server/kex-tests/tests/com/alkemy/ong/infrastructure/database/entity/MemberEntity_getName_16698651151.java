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

public class MemberEntity_getName_16698651151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4064;

    public MemberEntity_getName_16698651151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4065 = new Long(3825396310311739952L);
        term4064 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4139 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4064, term4064.getClass(), "memberId", term4065);
        setField(term4064, term4064.getClass(), "name", "WzFopsaDuG");
        setField(term4064, term4064.getClass(), "facebookUrl", "PapWxkhEWe");
        setField(term4064, term4064.getClass(), "instagramUrl", "smnHEqRFRx");
        setField(term4064, term4064.getClass(), "linkedInUrl", "XYtryyobou");
        setField(term4064, term4064.getClass(), "imageUrl", "OYbzXylRWW");
        setField(term4064, term4064.getClass(), "description", "DSNsTGYXDF");
        setIntField(term4139, term4139.getClass(), "nanos", 243000000);
        setLongField(term4139, term4139.getClass(), "fastTime", 1393189235000L);
        setField(term4139, term4139.getClass(), "cdate", null);
        setField(term4064, term4064.getClass(), "createTimestamp", term4139);
        setBooleanField(term4064, term4064.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4064, args);
    }

};


