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

public class ContactEntity_setContactId_17674813846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8431;
     Object term8486;

    public ContactEntity_setContactId_17674813846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8432 = new Long(2135754395358000892L);
        term8431 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8482 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8431, term8431.getClass(), "contactId", term8432);
        setField(term8431, term8431.getClass(), "name", "qFGKIJjlmV");
        setField(term8431, term8431.getClass(), "phone", "IHqvyhMtuM");
        setField(term8431, term8431.getClass(), "email", "dAldIGYAXV");
        setField(term8431, term8431.getClass(), "message", "mLwibAPEsa");
        setIntField(term8482, term8482.getClass(), "year", 2015);
        setShortField(term8482, term8482.getClass(), "month", (short) 4);
        setShortField(term8482, term8482.getClass(), "day", (short) 14);
        setField(term8431, term8431.getClass(), "deletedAt", term8482);
        term8486 = new Long(-8085190702504231560L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8486;
        callMethod(klass, "setContactId", argTypes, term8431, args);
    }

};


