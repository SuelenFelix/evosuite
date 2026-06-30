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

public class JobListDTO_getSkillId_47080206515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11863;

    public JobListDTO_getSkillId_47080206515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11864 = new Long(-3033337370154155851L);
        Long term11866 = new Long(-3130003589475815807L);
        Long term11880 = new Long(-5344598381371854750L);
        Long term11894 = new Long(-3718250311794019732L);
        term11863 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11863, term11863.getClass(), "jobId", term11864);
        setField(term11863, term11863.getClass(), "freelancerId", term11866);
        setField(term11863, term11863.getClass(), "freelancerName", "MqICFYzDJj");
        setField(term11863, term11863.getClass(), "skillId", term11880);
        setField(term11863, term11863.getClass(), "skillName", "YgQvdcBQKw");
        setField(term11863, term11863.getClass(), "recruiterId", term11894);
        setField(term11863, term11863.getClass(), "recruiterName", "FiYYLuailz");
        setField(term11863, term11863.getClass(), "jobTitle", "XebAeSnCKZ");
        setField(term11863, term11863.getClass(), "jobDescription", "GeddnXjHGy");
        setBooleanField(term11863, term11863.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term11863, args);
    }

};


