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

public class JobListDTO_setRecruiterName_1196777768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10955;

    public JobListDTO_setRecruiterName_1196777768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10956 = new Long(174253963298276221L);
        Long term10958 = new Long(3713624957161771816L);
        Long term10972 = new Long(6130232388739280211L);
        Long term10986 = new Long(3423965054378869855L);
        term10955 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10955, term10955.getClass(), "jobId", term10956);
        setField(term10955, term10955.getClass(), "freelancerId", term10958);
        setField(term10955, term10955.getClass(), "freelancerName", "gPzGDOEPPw");
        setField(term10955, term10955.getClass(), "skillId", term10972);
        setField(term10955, term10955.getClass(), "skillName", "rwKoAngzCu");
        setField(term10955, term10955.getClass(), "recruiterId", term10986);
        setField(term10955, term10955.getClass(), "recruiterName", "VUkRVwROTl");
        setField(term10955, term10955.getClass(), "jobTitle", "UDlkdccCRn");
        setField(term10955, term10955.getClass(), "jobDescription", "McpzErOcYb");
        setBooleanField(term10955, term10955.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jqrVEUvYEz";
        callMethod(klass, "setRecruiterName", argTypes, term10955, args);
    }

};


