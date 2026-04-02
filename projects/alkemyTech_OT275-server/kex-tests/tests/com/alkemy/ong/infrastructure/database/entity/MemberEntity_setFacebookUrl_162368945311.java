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

public class MemberEntity_setFacebookUrl_162368945311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5478;

    public MemberEntity_setFacebookUrl_162368945311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5479 = new Long(305759998609888272L);
        term5478 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term5553 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term5478, term5478.getClass(), "memberId", term5479);
        setField(term5478, term5478.getClass(), "name", "qCpEbQDHdF");
        setField(term5478, term5478.getClass(), "facebookUrl", "AHbZyFOmlo");
        setField(term5478, term5478.getClass(), "instagramUrl", "TwfWVQGiIj");
        setField(term5478, term5478.getClass(), "linkedInUrl", "gUvcueTURF");
        setField(term5478, term5478.getClass(), "imageUrl", "EwQBhZjCIT");
        setField(term5478, term5478.getClass(), "description", "aSkmSwTnEw");
        setIntField(term5553, term5553.getClass(), "nanos", 793000000);
        setLongField(term5553, term5553.getClass(), "fastTime", 1278166775000L);
        setField(term5553, term5553.getClass(), "cdate", null);
        setField(term5478, term5478.getClass(), "createTimestamp", term5553);
        setBooleanField(term5478, term5478.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        callMethod(klass, "setFacebookUrl", argTypes, term5478, args);
    }

};


