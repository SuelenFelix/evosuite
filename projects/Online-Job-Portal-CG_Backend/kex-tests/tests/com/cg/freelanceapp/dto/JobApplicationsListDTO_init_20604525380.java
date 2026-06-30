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

public class JobApplicationsListDTO_init_20604525380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4203;
     Object term4205;
     Object term4231;

    public JobApplicationsListDTO_init_20604525380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4203 = new Long(-6645965768855543712L);
        term4205 = new Long(4784595517102746672L);
        term4231 = new Long(-7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.Long");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term4203;
        args[1] = term4205;
        args[2] = "kVEZMHmRtR";
        args[3] = "ekxGuOYIwi";
        args[4] = term4231;
        args[5] = "RbVQXSpxXy";
        args[6] = "YpJbIgJWWv";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


