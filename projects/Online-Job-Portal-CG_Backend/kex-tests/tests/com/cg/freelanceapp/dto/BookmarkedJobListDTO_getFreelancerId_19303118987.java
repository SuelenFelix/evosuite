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

public class BookmarkedJobListDTO_getFreelancerId_19303118987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8015;

    public BookmarkedJobListDTO_getFreelancerId_19303118987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8016 = new Long(-6301101997917060727L);
        Long term8018 = new Long(8166095254618543564L);
        Long term8032 = new Long(-4598158870068953328L);
        Long term8046 = new Long(138235087558060686L);
        term8015 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8015, term8015.getClass(), "id", term8016);
        setField(term8015, term8015.getClass(), "skillId", term8018);
        setField(term8015, term8015.getClass(), "skillName", "JeZFtaqkzW");
        setField(term8015, term8015.getClass(), "freelancerId", term8032);
        setField(term8015, term8015.getClass(), "freelancerName", "vOVuNSCCLe");
        setField(term8015, term8015.getClass(), "jobId", term8046);
        setField(term8015, term8015.getClass(), "jobName", "fzeqPnzpnt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerId", argTypes, term8015, args);
    }

};


