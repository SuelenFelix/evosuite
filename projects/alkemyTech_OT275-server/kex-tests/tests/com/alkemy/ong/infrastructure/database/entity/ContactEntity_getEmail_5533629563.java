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

public class ContactEntity_getEmail_5533629563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8146;

    public ContactEntity_getEmail_5533629563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8147 = new Long(-8463029266761149071L);
        term8146 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8197 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8146, term8146.getClass(), "contactId", term8147);
        setField(term8146, term8146.getClass(), "name", "GPSEWEDSTo");
        setField(term8146, term8146.getClass(), "phone", "RCOqfVsRHt");
        setField(term8146, term8146.getClass(), "email", "TSyCeEZPaT");
        setField(term8146, term8146.getClass(), "message", "JeZFtaqkzW");
        setIntField(term8197, term8197.getClass(), "year", 2020);
        setShortField(term8197, term8197.getClass(), "month", (short) 11);
        setShortField(term8197, term8197.getClass(), "day", (short) 22);
        setField(term8146, term8146.getClass(), "deletedAt", term8197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term8146, args);
    }

};


