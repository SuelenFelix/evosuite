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

public class BookmarkedJobListDTO_setId_16582281212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7614;
     Object term7659;

    public BookmarkedJobListDTO_setId_16582281212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7615 = new Long(1084801489398441516L);
        Long term7617 = new Long(6273754186658578034L);
        Long term7631 = new Long(3620247240684476031L);
        Long term7645 = new Long(8313800941204938919L);
        term7614 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term7614, term7614.getClass(), "id", term7615);
        setField(term7614, term7614.getClass(), "skillId", term7617);
        setField(term7614, term7614.getClass(), "skillName", "riMtzCoxNj");
        setField(term7614, term7614.getClass(), "freelancerId", term7631);
        setField(term7614, term7614.getClass(), "freelancerName", "YAXkVjQZcV");
        setField(term7614, term7614.getClass(), "jobId", term7645);
        setField(term7614, term7614.getClass(), "jobName", "pumvwBWvpy");
        term7659 = new Long(-1214968196781083707L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7659;
        callMethod(klass, "setId", argTypes, term7614, args);
    }

};


