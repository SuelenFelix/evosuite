package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FreelancerServiceImpl_update_775149494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043;
     Object term1045;

    public FreelancerServiceImpl_update_775149494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1043 = new Long(-6645965768855543712L);
        term1045 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerDTO"));
        setField(term1045, term1045.getClass(), "userName", "wSQxaModmm");
        setField(term1045, term1045.getClass(), "firstName", "UlajhuVLaP");
        setField(term1045, term1045.getClass(), "lastName", "gGSMzuGICf");
        setField(term1045, term1045.getClass(), "password", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.FreelancerServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.cg.freelanceapp.dto.FreelancerDTO");
        Object[] args = new Object[2];
        args[0] = term1043;
        args[1] = term1045;
        callMethod(klass, "update", argTypes, null, args);
    }

};


