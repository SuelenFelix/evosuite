package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class OrganizationMapper_toDomain_2717376970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765;
     Object term766;

    public OrganizationMapper_toDomain_2717376970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.OrganizationMapper"));
        Long term767 = new Long(5127676408959197577L);
        term766 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term889 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term766, term766.getClass(), "organizationId", term767);
        setField(term766, term766.getClass(), "name", "UoYtihxVaS");
        setField(term766, term766.getClass(), "imageUrl", "JDswTTCZHV");
        setField(term766, term766.getClass(), "address", "onpbIeEKoi");
        setField(term766, term766.getClass(), "phone", "YRHGsAkhxb");
        setField(term766, term766.getClass(), "email", "ffYhPOzlUs");
        setField(term766, term766.getClass(), "facebookUrl", "MLqYREekMl");
        setField(term766, term766.getClass(), "linkedInUrl", "ytSBIKXogI");
        setField(term766, term766.getClass(), "instagramUrl", "nHXjMycHlU");
        setField(term766, term766.getClass(), "welcomeText", "ieCtQFdkii");
        setField(term766, term766.getClass(), "aboutUsText", "dEnhdmILtU");
        setIntField(term889, term889.getClass(), "nanos", 369000000);
        setLongField(term889, term889.getClass(), "fastTime", 1480427551000L);
        setField(term889, term889.getClass(), "cdate", null);
        setField(term766, term766.getClass(), "createTimestamp", term889);
        setBooleanField(term766, term766.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.OrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Object[] args = new Object[1];
        args[0] = term766;
        callMethod(klass, "toDomain", argTypes, term765, args);
    }

};


