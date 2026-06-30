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

public class ContactEntity_getContactId_17344016300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7861;

    public ContactEntity_getContactId_17344016300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7862 = new Long(6689117472719450333L);
        term7861 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term7912 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7861, term7861.getClass(), "contactId", term7862);
        setField(term7861, term7861.getClass(), "name", "YAXkVjQZcV");
        setField(term7861, term7861.getClass(), "phone", "pumvwBWvpy");
        setField(term7861, term7861.getClass(), "email", "HwLHeGLyhe");
        setField(term7861, term7861.getClass(), "message", "RDnkgWkcbz");
        setIntField(term7912, term7912.getClass(), "year", 2012);
        setShortField(term7912, term7912.getClass(), "month", (short) 8);
        setShortField(term7912, term7912.getClass(), "day", (short) 25);
        setField(term7861, term7861.getClass(), "deletedAt", term7912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContactId", argTypes, term7861, args);
    }

};


