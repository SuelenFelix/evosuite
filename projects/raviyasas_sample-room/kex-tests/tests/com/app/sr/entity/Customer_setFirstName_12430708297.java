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

public class Customer_setFirstName_12430708297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;

    public Customer_setFirstName_12430708297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term550 = new Long(6811161968424632369L);
        term549 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term549, term549.getClass(), "id", term550);
        setField(term549, term549.getClass(), "firstName", "BYqFIqCKAV");
        setField(term549, term549.getClass(), "lastName", "vrQLuWIDJX");
        setField(term549, term549.getClass(), "email", "flxyYxBRtu");
        setField(term549, term549.getClass(), "contactNumber", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setFirstName", argTypes, term549, args);
    }

};


