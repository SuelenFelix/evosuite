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

public class SkillExperienceListDTO_setSkillId_6454912574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8978;
     Object term9023;

    public SkillExperienceListDTO_setSkillId_6454912574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8979 = new Long(5973526439563541711L);
        Long term8981 = new Long(5246058710498845622L);
        Integer term8995 = new Integer(597278769);
        Long term8997 = new Long(4394651392080968777L);
        term8978 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term8978, term8978.getClass(), "id", term8979);
        setField(term8978, term8978.getClass(), "skillId", term8981);
        setField(term8978, term8978.getClass(), "skillName", "bdyhHbDAmJ");
        setField(term8978, term8978.getClass(), "experience", term8995);
        setField(term8978, term8978.getClass(), "freelancerId", term8997);
        setField(term8978, term8978.getClass(), "freelancerName", "BBXiTNHqGE");
        setField(term8978, term8978.getClass(), "freelancerUName", "IEYhJmgCVd");
        term9023 = new Long(-7310273014364148916L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term9023;
        callMethod(klass, "setSkillId", argTypes, term8978, args);
    }

};


