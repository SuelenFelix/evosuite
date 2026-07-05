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

public class ContactEntity_getPhone_4891687102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8051;

    public ContactEntity_getPhone_4891687102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8052 = new Long(-2177368829816872572L);
        term8051 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8102 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8051, term8051.getClass(), "contactId", term8052);
        setField(term8051, term8051.getClass(), "name", "jnwVnmKAFv");
        setField(term8051, term8051.getClass(), "phone", "TXyHhqeCjR");
        setField(term8051, term8051.getClass(), "email", "lZIgPZPgTu");
        setField(term8051, term8051.getClass(), "message", "iuCxnHGMoW");
        setIntField(term8102, term8102.getClass(), "year", 2021);
        setShortField(term8102, term8102.getClass(), "month", (short) 1);
        setShortField(term8102, term8102.getClass(), "day", (short) 18);
        setField(term8051, term8051.getClass(), "deletedAt", term8102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term8051, args);
    }

};


