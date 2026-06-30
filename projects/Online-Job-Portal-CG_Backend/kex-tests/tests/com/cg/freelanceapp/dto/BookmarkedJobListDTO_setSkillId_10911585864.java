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

public class BookmarkedJobListDTO_setSkillId_10911585864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7766;
     Object term7811;

    public BookmarkedJobListDTO_setSkillId_10911585864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7767 = new Long(7489064039921396098L);
        Long term7769 = new Long(6843866297465638866L);
        Long term7783 = new Long(-4023935540989049732L);
        Long term7797 = new Long(855932984568615096L);
        term7766 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term7766, term7766.getClass(), "id", term7767);
        setField(term7766, term7766.getClass(), "skillId", term7769);
        setField(term7766, term7766.getClass(), "skillName", "hePqROaplw");
        setField(term7766, term7766.getClass(), "freelancerId", term7783);
        setField(term7766, term7766.getClass(), "freelancerName", "PJcSNDruWd");
        setField(term7766, term7766.getClass(), "jobId", term7797);
        setField(term7766, term7766.getClass(), "jobName", "VVNNlAePXF");
        term7811 = new Long(-1616722610139554082L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7811;
        callMethod(klass, "setSkillId", argTypes, term7766, args);
    }

};


