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

public class FreelancerListDTO_setPassword_211331414311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12006;

    public FreelancerListDTO_setPassword_211331414311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12007 = new Long(6556282323732455484L);
        term12006 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO"));
        setField(term12006, term12006.getClass(), "id", term12007);
        setField(term12006, term12006.getClass(), "userName", "pNjJQBsfBv");
        setField(term12006, term12006.getClass(), "firstName", "AeoFWTVnXE");
        setField(term12006, term12006.getClass(), "lastName", "KNodpPTOen");
        setField(term12006, term12006.getClass(), "password", "HLdVSdPKUm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cKqYMrtneQ";
        callMethod(klass, "setPassword", argTypes, term12006, args);
    }

};


