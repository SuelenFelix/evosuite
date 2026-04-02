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

public class SkillExperienceDTO_getYears_4595389234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9909;

    public SkillExperienceDTO_getYears_4595389234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9910 = new Integer(-203030934);
        Long term9912 = new Long(21047099434645581L);
        Long term9914 = new Long(-8862087040734407227L);
        term9909 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO"));
        setField(term9909, term9909.getClass(), "years", term9910);
        setField(term9909, term9909.getClass(), "skillId", term9912);
        setField(term9909, term9909.getClass(), "freelancerId", term9914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYears", argTypes, term9909, args);
    }

};


