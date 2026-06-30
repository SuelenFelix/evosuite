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

public class SkillExperienceListDTO_getSkillName_12363554045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9055;

    public SkillExperienceListDTO_getSkillName_12363554045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9056 = new Long(8863790908271299748L);
        Long term9058 = new Long(9205327385733285058L);
        Integer term9072 = new Integer(-1685132342);
        Long term9074 = new Long(4199886998224701110L);
        term9055 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9055, term9055.getClass(), "id", term9056);
        setField(term9055, term9055.getClass(), "skillId", term9058);
        setField(term9055, term9055.getClass(), "skillName", "KSJeYkkvpk");
        setField(term9055, term9055.getClass(), "experience", term9072);
        setField(term9055, term9055.getClass(), "freelancerId", term9074);
        setField(term9055, term9055.getClass(), "freelancerName", "qUtkFGMNUV");
        setField(term9055, term9055.getClass(), "freelancerUName", "mGRiYhnMcR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillName", argTypes, term9055, args);
    }

};


