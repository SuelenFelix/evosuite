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

public class BookmarkedJobListDTO_getFreelancerName_9531830739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8167;

    public BookmarkedJobListDTO_getFreelancerName_9531830739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8168 = new Long(-8603648071751666348L);
        Long term8170 = new Long(-7884871963229073324L);
        Long term8184 = new Long(-8649738738252714180L);
        Long term8198 = new Long(-7278883608542636188L);
        term8167 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8167, term8167.getClass(), "id", term8168);
        setField(term8167, term8167.getClass(), "skillId", term8170);
        setField(term8167, term8167.getClass(), "skillName", "xClUIcPECX");
        setField(term8167, term8167.getClass(), "freelancerId", term8184);
        setField(term8167, term8167.getClass(), "freelancerName", "avhRaGZaBF");
        setField(term8167, term8167.getClass(), "jobId", term8198);
        setField(term8167, term8167.getClass(), "jobName", "JkgoRtImdE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term8167, args);
    }

};


