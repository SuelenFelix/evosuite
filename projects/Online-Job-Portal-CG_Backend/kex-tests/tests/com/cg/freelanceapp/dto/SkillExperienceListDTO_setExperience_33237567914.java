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

public class SkillExperienceListDTO_setExperience_33237567914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9798;
     Object term9843;

    public SkillExperienceListDTO_setExperience_33237567914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9799 = new Long(-1592696983130738594L);
        Long term9801 = new Long(6902365338255307910L);
        Integer term9815 = new Integer(1135664017);
        Long term9817 = new Long(-8019730974733786399L);
        term9798 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9798, term9798.getClass(), "id", term9799);
        setField(term9798, term9798.getClass(), "skillId", term9801);
        setField(term9798, term9798.getClass(), "skillName", "GsWxOwXvSu");
        setField(term9798, term9798.getClass(), "experience", term9815);
        setField(term9798, term9798.getClass(), "freelancerId", term9817);
        setField(term9798, term9798.getClass(), "freelancerName", "bKBSncrMEZ");
        setField(term9798, term9798.getClass(), "freelancerUName", "yeSXGqQExb");
        term9843 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9843;
        callMethod(klass, "setExperience", argTypes, term9798, args);
    }

};


