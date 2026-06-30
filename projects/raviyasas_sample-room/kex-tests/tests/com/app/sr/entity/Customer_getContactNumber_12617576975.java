package com.app.sr.entity;

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
import static com.app.sr.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Customer_getContactNumber_12617576975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;

    public Customer_getContactNumber_12617576975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term366 = new Long(5270370404989704783L);
        term365 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term365, term365.getClass(), "id", term366);
        setField(term365, term365.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term365, term365.getClass(), "lastName", "tbcdzjIfER");
        setField(term365, term365.getClass(), "email", "HyxfbSQYBe");
        setField(term365, term365.getClass(), "contactNumber", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContactNumber", argTypes, term365, args);
    }

};


