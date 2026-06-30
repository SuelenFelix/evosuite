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

public class BookmarkedFreelancerListDTO_setRecruiterName_5757736858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13406;

    public BookmarkedFreelancerListDTO_setRecruiterName_5757736858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13407 = new Long(-9147545274054597570L);
        term13406 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO"));
        setField(term13406, term13406.getClass(), "id", term13407);
        setField(term13406, term13406.getClass(), "freelancerName", "lbmSGBwIiV");
        setField(term13406, term13406.getClass(), "freelancerUName", "DAxyHoTLzZ");
        setField(term13406, term13406.getClass(), "recruiterName", "fhZgTouhCC");
        setField(term13406, term13406.getClass(), "recruiterUName", "wrikqJwXvL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiWhvbypdr";
        callMethod(klass, "setRecruiterName", argTypes, term13406, args);
    }

};


