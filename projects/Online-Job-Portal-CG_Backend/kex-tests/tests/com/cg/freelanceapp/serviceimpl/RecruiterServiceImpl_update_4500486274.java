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

public class RecruiterServiceImpl_update_4500486274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term94;

    public RecruiterServiceImpl_update_4500486274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = new Long(6375119433582206027L);
        term94 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterDTO"));
        setField(term94, term94.getClass(), "userName", "jJCZpVmanW");
        setField(term94, term94.getClass(), "firstName", "EGtDIRbSSb");
        setField(term94, term94.getClass(), "lastName", "SzjVpOQTyS");
        setField(term94, term94.getClass(), "password", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.RecruiterServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.cg.freelanceapp.dto.RecruiterDTO");
        Object[] args = new Object[2];
        args[0] = term92;
        args[1] = term94;
        callMethod(klass, "update", argTypes, null, args);
    }

};


