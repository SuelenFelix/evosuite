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

public class SkillExperienceListDTO_getFreelancerName_78346677024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9883;

    public SkillExperienceListDTO_getFreelancerName_78346677024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9883 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9883, term9883.getClass(), "id", null);
        setField(term9883, term9883.getClass(), "skillId", null);
        setField(term9883, term9883.getClass(), "skillName", null);
        setField(term9883, term9883.getClass(), "experience", null);
        setField(term9883, term9883.getClass(), "freelancerId", null);
        setField(term9883, term9883.getClass(), "freelancerName", null);
        setField(term9883, term9883.getClass(), "freelancerUName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term9883, args);
    }

};


