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

public class BookmarkedJobDTO_getJobId_4761751463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5748;

    public BookmarkedJobDTO_getJobId_4761751463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5749 = new Long(-8085190702504231560L);
        Long term5751 = new Long(1672578078364590450L);
        Long term5753 = new Long(4949335493504695457L);
        term5748 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO"));
        setField(term5748, term5748.getClass(), "skillId", term5749);
        setField(term5748, term5748.getClass(), "freelancerId", term5751);
        setField(term5748, term5748.getClass(), "jobId", term5753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term5748, args);
    }

};


