package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PersonEntity_setPersonId_16687608995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term131;

    public PersonEntity_setPersonId_16687608995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114 = new Long(5270370404989704783L);
        term113 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term129 = newInstance(Class.forName("java.util.Date"));
        setField(term113, term113.getClass(), "personId", term114);
        setField(term113, term113.getClass(), "personName", "jJCZpVmanW");
        setDoubleField(term113, term113.getClass(), "personPrice", 0.28570734989730284);
        setLongField(term129, term129.getClass(), "fastTime", 1442639565302L);
        setField(term129, term129.getClass(), "cdate", null);
        setField(term113, term113.getClass(), "date", term129);
        term131 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term131;
        callMethod(klass, "setPersonId", argTypes, term113, args);
    }

};


