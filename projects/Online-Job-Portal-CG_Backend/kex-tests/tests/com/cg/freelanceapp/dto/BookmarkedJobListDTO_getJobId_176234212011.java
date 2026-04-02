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

public class BookmarkedJobListDTO_getJobId_176234212011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8339;

    public BookmarkedJobListDTO_getJobId_176234212011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8340 = new Long(4266570509071948633L);
        Long term8342 = new Long(-7291742736502427077L);
        Long term8356 = new Long(-8121849829073967555L);
        Long term8370 = new Long(5219030281405653303L);
        term8339 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8339, term8339.getClass(), "id", term8340);
        setField(term8339, term8339.getClass(), "skillId", term8342);
        setField(term8339, term8339.getClass(), "skillName", "zsWKWiTFuo");
        setField(term8339, term8339.getClass(), "freelancerId", term8356);
        setField(term8339, term8339.getClass(), "freelancerName", "UPUbwyHQKN");
        setField(term8339, term8339.getClass(), "jobId", term8370);
        setField(term8339, term8339.getClass(), "jobName", "lgQkrXANyI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term8339, args);
    }

};


