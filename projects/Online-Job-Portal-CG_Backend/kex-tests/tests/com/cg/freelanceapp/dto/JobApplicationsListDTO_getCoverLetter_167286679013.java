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

public class JobApplicationsListDTO_getCoverLetter_167286679013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5509;

    public JobApplicationsListDTO_getCoverLetter_167286679013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5510 = new Long(2701184207686293431L);
        Long term5512 = new Long(4474998035090263139L);
        Long term5538 = new Long(2848819812340321742L);
        term5509 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5509, term5509.getClass(), "id", term5510);
        setField(term5509, term5509.getClass(), "jobId", term5512);
        setField(term5509, term5509.getClass(), "jobTitle", "ShIELyuULw");
        setField(term5509, term5509.getClass(), "coverLetter", "IpQuOGMgmj");
        setField(term5509, term5509.getClass(), "freelancerId", term5538);
        setField(term5509, term5509.getClass(), "freelancerName", "pJbnHTYrxn");
        setField(term5509, term5509.getClass(), "freelancerUName", "iIRsCSYqXH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoverLetter", argTypes, term5509, args);
    }

};


