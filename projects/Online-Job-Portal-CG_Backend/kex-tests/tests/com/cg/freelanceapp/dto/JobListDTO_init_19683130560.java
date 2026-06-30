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
import java.lang.Boolean;

public class JobListDTO_init_19683130560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9949;
     Object term9951;
     Object term9965;
     Object term9979;
     Object term10017;

    public JobListDTO_init_19683130560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9949 = new Long(3108750145697087661L);
        term9951 = new Long(3752337209837437327L);
        term9965 = new Long(1860789353508856614L);
        term9979 = new Long(-7456852906235966771L);
        term10017 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = boolean.class;
        Object[] args = new Object[10];
        args[0] = term9949;
        args[1] = term9951;
        args[2] = "uXYcXVYJZM";
        args[3] = term9965;
        args[4] = "BJhjdJUhkz";
        args[5] = term9979;
        args[6] = "cdHYQDgUZR";
        args[7] = "KAORSSPSeV";
        args[8] = "UimMMORkzd";
        args[9] = term10017;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


