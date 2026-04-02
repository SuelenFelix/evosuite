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

public class BookmarkedJobListDTO_setFreelancerId_14999922608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8090;
     Object term8135;

    public BookmarkedJobListDTO_setFreelancerId_14999922608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8091 = new Long(5381386339318883012L);
        Long term8093 = new Long(-1333707622307134180L);
        Long term8107 = new Long(-4360569253593381888L);
        Long term8121 = new Long(1457594663983990440L);
        term8090 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8090, term8090.getClass(), "id", term8091);
        setField(term8090, term8090.getClass(), "skillId", term8093);
        setField(term8090, term8090.getClass(), "skillName", "RxbhrFBjkO");
        setField(term8090, term8090.getClass(), "freelancerId", term8107);
        setField(term8090, term8090.getClass(), "freelancerName", "aanyiAOJCl");
        setField(term8090, term8090.getClass(), "jobId", term8121);
        setField(term8090, term8090.getClass(), "jobName", "VDokbsCuqq");
        term8135 = new Long(3452833434644634217L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8135;
        callMethod(klass, "setFreelancerId", argTypes, term8090, args);
    }

};


