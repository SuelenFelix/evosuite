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

public class JobListDTO_getRecruiterId_16177527519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12347;

    public JobListDTO_getRecruiterId_16177527519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12348 = new Long(-187772971269812453L);
        Long term12350 = new Long(468487103823886117L);
        Long term12364 = new Long(4139034517298316285L);
        Long term12378 = new Long(5797412846146719084L);
        term12347 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12347, term12347.getClass(), "jobId", term12348);
        setField(term12347, term12347.getClass(), "freelancerId", term12350);
        setField(term12347, term12347.getClass(), "freelancerName", "HknsTajwxJ");
        setField(term12347, term12347.getClass(), "skillId", term12364);
        setField(term12347, term12347.getClass(), "skillName", "XtiurrVYKw");
        setField(term12347, term12347.getClass(), "recruiterId", term12378);
        setField(term12347, term12347.getClass(), "recruiterName", "rsumfoDNHa");
        setField(term12347, term12347.getClass(), "jobTitle", "ceCWHUTQUM");
        setField(term12347, term12347.getClass(), "jobDescription", "LrqwfrKKtS");
        setBooleanField(term12347, term12347.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterId", argTypes, term12347, args);
    }

};


