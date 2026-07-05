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

public class ActivityEntity_init_204619544913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7760;
     Object term7798;
     Object term7801;

    public ActivityEntity_init_204619544913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7760 = new Long(846579494941632714L);
        term7798 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term7798, term7798.getClass(), "nanos", 982000000);
        setLongField(term7798, term7798.getClass(), "fastTime", 1291269567000L);
        setField(term7798, term7798.getClass(), "cdate", null);
        term7801 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.sql.Timestamp");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term7760;
        args[1] = "nRvKihUSPj";
        args[2] = "BbNeQJpYPr";
        args[3] = "riMtzCoxNj";
        args[4] = term7798;
        args[5] = term7801;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


