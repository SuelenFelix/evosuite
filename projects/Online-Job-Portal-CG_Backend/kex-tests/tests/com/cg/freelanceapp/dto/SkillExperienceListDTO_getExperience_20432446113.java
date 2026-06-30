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

public class SkillExperienceListDTO_getExperience_20432446113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9723;

    public SkillExperienceListDTO_getExperience_20432446113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9724 = new Long(5904678961906211249L);
        Long term9726 = new Long(-1820639665251914495L);
        Integer term9740 = new Integer(-1007160944);
        Long term9742 = new Long(3238645206498300107L);
        term9723 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9723, term9723.getClass(), "id", term9724);
        setField(term9723, term9723.getClass(), "skillId", term9726);
        setField(term9723, term9723.getClass(), "skillName", "UkKvaeJfEC");
        setField(term9723, term9723.getClass(), "experience", term9740);
        setField(term9723, term9723.getClass(), "freelancerId", term9742);
        setField(term9723, term9723.getClass(), "freelancerName", "WPxXsahPRq");
        setField(term9723, term9723.getClass(), "freelancerUName", "IENRuqmwUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExperience", argTypes, term9723, args);
    }

};


