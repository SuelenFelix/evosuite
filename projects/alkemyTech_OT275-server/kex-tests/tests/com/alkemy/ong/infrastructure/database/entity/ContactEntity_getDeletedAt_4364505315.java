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

public class ContactEntity_getDeletedAt_4364505315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8336;

    public ContactEntity_getDeletedAt_4364505315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8337 = new Long(7247160664318067468L);
        term8336 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8387 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8336, term8336.getClass(), "contactId", term8337);
        setField(term8336, term8336.getClass(), "name", "VDokbsCuqq");
        setField(term8336, term8336.getClass(), "phone", "xClUIcPECX");
        setField(term8336, term8336.getClass(), "email", "avhRaGZaBF");
        setField(term8336, term8336.getClass(), "message", "JkgoRtImdE");
        setIntField(term8387, term8387.getClass(), "year", 2018);
        setShortField(term8387, term8387.getClass(), "month", (short) 1);
        setShortField(term8387, term8387.getClass(), "day", (short) 13);
        setField(term8336, term8336.getClass(), "deletedAt", term8387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeletedAt", argTypes, term8336, args);
    }

};


