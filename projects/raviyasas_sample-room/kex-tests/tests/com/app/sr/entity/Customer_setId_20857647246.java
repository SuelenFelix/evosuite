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

public class Customer_setId_20857647246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;
     Object term507;

    public Customer_setId_20857647246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term457 = new Long(7411271909051562686L);
        term456 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term456, term456.getClass(), "id", term457);
        setField(term456, term456.getClass(), "firstName", "hNxWaHcfhY");
        setField(term456, term456.getClass(), "lastName", "RkybSrpybU");
        setField(term456, term456.getClass(), "email", "xOEqzGAmDU");
        setField(term456, term456.getClass(), "contactNumber", "eZFUvlxvGV");
        term507 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term507;
        callMethod(klass, "setId", argTypes, term456, args);
    }

};


