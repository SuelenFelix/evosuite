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

public class BookmarkedJobListDTO_getFreelancerId_193031189822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8669;

    public BookmarkedJobListDTO_getFreelancerId_193031189822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8669 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8669, term8669.getClass(), "id", null);
        setField(term8669, term8669.getClass(), "skillId", null);
        setField(term8669, term8669.getClass(), "skillName", null);
        setField(term8669, term8669.getClass(), "freelancerId", null);
        setField(term8669, term8669.getClass(), "freelancerName", null);
        setField(term8669, term8669.getClass(), "jobId", null);
        setField(term8669, term8669.getClass(), "jobName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerId", argTypes, term8669, args);
    }

};


