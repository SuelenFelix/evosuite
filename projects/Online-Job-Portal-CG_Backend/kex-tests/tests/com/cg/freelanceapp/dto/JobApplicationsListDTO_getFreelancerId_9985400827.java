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

public class JobApplicationsListDTO_getFreelancerId_9985400827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4893;

    public JobApplicationsListDTO_getFreelancerId_9985400827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4894 = new Long(414749984815662075L);
        Long term4896 = new Long(463622836963501975L);
        Long term4922 = new Long(305759998609888272L);
        term4893 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4893, term4893.getClass(), "id", term4894);
        setField(term4893, term4893.getClass(), "jobId", term4896);
        setField(term4893, term4893.getClass(), "jobTitle", "QduALnDSVo");
        setField(term4893, term4893.getClass(), "coverLetter", "izPpKDErnQ");
        setField(term4893, term4893.getClass(), "freelancerId", term4922);
        setField(term4893, term4893.getClass(), "freelancerName", "NnpwZBUTvx");
        setField(term4893, term4893.getClass(), "freelancerUName", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerId", argTypes, term4893, args);
    }

};


