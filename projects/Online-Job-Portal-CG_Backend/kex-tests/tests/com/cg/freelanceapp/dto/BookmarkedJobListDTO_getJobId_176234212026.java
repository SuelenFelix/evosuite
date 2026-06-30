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

public class BookmarkedJobListDTO_getJobId_176234212026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8673;

    public BookmarkedJobListDTO_getJobId_176234212026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8673 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8673, term8673.getClass(), "id", null);
        setField(term8673, term8673.getClass(), "skillId", null);
        setField(term8673, term8673.getClass(), "skillName", null);
        setField(term8673, term8673.getClass(), "freelancerId", null);
        setField(term8673, term8673.getClass(), "freelancerName", null);
        setField(term8673, term8673.getClass(), "jobId", null);
        setField(term8673, term8673.getClass(), "jobName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term8673, args);
    }

};


