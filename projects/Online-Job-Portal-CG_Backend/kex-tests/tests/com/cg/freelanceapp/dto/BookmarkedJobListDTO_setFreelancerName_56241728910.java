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

public class BookmarkedJobListDTO_setFreelancerName_56241728910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8242;

    public BookmarkedJobListDTO_setFreelancerName_56241728910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8243 = new Long(-1539859611880912454L);
        Long term8245 = new Long(4100236067313034103L);
        Long term8259 = new Long(1195529027276497124L);
        Long term8273 = new Long(-2783999800714825789L);
        term8242 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO"));
        setField(term8242, term8242.getClass(), "id", term8243);
        setField(term8242, term8242.getClass(), "skillId", term8245);
        setField(term8242, term8242.getClass(), "skillName", "qFGKIJjlmV");
        setField(term8242, term8242.getClass(), "freelancerId", term8259);
        setField(term8242, term8242.getClass(), "freelancerName", "IHqvyhMtuM");
        setField(term8242, term8242.getClass(), "jobId", term8273);
        setField(term8242, term8242.getClass(), "jobName", "dAldIGYAXV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedJobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLwibAPEsa";
        callMethod(klass, "setFreelancerName", argTypes, term8242, args);
    }

};


