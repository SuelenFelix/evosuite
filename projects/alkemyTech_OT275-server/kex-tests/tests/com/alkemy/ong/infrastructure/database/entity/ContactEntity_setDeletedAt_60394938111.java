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

public class ContactEntity_setDeletedAt_60394938111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8996;
     Object term9051;

    public ContactEntity_setDeletedAt_60394938111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8997 = new Long(-8033714905181142681L);
        term8996 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term9047 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8996, term8996.getClass(), "contactId", term8997);
        setField(term8996, term8996.getClass(), "name", "FbSIUZyBXZ");
        setField(term8996, term8996.getClass(), "phone", "mhQDwIyrRi");
        setField(term8996, term8996.getClass(), "email", "HpZXWDPhlg");
        setField(term8996, term8996.getClass(), "message", "lBOokzEPfe");
        setIntField(term9047, term9047.getClass(), "year", 2020);
        setShortField(term9047, term9047.getClass(), "month", (short) 5);
        setShortField(term9047, term9047.getClass(), "day", (short) 14);
        setField(term8996, term8996.getClass(), "deletedAt", term9047);
        term9051 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term9051, term9051.getClass(), "year", 2025);
        setShortField(term9051, term9051.getClass(), "month", (short) 4);
        setShortField(term9051, term9051.getClass(), "day", (short) 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term9051;
        callMethod(klass, "setDeletedAt", argTypes, term8996, args);
    }

};


