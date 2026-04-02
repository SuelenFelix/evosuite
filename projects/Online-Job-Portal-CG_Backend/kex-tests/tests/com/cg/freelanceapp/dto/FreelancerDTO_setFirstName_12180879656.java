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

public class FreelancerDTO_setFirstName_12180879656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2403;

    public FreelancerDTO_setFirstName_12180879656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2403 = newInstance(Class.forName("com.cg.freelanceapp.dto.FreelancerDTO"));
        setField(term2403, term2403.getClass(), "userName", "qxSDVejjiY");
        setField(term2403, term2403.getClass(), "firstName", "xBsXSDjXYK");
        setField(term2403, term2403.getClass(), "lastName", "sEnIVFtZuQ");
        setField(term2403, term2403.getClass(), "password", "ZVecLZMLHF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FreelancerDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        callMethod(klass, "setFirstName", argTypes, term2403, args);
    }

};


