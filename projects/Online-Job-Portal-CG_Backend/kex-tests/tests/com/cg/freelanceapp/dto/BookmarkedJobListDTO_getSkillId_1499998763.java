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

public class BookmarkedJobListDTO_getSkillId_1499998763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7691;

    public BookmarkedJobListDTO_getSkillId_1499998763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7692 = new Long(-1804015692891701666L);
        Long term7694 = new Long(-6432617521836576658L);
        Long term7708 = new Long(-2255965562447970862L);
        Long term7722 = new Long(148047808219672941L);
        term7691 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term7691, term7691.getClass(), "id", term7692);
        setField(term7691, term7691.getClass(), "skillId", term7694);
        setField(term7691, term7691.getClass(), "skillName", "HwLHeGLyhe");
        setField(term7691, term7691.getClass(), "freelancerId", term7708);
        setField(term7691, term7691.getClass(), "freelancerName", "RDnkgWkcbz");
        setField(term7691, term7691.getClass(), "jobId", term7722);
        setField(term7691, term7691.getClass(), "jobName", "IBpaxltauX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term7691, args);
    }

};


