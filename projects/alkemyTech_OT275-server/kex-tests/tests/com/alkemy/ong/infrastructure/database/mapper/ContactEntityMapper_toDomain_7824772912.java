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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class ContactEntityMapper_toDomain_7824772912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term98;

    public ContactEntityMapper_toDomain_7824772912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.ContactEntityMapper"));
        Long term102 = new Long(6375119433582206027L);
        Object term101 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term152 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term101, term101.getClass(), "contactId", term102);
        setField(term101, term101.getClass(), "name", "jJCZpVmanW");
        setField(term101, term101.getClass(), "phone", "EGtDIRbSSb");
        setField(term101, term101.getClass(), "email", "SzjVpOQTyS");
        setField(term101, term101.getClass(), "message", "MjGYSRKTNF");
        setIntField(term152, term152.getClass(), "year", 2016);
        setShortField(term152, term152.getClass(), "month", (short) 11);
        setShortField(term152, term152.getClass(), "day", (short) 29);
        setField(term101, term101.getClass(), "deletedAt", term152);
        Long term158 = new Long(-8257434502486459194L);
        Object term157 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term164 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term157, term157.getClass(), "contactId", term158);
        setField(term157, term157.getClass(), "name", "");
        setField(term157, term157.getClass(), "phone", "");
        setField(term157, term157.getClass(), "email", "");
        setField(term157, term157.getClass(), "message", "");
        setIntField(term164, term164.getClass(), "year", 2021);
        setShortField(term164, term164.getClass(), "month", (short) 1);
        setShortField(term164, term164.getClass(), "day", (short) 18);
        setField(term157, term157.getClass(), "deletedAt", term164);
        Long term170 = new Long(-8400487765614892086L);
        Object term169 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        setField(term169, term169.getClass(), "contactId", term170);
        setField(term169, term169.getClass(), "name", null);
        setField(term169, term169.getClass(), "phone", null);
        setField(term169, term169.getClass(), "email", null);
        setField(term169, term169.getClass(), "message", null);
        setField(term169, term169.getClass(), "deletedAt", null);
        term98 = new LinkedList();
        ((LinkedList) term98).add(term101);
        ((LinkedList) term98).add(term157);
        ((LinkedList) term98).add(term169);
        ((LinkedList) term98).add((Object)null);
        ((LinkedList) term98).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.ContactEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term98;
        callMethod(klass, "toDomain", argTypes, term97, args);
    }

};


