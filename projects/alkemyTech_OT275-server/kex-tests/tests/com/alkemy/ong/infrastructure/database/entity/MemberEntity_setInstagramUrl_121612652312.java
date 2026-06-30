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

public class MemberEntity_setInstagramUrl_121612652312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5639;

    public MemberEntity_setInstagramUrl_121612652312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5640 = new Long(-8654565919063661957L);
        term5639 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term5714 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5639, term5639.getClass(), "memberId", term5640);
        setField(term5639, term5639.getClass(), "name", "HBGNxdNURv");
        setField(term5639, term5639.getClass(), "facebookUrl", "mfCpTPPQQm");
        setField(term5639, term5639.getClass(), "instagramUrl", "OcJCIDNIXA");
        setField(term5639, term5639.getClass(), "linkedInUrl", "XfRABIFVEp");
        setField(term5639, term5639.getClass(), "imageUrl", "MHGKyEnwKc");
        setField(term5639, term5639.getClass(), "description", "ShIELyuULw");
        setIntField(term5714, term5714.getClass(), "nanos", 768000000);
        setLongField(term5714, term5714.getClass(), "fastTime", 1272765521000L);
        setField(term5714, term5714.getClass(), "cdate", null);
        setField(term5639, term5639.getClass(), "createTimestamp", term5714);
        setBooleanField(term5639, term5639.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpQuOGMgmj";
        callMethod(klass, "setInstagramUrl", argTypes, term5639, args);
    }

};


