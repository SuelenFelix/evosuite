package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SkillExperience_setFreelancer_158110656411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21763;

    public SkillExperience_setFreelancer_158110656411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21763 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term21763, term21763.getClass(), "id", null);
        setField(term21763, term21763.getClass(), "skill", null);
        setField(term21763, term21763.getClass(), "years", null);
        setField(term21763, term21763.getClass(), "freelancer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.SkillExperience");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFreelancer", argTypes, term21763, args);
    }

};


