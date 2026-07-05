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
import java.lang.Long;
import java.lang.Object;

public class ContactEntityMapper_toDomain_2478982711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public ContactEntityMapper_toDomain_2478982711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.ContactEntityMapper"));
        Long term3 = new Long(2442117782898005296L);
        term2 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2, term2.getClass(), "contactId", term3);
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "phone", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "email", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "message", "xxtlPwDYFs");
        setIntField(term53, term53.getClass(), "year", 2012);
        setShortField(term53, term53.getClass(), "month", (short) 8);
        setShortField(term53, term53.getClass(), "day", (short) 25);
        setField(term2, term2.getClass(), "deletedAt", term53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.ContactEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "toDomain", argTypes, term1, args);
    }

};


