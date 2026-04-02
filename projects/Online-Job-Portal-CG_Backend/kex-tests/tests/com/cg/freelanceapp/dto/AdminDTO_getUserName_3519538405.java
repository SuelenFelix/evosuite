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

public class AdminDTO_getUserName_3519538405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6834;

    public AdminDTO_getUserName_3519538405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6834 = newInstance(Class.forName("com.cg.freelanceapp.dto.AdminDTO"));
        setField(term6834, term6834.getClass(), "userName", "zNdorvdUgu");
        setField(term6834, term6834.getClass(), "firstName", "oPxuZbkYio");
        setField(term6834, term6834.getClass(), "lastName", "vKitydDVnM");
        setField(term6834, term6834.getClass(), "password", "urCiQnUFBM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.AdminDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term6834, args);
    }

};


