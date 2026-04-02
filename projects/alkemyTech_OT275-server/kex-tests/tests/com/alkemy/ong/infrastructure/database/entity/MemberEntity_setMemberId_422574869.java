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

public class MemberEntity_setMemberId_422574869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5176;
     Object term5255;

    public MemberEntity_setMemberId_422574869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5177 = new Long(-8658027316505137504L);
        term5176 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term5251 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5176, term5176.getClass(), "memberId", term5177);
        setField(term5176, term5176.getClass(), "name", "izPpKDErnQ");
        setField(term5176, term5176.getClass(), "facebookUrl", "NnpwZBUTvx");
        setField(term5176, term5176.getClass(), "instagramUrl", "tlQSNgTkQX");
        setField(term5176, term5176.getClass(), "linkedInUrl", "PCipZnmBOF");
        setField(term5176, term5176.getClass(), "imageUrl", "zcorEihhLK");
        setField(term5176, term5176.getClass(), "description", "GrqozDKFOk");
        setIntField(term5251, term5251.getClass(), "nanos", 116000000);
        setLongField(term5251, term5251.getClass(), "fastTime", 1597223167000L);
        setField(term5251, term5251.getClass(), "cdate", null);
        setField(term5176, term5176.getClass(), "createTimestamp", term5251);
        setBooleanField(term5176, term5176.getClass(), "softDeleted", false);
        term5255 = new Long(414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5255;
        callMethod(klass, "setMemberId", argTypes, term5176, args);
    }

};


