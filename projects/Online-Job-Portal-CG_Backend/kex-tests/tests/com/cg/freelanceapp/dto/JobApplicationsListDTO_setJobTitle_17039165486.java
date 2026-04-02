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

public class JobApplicationsListDTO_setJobTitle_17039165486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4776;

    public JobApplicationsListDTO_setJobTitle_17039165486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4777 = new Long(-1610676979013636850L);
        Long term4779 = new Long(2062173786000223358L);
        Long term4805 = new Long(-8658027316505137504L);
        term4776 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4776, term4776.getClass(), "id", term4777);
        setField(term4776, term4776.getClass(), "jobId", term4779);
        setField(term4776, term4776.getClass(), "jobTitle", "tlzpzIjMib");
        setField(term4776, term4776.getClass(), "coverLetter", "AZdLeSugwv");
        setField(term4776, term4776.getClass(), "freelancerId", term4805);
        setField(term4776, term4776.getClass(), "freelancerName", "RMsXuyzKJV");
        setField(term4776, term4776.getClass(), "freelancerUName", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hOncybyCAH";
        callMethod(klass, "setJobTitle", argTypes, term4776, args);
    }

};


