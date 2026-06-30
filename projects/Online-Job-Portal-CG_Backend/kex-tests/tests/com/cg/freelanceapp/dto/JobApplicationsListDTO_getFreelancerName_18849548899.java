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

public class JobApplicationsListDTO_getFreelancerName_18849548899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5085;

    public JobApplicationsListDTO_getFreelancerName_18849548899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5086 = new Long(6682528376118987775L);
        Long term5088 = new Long(682356318767179819L);
        Long term5114 = new Long(-7291743527973326814L);
        term5085 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5085, term5085.getClass(), "id", term5086);
        setField(term5085, term5085.getClass(), "jobId", term5088);
        setField(term5085, term5085.getClass(), "jobTitle", "SFqCrhEWLm");
        setField(term5085, term5085.getClass(), "coverLetter", "GZdcJyZntS");
        setField(term5085, term5085.getClass(), "freelancerId", term5114);
        setField(term5085, term5085.getClass(), "freelancerName", "OIHoJeysUi");
        setField(term5085, term5085.getClass(), "freelancerUName", "WXMWFDGcLB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term5085, args);
    }

};


