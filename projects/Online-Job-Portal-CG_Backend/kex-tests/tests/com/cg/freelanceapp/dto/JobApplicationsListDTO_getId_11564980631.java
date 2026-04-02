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

public class JobApplicationsListDTO_getId_11564980631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4297;

    public JobApplicationsListDTO_getId_11564980631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4298 = new Long(-2170847986967241072L);
        Long term4300 = new Long(4044358158040652353L);
        Long term4326 = new Long(-4443169559037975007L);
        term4297 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4297, term4297.getClass(), "id", term4298);
        setField(term4297, term4297.getClass(), "jobId", term4300);
        setField(term4297, term4297.getClass(), "jobTitle", "JppkknKVOw");
        setField(term4297, term4297.getClass(), "coverLetter", "iljANwuEjk");
        setField(term4297, term4297.getClass(), "freelancerId", term4326);
        setField(term4297, term4297.getClass(), "freelancerName", "kNqaJKIATy");
        setField(term4297, term4297.getClass(), "freelancerUName", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4297, args);
    }

};


