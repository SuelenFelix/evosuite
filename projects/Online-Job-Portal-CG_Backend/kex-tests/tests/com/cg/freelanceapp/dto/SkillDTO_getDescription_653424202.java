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

public class SkillDTO_getDescription_653424202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16205;

    public SkillDTO_getDescription_653424202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16205 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillDTO"));
        setField(term16205, term16205.getClass(), "name", "XZkOUcbfFg");
        setField(term16205, term16205.getClass(), "description", "TGiJfagfky");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term16205, args);
    }

};


