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

public class SkillExperienceListDTO_setFreelancerUName_2720654912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9626;

    public SkillExperienceListDTO_setFreelancerUName_2720654912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9627 = new Long(1993646237353405740L);
        Long term9629 = new Long(-4043093655001688454L);
        Integer term9643 = new Integer(-117576464);
        Long term9645 = new Long(-419800263764810394L);
        term9626 = newInstance(Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO"));
        setField(term9626, term9626.getClass(), "id", term9627);
        setField(term9626, term9626.getClass(), "skillId", term9629);
        setField(term9626, term9626.getClass(), "skillName", "orEuhCStGM");
        setField(term9626, term9626.getClass(), "experience", term9643);
        setField(term9626, term9626.getClass(), "freelancerId", term9645);
        setField(term9626, term9626.getClass(), "freelancerName", "HhEaSXWvrY");
        setField(term9626, term9626.getClass(), "freelancerUName", "CVRGEomOth");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.SkillExperienceListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vSeruUyNWX";
        callMethod(klass, "setFreelancerUName", argTypes, term9626, args);
    }

};


