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

public class ContactEntity_setPhone_655002948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8645;

    public ContactEntity_setPhone_655002948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8646 = new Long(4949335493504695457L);
        term8645 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8696 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8645, term8645.getClass(), "contactId", term8646);
        setField(term8645, term8645.getClass(), "name", "PvmBHIXaMY");
        setField(term8645, term8645.getClass(), "phone", "hulYxtowxw");
        setField(term8645, term8645.getClass(), "email", "GNEmuHPNcU");
        setField(term8645, term8645.getClass(), "message", "IoSfuKDFRe");
        setIntField(term8696, term8696.getClass(), "year", 2022);
        setShortField(term8696, term8696.getClass(), "month", (short) 2);
        setShortField(term8696, term8696.getClass(), "day", (short) 25);
        setField(term8645, term8645.getClass(), "deletedAt", term8696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWYyZiNfsm";
        callMethod(klass, "setPhone", argTypes, term8645, args);
    }

};


