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

public class ContactEntity_setName_18841159297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8528;

    public ContactEntity_setName_18841159297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8529 = new Long(1672578078364590450L);
        term8528 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8579 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8528, term8528.getClass(), "contactId", term8529);
        setField(term8528, term8528.getClass(), "name", "zsWKWiTFuo");
        setField(term8528, term8528.getClass(), "phone", "UPUbwyHQKN");
        setField(term8528, term8528.getClass(), "email", "lgQkrXANyI");
        setField(term8528, term8528.getClass(), "message", "MeTmRZXErV");
        setIntField(term8579, term8579.getClass(), "year", 2017);
        setShortField(term8579, term8579.getClass(), "month", (short) 5);
        setShortField(term8579, term8579.getClass(), "day", (short) 21);
        setField(term8528, term8528.getClass(), "deletedAt", term8579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jNxbVmoZgq";
        callMethod(klass, "setName", argTypes, term8528, args);
    }

};


