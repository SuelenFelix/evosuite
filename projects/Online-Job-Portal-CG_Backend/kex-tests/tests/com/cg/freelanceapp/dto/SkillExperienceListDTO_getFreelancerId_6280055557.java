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
import java.lang.Long;
import java.lang.Integer;

public class SkillExperienceListDTO_getFreelancerId_6280055557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9227;

    public SkillExperienceListDTO_getFreelancerId_6280055557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9228 = new Long(5731563613239387113L);
        Long term9230 = new Long(3381333711768010594L);
        Integer term9244 = new Integer(1622346318);
        Long term9246 = new Long(3580984732036213717L);
        term9227 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9227, term9227.getClass(), "id", term9228);
        setField(term9227, term9227.getClass(), "skillId", term9230);
        setField(term9227, term9227.getClass(), "skillName", "zgKiINdgNu");
        setField(term9227, term9227.getClass(), "experience", term9244);
        setField(term9227, term9227.getClass(), "freelancerId", term9246);
        setField(term9227, term9227.getClass(), "freelancerName", "zLMTXDQHYH");
        setField(term9227, term9227.getClass(), "freelancerUName", "PqywFWJlpE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerId", argTypes, term9227, args);
    }

};


