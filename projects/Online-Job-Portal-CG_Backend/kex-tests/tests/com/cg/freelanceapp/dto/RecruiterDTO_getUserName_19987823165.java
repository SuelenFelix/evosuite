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

public class RecruiterDTO_getUserName_19987823165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16788;

    public RecruiterDTO_getUserName_19987823165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16788 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterDTO"));
        setField(term16788, term16788.getClass(), "userName", "hPpFNeDBIb");
        setField(term16788, term16788.getClass(), "firstName", "DNOtiLPAIY");
        setField(term16788, term16788.getClass(), "lastName", "FnEkAHBfyV");
        setField(term16788, term16788.getClass(), "password", "VfmNFpEuax");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term16788, args);
    }

};


