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

public class OrganizationEntity_setLinkedInUrl_74099645222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14102;

    public OrganizationEntity_setLinkedInUrl_74099645222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14103 = new Long(8313800941204938919L);
        term14102 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term14225 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term14102, term14102.getClass(), "organizationId", term14103);
        setField(term14102, term14102.getClass(), "name", "HJwNgUzZZR");
        setField(term14102, term14102.getClass(), "imageUrl", "FvUCZgTXhq");
        setField(term14102, term14102.getClass(), "address", "wWWidPCHzx");
        setField(term14102, term14102.getClass(), "phone", "OwPIiBRuKK");
        setField(term14102, term14102.getClass(), "email", "sgfGySMODT");
        setField(term14102, term14102.getClass(), "facebookUrl", "ndAITnOsny");
        setField(term14102, term14102.getClass(), "linkedInUrl", "CVZnTiJucs");
        setField(term14102, term14102.getClass(), "instagramUrl", "ecHEQufXoq");
        setField(term14102, term14102.getClass(), "welcomeText", "btBLMvHzJg");
        setField(term14102, term14102.getClass(), "aboutUsText", "JdOMfNWgLP");
        setIntField(term14225, term14225.getClass(), "nanos", 492000000);
        setLongField(term14225, term14225.getClass(), "fastTime", 1870018035000L);
        setField(term14225, term14225.getClass(), "cdate", null);
        setField(term14102, term14102.getClass(), "createTimestamp", term14225);
        setBooleanField(term14102, term14102.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWqXrwAsDU";
        callMethod(klass, "setLinkedInUrl", argTypes, term14102, args);
    }

};


