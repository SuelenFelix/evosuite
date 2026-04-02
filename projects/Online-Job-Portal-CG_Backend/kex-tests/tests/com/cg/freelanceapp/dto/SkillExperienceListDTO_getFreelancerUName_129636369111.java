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

public class SkillExperienceListDTO_getFreelancerUName_129636369111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9551;

    public SkillExperienceListDTO_getFreelancerUName_129636369111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9552 = new Long(860079646007397083L);
        Long term9554 = new Long(3230472384687362867L);
        Integer term9568 = new Integer(-2068769794);
        Long term9570 = new Long(-1145146470850585022L);
        term9551 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9551, term9551.getClass(), "id", term9552);
        setField(term9551, term9551.getClass(), "skillId", term9554);
        setField(term9551, term9551.getClass(), "skillName", "oKwCDqywym");
        setField(term9551, term9551.getClass(), "experience", term9568);
        setField(term9551, term9551.getClass(), "freelancerId", term9570);
        setField(term9551, term9551.getClass(), "freelancerName", "zjZYTddemL");
        setField(term9551, term9551.getClass(), "freelancerUName", "QtrylgCLiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerUName", argTypes, term9551, args);
    }

};


