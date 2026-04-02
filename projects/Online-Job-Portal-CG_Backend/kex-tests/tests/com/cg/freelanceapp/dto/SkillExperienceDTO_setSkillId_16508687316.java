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

public class SkillExperienceDTO_setSkillId_16508687316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9925;
     Object term9932;

    public SkillExperienceDTO_setSkillId_16508687316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9926 = new Integer(-73683645);
        Long term9928 = new Long(-7406618974062419277L);
        Long term9930 = new Long(868503089567085985L);
        term9925 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO"));
        setField(term9925, term9925.getClass(), "years", term9926);
        setField(term9925, term9925.getClass(), "skillId", term9928);
        setField(term9925, term9925.getClass(), "freelancerId", term9930);
        term9932 = new Long(-3277773415369003529L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term9932;
        callMethod(klass, "setSkillId", argTypes, term9925, args);
    }

};


