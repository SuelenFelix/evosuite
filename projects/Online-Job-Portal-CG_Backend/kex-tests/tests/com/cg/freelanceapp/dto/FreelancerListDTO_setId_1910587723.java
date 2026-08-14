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

public class FreelancerListDTO_setId_1910587723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11210;
     Object term11261;

    public FreelancerListDTO_setId_1910587723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11211 = new Long(199834233798511747L);
        term11210 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO"));
        setField(term11210, term11210.getClass(), "id", term11211);
        setField(term11210, term11210.getClass(), "userName", "OzucqAMebQ");
        setField(term11210, term11210.getClass(), "firstName", "VecourIOHN");
        setField(term11210, term11210.getClass(), "lastName", "tZiwBSETUL");
        setField(term11210, term11210.getClass(), "password", "fmecFLYSIi");
        term11261 = new Long(3151699339436192337L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11261;
        callMethod(klass, "setId", argTypes, term11210, args);
    }

};


