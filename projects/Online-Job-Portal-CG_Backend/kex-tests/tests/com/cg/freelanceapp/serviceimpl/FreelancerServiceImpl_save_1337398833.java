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

public class FreelancerServiceImpl_save_1337398833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;

    public FreelancerServiceImpl_save_1337398833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term954 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerDTO"));
        setField(term954, term954.getClass(), "userName", "xrwlQZdwCp");
        setField(term954, term954.getClass(), "firstName", "IDCWpPLRkE");
        setField(term954, term954.getClass(), "lastName", "nyiiPDVjAc");
        setField(term954, term954.getClass(), "password", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.FreelancerServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.FreelancerDTO");
        Object[] args = new Object[1];
        args[0] = term954;
        callMethod(klass, "save", argTypes, null, args);
    }

};


