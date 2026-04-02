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

public class BookmarkedFreelancerListDTO_setFreelancerUName_15447372626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13202;

    public BookmarkedFreelancerListDTO_setFreelancerUName_15447372626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13203 = new Long(-7205236974351118210L);
        term13202 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO"));
        setField(term13202, term13202.getClass(), "id", term13203);
        setField(term13202, term13202.getClass(), "freelancerName", "ncSPTkhKjO");
        setField(term13202, term13202.getClass(), "freelancerUName", "jcWKHRWhyj");
        setField(term13202, term13202.getClass(), "recruiterName", "nrQjODRMLD");
        setField(term13202, term13202.getClass(), "recruiterUName", "PNoWXrsFic");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QZBHZqZope";
        callMethod(klass, "setFreelancerUName", argTypes, term13202, args);
    }

};


