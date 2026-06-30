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

public class BookmarkedJobListDTO_setJobName_2513649314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8566;

    public BookmarkedJobListDTO_setJobName_2513649314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8567 = new Long(-5724112525188606013L);
        Long term8569 = new Long(-6100012593724108983L);
        Long term8583 = new Long(5465527210299101732L);
        Long term8597 = new Long(4699157009689333952L);
        term8566 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8566, term8566.getClass(), "id", term8567);
        setField(term8566, term8566.getClass(), "skillId", term8569);
        setField(term8566, term8566.getClass(), "skillName", "AWYyZiNfsm");
        setField(term8566, term8566.getClass(), "freelancerId", term8583);
        setField(term8566, term8566.getClass(), "freelancerName", "ITRRYiuDwH");
        setField(term8566, term8566.getClass(), "jobId", term8597);
        setField(term8566, term8566.getClass(), "jobName", "llRfwANcVF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sUEeHQTWkA";
        callMethod(klass, "setJobName", argTypes, term8566, args);
    }

};


