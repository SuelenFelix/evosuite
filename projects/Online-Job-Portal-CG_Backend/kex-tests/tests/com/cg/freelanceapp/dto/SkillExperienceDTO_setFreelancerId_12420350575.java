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
import java.lang.Integer;
import java.lang.Long;

public class SkillExperienceDTO_setFreelancerId_12420350575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9916;
     Object term9923;

    public SkillExperienceDTO_setFreelancerId_12420350575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9917 = new Integer(-1179120542);
        Long term9919 = new Long(-6394943900800506753L);
        Long term9921 = new Long(-4867941246533901410L);
        term9916 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO"));
        setField(term9916, term9916.getClass(), "years", term9917);
        setField(term9916, term9916.getClass(), "skillId", term9919);
        setField(term9916, term9916.getClass(), "freelancerId", term9921);
        term9923 = new Long(1044883697493326351L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term9923;
        callMethod(klass, "setFreelancerId", argTypes, term9916, args);
    }

};


