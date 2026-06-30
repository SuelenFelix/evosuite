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

public class JobApplicationsListDTO_setCoverLetter_156981597414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5604;

    public JobApplicationsListDTO_setCoverLetter_156981597414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5605 = new Long(-8876856890348836498L);
        Long term5607 = new Long(846579494941632714L);
        Long term5633 = new Long(6689117472719450333L);
        term5604 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5604, term5604.getClass(), "id", term5605);
        setField(term5604, term5604.getClass(), "jobId", term5607);
        setField(term5604, term5604.getClass(), "jobTitle", "nghfqDXyCG");
        setField(term5604, term5604.getClass(), "coverLetter", "WBAOTqErtm");
        setField(term5604, term5604.getClass(), "freelancerId", term5633);
        setField(term5604, term5604.getClass(), "freelancerName", "PqtVXXZMqK");
        setField(term5604, term5604.getClass(), "freelancerUName", "rYbtIDVdnd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setCoverLetter", argTypes, term5604, args);
    }

};


