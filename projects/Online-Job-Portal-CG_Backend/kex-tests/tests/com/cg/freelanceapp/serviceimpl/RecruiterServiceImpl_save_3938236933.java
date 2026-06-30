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

public class RecruiterServiceImpl_save_3938236933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public RecruiterServiceImpl_save_3938236933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterDTO"));
        setField(term3, term3.getClass(), "userName", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "firstName", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "lastName", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "password", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.RecruiterServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.RecruiterDTO");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "save", argTypes, null, args);
    }

};


