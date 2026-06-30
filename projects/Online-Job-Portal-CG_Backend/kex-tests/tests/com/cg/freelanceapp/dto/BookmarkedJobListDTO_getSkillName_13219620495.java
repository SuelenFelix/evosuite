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

public class BookmarkedJobListDTO_getSkillName_13219620495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7843;

    public BookmarkedJobListDTO_getSkillName_13219620495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7844 = new Long(7495904023107549024L);
        Long term7846 = new Long(8802866251294305945L);
        Long term7860 = new Long(4513004407927379358L);
        Long term7874 = new Long(-7115418542247301000L);
        term7843 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term7843, term7843.getClass(), "id", term7844);
        setField(term7843, term7843.getClass(), "skillId", term7846);
        setField(term7843, term7843.getClass(), "skillName", "jnwVnmKAFv");
        setField(term7843, term7843.getClass(), "freelancerId", term7860);
        setField(term7843, term7843.getClass(), "freelancerName", "TXyHhqeCjR");
        setField(term7843, term7843.getClass(), "jobId", term7874);
        setField(term7843, term7843.getClass(), "jobName", "lZIgPZPgTu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillName", argTypes, term7843, args);
    }

};


