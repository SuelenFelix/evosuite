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

public class BookmarkedJobListDTO_getId_20882698791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7539;

    public BookmarkedJobListDTO_getId_20882698791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7540 = new Long(-7268507582722666254L);
        Long term7542 = new Long(5671808784468963649L);
        Long term7556 = new Long(2297097306706899827L);
        Long term7570 = new Long(-900457279156388404L);
        term7539 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term7539, term7539.getClass(), "id", term7540);
        setField(term7539, term7539.getClass(), "skillId", term7542);
        setField(term7539, term7539.getClass(), "skillName", "UDaboHZHhz");
        setField(term7539, term7539.getClass(), "freelancerId", term7556);
        setField(term7539, term7539.getClass(), "freelancerName", "nRvKihUSPj");
        setField(term7539, term7539.getClass(), "jobId", term7570);
        setField(term7539, term7539.getClass(), "jobName", "BbNeQJpYPr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7539, args);
    }

};


