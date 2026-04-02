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

public class MemberEntity_isSoftDeleted_4690413068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5037;

    public MemberEntity_isSoftDeleted_4690413068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5038 = new Long(2062173786000223358L);
        term5037 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term5112 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5037, term5037.getClass(), "memberId", term5038);
        setField(term5037, term5037.getClass(), "name", "tlzpzIjMib");
        setField(term5037, term5037.getClass(), "facebookUrl", "AZdLeSugwv");
        setField(term5037, term5037.getClass(), "instagramUrl", "RMsXuyzKJV");
        setField(term5037, term5037.getClass(), "linkedInUrl", "FwPbDZcHmB");
        setField(term5037, term5037.getClass(), "imageUrl", "hOncybyCAH");
        setField(term5037, term5037.getClass(), "description", "QduALnDSVo");
        setIntField(term5112, term5112.getClass(), "nanos", 432000000);
        setLongField(term5112, term5112.getClass(), "fastTime", 1332860905000L);
        setField(term5112, term5112.getClass(), "cdate", null);
        setField(term5037, term5037.getClass(), "createTimestamp", term5112);
        setBooleanField(term5037, term5037.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term5037, args);
    }

};


