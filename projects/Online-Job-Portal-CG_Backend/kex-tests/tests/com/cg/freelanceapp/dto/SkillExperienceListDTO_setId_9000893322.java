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

public class SkillExperienceListDTO_setId_9000893322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8826;
     Object term8871;

    public SkillExperienceListDTO_setId_9000893322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8827 = new Long(-6673920710396545553L);
        Long term8829 = new Long(3412644969878030772L);
        Integer term8843 = new Integer(-883034806);
        Long term8845 = new Long(6698455537431331246L);
        term8826 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term8826, term8826.getClass(), "id", term8827);
        setField(term8826, term8826.getClass(), "skillId", term8829);
        setField(term8826, term8826.getClass(), "skillName", "pFAfANnxup");
        setField(term8826, term8826.getClass(), "experience", term8843);
        setField(term8826, term8826.getClass(), "freelancerId", term8845);
        setField(term8826, term8826.getClass(), "freelancerName", "FbSIUZyBXZ");
        setField(term8826, term8826.getClass(), "freelancerUName", "mhQDwIyrRi");
        term8871 = new Long(-8327432141027603933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8871;
        callMethod(klass, "setId", argTypes, term8826, args);
    }

};


