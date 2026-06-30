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

public class BookmarkedJobDTO_setFreelancerId_15088080625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5762;
     Object term5769;

    public BookmarkedJobDTO_setFreelancerId_15088080625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5763 = new Long(-9040825890007374809L);
        Long term5765 = new Long(1368340889161782793L);
        Long term5767 = new Long(-5786861555969446503L);
        term5762 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO"));
        setField(term5762, term5762.getClass(), "skillId", term5763);
        setField(term5762, term5762.getClass(), "freelancerId", term5765);
        setField(term5762, term5762.getClass(), "jobId", term5767);
        term5769 = new Long(2354625302846375590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5769;
        callMethod(klass, "setFreelancerId", argTypes, term5762, args);
    }

};


