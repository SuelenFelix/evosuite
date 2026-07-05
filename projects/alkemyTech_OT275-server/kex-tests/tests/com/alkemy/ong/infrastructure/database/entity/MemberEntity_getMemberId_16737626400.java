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

public class MemberEntity_getMemberId_16737626400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3925;

    public MemberEntity_getMemberId_16737626400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3926 = new Long(-7738503207562305297L);
        term3925 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4000 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3925, term3925.getClass(), "memberId", term3926);
        setField(term3925, term3925.getClass(), "name", "HWkpTmtlrc");
        setField(term3925, term3925.getClass(), "facebookUrl", "hMmaoREuCK");
        setField(term3925, term3925.getClass(), "instagramUrl", "VeDtgDzGAN");
        setField(term3925, term3925.getClass(), "linkedInUrl", "aWYOWZFyaX");
        setField(term3925, term3925.getClass(), "imageUrl", "BRIVNtfUWU");
        setField(term3925, term3925.getClass(), "description", "DbiCVtPPCT");
        setIntField(term4000, term4000.getClass(), "nanos", 832000000);
        setLongField(term4000, term4000.getClass(), "fastTime", 1628684516000L);
        setField(term4000, term4000.getClass(), "cdate", null);
        setField(term3925, term3925.getClass(), "createTimestamp", term4000);
        setBooleanField(term3925, term3925.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberId", argTypes, term3925, args);
    }

};


