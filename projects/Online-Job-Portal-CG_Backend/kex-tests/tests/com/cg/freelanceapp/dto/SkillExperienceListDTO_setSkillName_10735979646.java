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

public class SkillExperienceListDTO_setSkillName_10735979646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9130;

    public SkillExperienceListDTO_setSkillName_10735979646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9131 = new Long(8540994973773607992L);
        Long term9133 = new Long(-2338103433822116635L);
        Integer term9147 = new Integer(-1456670397);
        Long term9149 = new Long(-1885698929232124806L);
        term9130 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9130, term9130.getClass(), "id", term9131);
        setField(term9130, term9130.getClass(), "skillId", term9133);
        setField(term9130, term9130.getClass(), "skillName", "NFlvfJCVPO");
        setField(term9130, term9130.getClass(), "experience", term9147);
        setField(term9130, term9130.getClass(), "freelancerId", term9149);
        setField(term9130, term9130.getClass(), "freelancerName", "KarbTXFmUU");
        setField(term9130, term9130.getClass(), "freelancerUName", "jiUSjqwSIQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MgLCedQfoj";
        callMethod(klass, "setSkillName", argTypes, term9130, args);
    }

};


