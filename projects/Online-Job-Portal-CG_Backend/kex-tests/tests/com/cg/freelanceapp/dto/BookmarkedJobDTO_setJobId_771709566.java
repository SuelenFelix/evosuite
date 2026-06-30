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

public class BookmarkedJobDTO_setJobId_771709566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5771;
     Object term5778;

    public BookmarkedJobDTO_setJobId_771709566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5772 = new Long(7276637106827860087L);
        Long term5774 = new Long(-3936701866695933852L);
        Long term5776 = new Long(1215116475929634177L);
        term5771 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO"));
        setField(term5771, term5771.getClass(), "skillId", term5772);
        setField(term5771, term5771.getClass(), "freelancerId", term5774);
        setField(term5771, term5771.getClass(), "jobId", term5776);
        term5778 = new Long(1597484336218508869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5778;
        callMethod(klass, "setJobId", argTypes, term5771, args);
    }

};


