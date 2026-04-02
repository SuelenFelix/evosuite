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

public class BookmarkedJobListDTO_setJobId_120899601812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8414;
     Object term8459;

    public BookmarkedJobListDTO_setJobId_120899601812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8415 = new Long(-8471550651709805183L);
        Long term8417 = new Long(-948292411727204525L);
        Long term8431 = new Long(-8892586408602479513L);
        Long term8445 = new Long(4616440478358528406L);
        term8414 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8414, term8414.getClass(), "id", term8415);
        setField(term8414, term8414.getClass(), "skillId", term8417);
        setField(term8414, term8414.getClass(), "skillName", "MeTmRZXErV");
        setField(term8414, term8414.getClass(), "freelancerId", term8431);
        setField(term8414, term8414.getClass(), "freelancerName", "jNxbVmoZgq");
        setField(term8414, term8414.getClass(), "jobId", term8445);
        setField(term8414, term8414.getClass(), "jobName", "PvmBHIXaMY");
        term8459 = new Long(3427570961451840069L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8459;
        callMethod(klass, "setJobId", argTypes, term8414, args);
    }

};


