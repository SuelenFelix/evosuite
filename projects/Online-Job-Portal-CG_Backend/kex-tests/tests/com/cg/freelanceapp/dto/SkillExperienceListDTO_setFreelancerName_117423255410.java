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

public class SkillExperienceListDTO_setFreelancerName_117423255410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9454;

    public SkillExperienceListDTO_setFreelancerName_117423255410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9455 = new Long(-7698746988132548371L);
        Long term9457 = new Long(2145420811068634601L);
        Integer term9471 = new Integer(-6029667);
        Long term9473 = new Long(2191130532479601175L);
        term9454 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9454, term9454.getClass(), "id", term9455);
        setField(term9454, term9454.getClass(), "skillId", term9457);
        setField(term9454, term9454.getClass(), "skillName", "OUeBWNTQDh");
        setField(term9454, term9454.getClass(), "experience", term9471);
        setField(term9454, term9454.getClass(), "freelancerId", term9473);
        setField(term9454, term9454.getClass(), "freelancerName", "gltJarNuUk");
        setField(term9454, term9454.getClass(), "freelancerUName", "ZwZIDwYcSW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sOdkipUKRu";
        callMethod(klass, "setFreelancerName", argTypes, term9454, args);
    }

};


