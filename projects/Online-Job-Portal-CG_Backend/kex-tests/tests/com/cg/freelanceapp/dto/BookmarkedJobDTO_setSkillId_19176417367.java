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

public class BookmarkedJobDTO_setSkillId_19176417367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5780;
     Object term5787;

    public BookmarkedJobDTO_setSkillId_19176417367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5781 = new Long(-685023850445639859L);
        Long term5783 = new Long(-6950146046121430355L);
        Long term5785 = new Long(1667122142089513324L);
        term5780 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO"));
        setField(term5780, term5780.getClass(), "skillId", term5781);
        setField(term5780, term5780.getClass(), "freelancerId", term5783);
        setField(term5780, term5780.getClass(), "jobId", term5785);
        term5787 = new Long(-6342139649364011743L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5787;
        callMethod(klass, "setSkillId", argTypes, term5780, args);
    }

};


