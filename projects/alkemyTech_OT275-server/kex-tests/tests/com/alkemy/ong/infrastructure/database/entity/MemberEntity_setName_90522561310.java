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

public class MemberEntity_setName_90522561310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5317;

    public MemberEntity_setName_90522561310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5318 = new Long(463622836963501975L);
        term5317 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term5392 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5317, term5317.getClass(), "memberId", term5318);
        setField(term5317, term5317.getClass(), "name", "CFyoseFGLF");
        setField(term5317, term5317.getClass(), "facebookUrl", "SFqCrhEWLm");
        setField(term5317, term5317.getClass(), "instagramUrl", "GZdcJyZntS");
        setField(term5317, term5317.getClass(), "linkedInUrl", "OIHoJeysUi");
        setField(term5317, term5317.getClass(), "imageUrl", "WXMWFDGcLB");
        setField(term5317, term5317.getClass(), "description", "wKWbJssZuG");
        setIntField(term5392, term5392.getClass(), "nanos", 937000000);
        setLongField(term5392, term5392.getClass(), "fastTime", 1276494597000L);
        setField(term5392, term5392.getClass(), "cdate", null);
        setField(term5317, term5317.getClass(), "createTimestamp", term5392);
        setBooleanField(term5317, term5317.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NzBMMhkhpT";
        callMethod(klass, "setName", argTypes, term5317, args);
    }

};


