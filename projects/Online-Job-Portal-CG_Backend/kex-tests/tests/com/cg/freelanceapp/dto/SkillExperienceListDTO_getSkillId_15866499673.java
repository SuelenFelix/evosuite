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

public class SkillExperienceListDTO_getSkillId_15866499673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8903;

    public SkillExperienceListDTO_getSkillId_15866499673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8904 = new Long(-433040798405298080L);
        Long term8906 = new Long(-1505191021111100819L);
        Integer term8920 = new Integer(1585847225);
        Long term8922 = new Long(-1000830646340880796L);
        term8903 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term8903, term8903.getClass(), "id", term8904);
        setField(term8903, term8903.getClass(), "skillId", term8906);
        setField(term8903, term8903.getClass(), "skillName", "HpZXWDPhlg");
        setField(term8903, term8903.getClass(), "experience", term8920);
        setField(term8903, term8903.getClass(), "freelancerId", term8922);
        setField(term8903, term8903.getClass(), "freelancerName", "lBOokzEPfe");
        setField(term8903, term8903.getClass(), "freelancerUName", "dtGZCsKXbW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term8903, args);
    }

};


