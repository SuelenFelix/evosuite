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

public class SkillExperienceDTO_getSkillId_17029398553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9902;

    public SkillExperienceDTO_getSkillId_17029398553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9903 = new Integer(-244121226);
        Long term9905 = new Long(-7904053112604879960L);
        Long term9907 = new Long(-6602460430714339690L);
        term9902 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO"));
        setField(term9902, term9902.getClass(), "years", term9903);
        setField(term9902, term9902.getClass(), "skillId", term9905);
        setField(term9902, term9902.getClass(), "freelancerId", term9907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term9902, args);
    }

};


