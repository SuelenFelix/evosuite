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

public class MemberEntity_getFacebookUrl_15206386372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4203;

    public MemberEntity_getFacebookUrl_15206386372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4204 = new Long(-3838084482494604218L);
        term4203 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4278 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4203, term4203.getClass(), "memberId", term4204);
        setField(term4203, term4203.getClass(), "name", "sQvGcVjdEx");
        setField(term4203, term4203.getClass(), "facebookUrl", "rLHAoqXgPh");
        setField(term4203, term4203.getClass(), "instagramUrl", "zUlRdimJtU");
        setField(term4203, term4203.getClass(), "linkedInUrl", "vwbEQQNQrx");
        setField(term4203, term4203.getClass(), "imageUrl", "xtftXXMbem");
        setField(term4203, term4203.getClass(), "description", "cudZvLMQon");
        setIntField(term4278, term4278.getClass(), "nanos", 299000000);
        setLongField(term4278, term4278.getClass(), "fastTime", 1762136641000L);
        setField(term4278, term4278.getClass(), "cdate", null);
        setField(term4203, term4203.getClass(), "createTimestamp", term4278);
        setBooleanField(term4203, term4203.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacebookUrl", argTypes, term4203, args);
    }

};


