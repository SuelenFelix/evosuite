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

public class BookmarkedJobListDTO_getJobName_83661751713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8491;

    public BookmarkedJobListDTO_getJobName_83661751713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8492 = new Long(4502292577098212311L);
        Long term8494 = new Long(-3730936709704460408L);
        Long term8508 = new Long(-8614778293741404325L);
        Long term8522 = new Long(-5447369594017685765L);
        term8491 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8491, term8491.getClass(), "id", term8492);
        setField(term8491, term8491.getClass(), "skillId", term8494);
        setField(term8491, term8491.getClass(), "skillName", "hulYxtowxw");
        setField(term8491, term8491.getClass(), "freelancerId", term8508);
        setField(term8491, term8491.getClass(), "freelancerName", "GNEmuHPNcU");
        setField(term8491, term8491.getClass(), "jobId", term8522);
        setField(term8491, term8491.getClass(), "jobName", "IoSfuKDFRe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobName", argTypes, term8491, args);
    }

};


