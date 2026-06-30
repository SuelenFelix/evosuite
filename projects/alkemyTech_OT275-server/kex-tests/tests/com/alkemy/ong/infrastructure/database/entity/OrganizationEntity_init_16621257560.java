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
import java.lang.Boolean;

public class OrganizationEntity_init_16621257560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9201;
     Object term9323;
     Object term9326;

    public OrganizationEntity_init_16621257560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9201 = new Long(1368340889161782793L);
        term9323 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term9323, term9323.getClass(), "nanos", 539000000);
        setLongField(term9323, term9323.getClass(), "fastTime", 1491170940000L);
        setField(term9323, term9323.getClass(), "cdate", null);
        term9326 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.sql.Timestamp");
        argTypes[12] = boolean.class;
        Object[] args = new Object[13];
        args[0] = term9201;
        args[1] = "KSJeYkkvpk";
        args[2] = "qUtkFGMNUV";
        args[3] = "mGRiYhnMcR";
        args[4] = "NFlvfJCVPO";
        args[5] = "KarbTXFmUU";
        args[6] = "jiUSjqwSIQ";
        args[7] = "MgLCedQfoj";
        args[8] = "zgKiINdgNu";
        args[9] = "zLMTXDQHYH";
        args[10] = "PqywFWJlpE";
        args[11] = term9323;
        args[12] = term9326;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


