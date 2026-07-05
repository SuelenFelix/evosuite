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

public class ContactEntity_setMessage_208166025510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8879;

    public ContactEntity_setMessage_208166025510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8880 = new Long(-1832940336320585644L);
        term8879 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8930 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8879, term8879.getClass(), "contactId", term8880);
        setField(term8879, term8879.getClass(), "name", "nKZKnxWYCK");
        setField(term8879, term8879.getClass(), "phone", "JOqQxuzRuZ");
        setField(term8879, term8879.getClass(), "email", "RSaoipUlsg");
        setField(term8879, term8879.getClass(), "message", "cSHGbqKqlN");
        setIntField(term8930, term8930.getClass(), "year", 2026);
        setShortField(term8930, term8930.getClass(), "month", (short) 12);
        setShortField(term8930, term8930.getClass(), "day", (short) 13);
        setField(term8879, term8879.getClass(), "deletedAt", term8930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pFAfANnxup";
        callMethod(klass, "setMessage", argTypes, term8879, args);
    }

};


