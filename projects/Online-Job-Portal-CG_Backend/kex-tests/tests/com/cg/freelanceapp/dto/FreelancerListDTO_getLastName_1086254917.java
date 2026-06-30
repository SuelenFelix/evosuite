package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FreelancerListDTO_getLastName_1086254917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1449;

    public FreelancerListDTO_getLastName_1086254917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1450 = new Long(-7237588299778557629L);
        term1449 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO"));
        setField(term1449, term1449.getClass(), "id", term1450);
        setField(term1449, term1449.getClass(), "userName", "eqJfYWRaEL");
        setField(term1449, term1449.getClass(), "firstName", "fhkbdRViHi");
        setField(term1449, term1449.getClass(), "lastName", "uWHnvSvaPl");
        setField(term1449, term1449.getClass(), "password", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1449, args);
    }

};


