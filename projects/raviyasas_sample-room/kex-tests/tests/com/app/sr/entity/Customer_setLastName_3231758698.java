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

public class Customer_setLastName_3231758698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;

    public Customer_setLastName_3231758698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term663 = new Long(-7237588299778557629L);
        term662 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term662, term662.getClass(), "id", term663);
        setField(term662, term662.getClass(), "firstName", "TEParAifyi");
        setField(term662, term662.getClass(), "lastName", "OWDIEULEFu");
        setField(term662, term662.getClass(), "email", "dWRymuLBtr");
        setField(term662, term662.getClass(), "contactNumber", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "setLastName", argTypes, term662, args);
    }

};


