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

public class JobListDTO_setJobDescription_2993410912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11479;

    public JobListDTO_setJobDescription_2993410912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11480 = new Long(7735460540091431012L);
        Long term11482 = new Long(1346299551708610248L);
        Long term11496 = new Long(-7191625829563442696L);
        Long term11510 = new Long(1463379874413441830L);
        term11479 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11479, term11479.getClass(), "jobId", term11480);
        setField(term11479, term11479.getClass(), "freelancerId", term11482);
        setField(term11479, term11479.getClass(), "freelancerName", "nHpMKOmlpQ");
        setField(term11479, term11479.getClass(), "skillId", term11496);
        setField(term11479, term11479.getClass(), "skillName", "fKhrQsJToZ");
        setField(term11479, term11479.getClass(), "recruiterId", term11510);
        setField(term11479, term11479.getClass(), "recruiterName", "wsysQLGFnl");
        setField(term11479, term11479.getClass(), "jobTitle", "ckQLZGFjMX");
        setField(term11479, term11479.getClass(), "jobDescription", "qphdrqUtNx");
        setBooleanField(term11479, term11479.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bwlLFAfNWx";
        callMethod(klass, "setJobDescription", argTypes, term11479, args);
    }

};


