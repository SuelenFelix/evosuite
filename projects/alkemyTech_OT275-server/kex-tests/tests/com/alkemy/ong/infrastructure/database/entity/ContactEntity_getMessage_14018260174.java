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

public class ContactEntity_getMessage_14018260174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8241;

    public ContactEntity_getMessage_14018260174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8242 = new Long(3133860696238261492L);
        term8241 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        Object term8292 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term8241, term8241.getClass(), "contactId", term8242);
        setField(term8241, term8241.getClass(), "name", "vOVuNSCCLe");
        setField(term8241, term8241.getClass(), "phone", "fzeqPnzpnt");
        setField(term8241, term8241.getClass(), "email", "RxbhrFBjkO");
        setField(term8241, term8241.getClass(), "message", "aanyiAOJCl");
        setIntField(term8292, term8292.getClass(), "year", 2015);
        setShortField(term8292, term8292.getClass(), "month", (short) 9);
        setShortField(term8292, term8292.getClass(), "day", (short) 19);
        setField(term8241, term8241.getClass(), "deletedAt", term8292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term8241, args);
    }

};


