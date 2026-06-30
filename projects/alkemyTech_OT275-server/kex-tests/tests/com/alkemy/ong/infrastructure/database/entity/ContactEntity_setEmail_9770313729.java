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

public class ContactEntity_setEmail_9770313729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8762;

    public ContactEntity_setEmail_9770313729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8763 = new Long(-5216789073301458893L);
        term8762 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8813 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8762, term8762.getClass(), "contactId", term8763);
        setField(term8762, term8762.getClass(), "name", "ITRRYiuDwH");
        setField(term8762, term8762.getClass(), "phone", "llRfwANcVF");
        setField(term8762, term8762.getClass(), "email", "sUEeHQTWkA");
        setField(term8762, term8762.getClass(), "message", "BDIRCxAWLA");
        setIntField(term8813, term8813.getClass(), "year", 2017);
        setShortField(term8813, term8813.getClass(), "month", (short) 7);
        setShortField(term8813, term8813.getClass(), "day", (short) 22);
        setField(term8762, term8762.getClass(), "deletedAt", term8813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eOJfbiZLnb";
        callMethod(klass, "setEmail", argTypes, term8762, args);
    }

};


