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

public class JobListDTO_setFreelancerId_87919031918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12225;
     Object term12295;

    public JobListDTO_setFreelancerId_87919031918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12226 = new Long(3086974592680165932L);
        Long term12228 = new Long(-532956263280568707L);
        Long term12242 = new Long(6073193746616629086L);
        Long term12256 = new Long(-2463629530824341661L);
        term12225 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12225, term12225.getClass(), "jobId", term12226);
        setField(term12225, term12225.getClass(), "freelancerId", term12228);
        setField(term12225, term12225.getClass(), "freelancerName", "CNqMxLvtcJ");
        setField(term12225, term12225.getClass(), "skillId", term12242);
        setField(term12225, term12225.getClass(), "skillName", "ktbqerIaKW");
        setField(term12225, term12225.getClass(), "recruiterId", term12256);
        setField(term12225, term12225.getClass(), "recruiterName", "VoghngXfsK");
        setField(term12225, term12225.getClass(), "jobTitle", "GbahCBMvct");
        setField(term12225, term12225.getClass(), "jobDescription", "iiHBhsNFgk");
        setBooleanField(term12225, term12225.getClass(), "jobStatus", false);
        term12295 = new Long(7800835025296877231L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12295;
        callMethod(klass, "setFreelancerId", argTypes, term12225, args);
    }

};


