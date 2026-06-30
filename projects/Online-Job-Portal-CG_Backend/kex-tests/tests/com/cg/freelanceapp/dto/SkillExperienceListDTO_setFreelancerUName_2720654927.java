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

public class SkillExperienceListDTO_setFreelancerUName_2720654927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9886;

    public SkillExperienceListDTO_setFreelancerUName_2720654927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9886 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9886, term9886.getClass(), "id", null);
        setField(term9886, term9886.getClass(), "skillId", null);
        setField(term9886, term9886.getClass(), "skillName", null);
        setField(term9886, term9886.getClass(), "experience", null);
        setField(term9886, term9886.getClass(), "freelancerId", null);
        setField(term9886, term9886.getClass(), "freelancerName", null);
        setField(term9886, term9886.getClass(), "freelancerUName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFreelancerUName", argTypes, term9886, args);
    }

};


