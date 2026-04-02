package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class SkillServiceImpl_update_13820493828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895;
     Object term897;

    public SkillServiceImpl_update_13820493828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895 = new Long(4178434741742309755L);
        Long term898 = new Long(-2068172595987555756L);
        term897 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        setField(term897, term897.getClass(), "id", term898);
        setField(term897, term897.getClass(), "name", "kuTXqwMtDB");
        setField(term897, term897.getClass(), "description", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.SkillServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.cg.freelanceapp.entities.Skill");
        Object[] args = new Object[2];
        args[0] = term895;
        args[1] = term897;
        callMethod(klass, "update", argTypes, null, args);
    }

};


