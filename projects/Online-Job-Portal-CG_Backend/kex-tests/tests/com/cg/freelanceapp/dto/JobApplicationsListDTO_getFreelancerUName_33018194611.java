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

public class JobApplicationsListDTO_getFreelancerUName_33018194611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5297;

    public JobApplicationsListDTO_getFreelancerUName_33018194611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5298 = new Long(50358265865610362L);
        Long term5300 = new Long(5510783420697225605L);
        Long term5326 = new Long(6005241913654469005L);
        term5297 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5297, term5297.getClass(), "id", term5298);
        setField(term5297, term5297.getClass(), "jobId", term5300);
        setField(term5297, term5297.getClass(), "jobTitle", "gUvcueTURF");
        setField(term5297, term5297.getClass(), "coverLetter", "EwQBhZjCIT");
        setField(term5297, term5297.getClass(), "freelancerId", term5326);
        setField(term5297, term5297.getClass(), "freelancerName", "aSkmSwTnEw");
        setField(term5297, term5297.getClass(), "freelancerUName", "xvkbvaEGYd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerUName", argTypes, term5297, args);
    }

};


