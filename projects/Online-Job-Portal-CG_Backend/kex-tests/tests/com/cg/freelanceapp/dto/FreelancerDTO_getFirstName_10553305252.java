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

public class FreelancerDTO_getFirstName_10553305252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2047;

    public FreelancerDTO_getFirstName_10553305252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2047 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerDTO"));
        setField(term2047, term2047.getClass(), "userName", "jSpAteRute");
        setField(term2047, term2047.getClass(), "firstName", "swZVeJAxjt");
        setField(term2047, term2047.getClass(), "lastName", "xOcJIiQQDu");
        setField(term2047, term2047.getClass(), "password", "GVizqqzXpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term2047, args);
    }

};


