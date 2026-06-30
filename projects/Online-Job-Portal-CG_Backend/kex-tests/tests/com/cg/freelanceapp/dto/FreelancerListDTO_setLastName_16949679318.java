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

public class FreelancerListDTO_setLastName_16949679318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1540;

    public FreelancerListDTO_setLastName_16949679318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1541 = new Long(6967924379644551255L);
        term1540 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO"));
        setField(term1540, term1540.getClass(), "id", term1541);
        setField(term1540, term1540.getClass(), "userName", "TJmVBGfTML");
        setField(term1540, term1540.getClass(), "firstName", "tPlsykYBqO");
        setField(term1540, term1540.getClass(), "lastName", "bLPjGVBhlX");
        setField(term1540, term1540.getClass(), "password", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IgRJUzaCwW";
        callMethod(klass, "setLastName", argTypes, term1540, args);
    }

};


