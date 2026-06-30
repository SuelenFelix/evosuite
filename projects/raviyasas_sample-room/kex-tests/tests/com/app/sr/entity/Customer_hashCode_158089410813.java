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

public class Customer_hashCode_158089410813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;

    public Customer_hashCode_158089410813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1186 = new Long(2535595959091595249L);
        term1185 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term1185, term1185.getClass(), "id", term1186);
        setField(term1185, term1185.getClass(), "firstName", "UoYtihxVaS");
        setField(term1185, term1185.getClass(), "lastName", "JDswTTCZHV");
        setField(term1185, term1185.getClass(), "email", "onpbIeEKoi");
        setField(term1185, term1185.getClass(), "contactNumber", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1185, args);
    }

};


