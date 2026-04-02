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

public class BookmarkedFreelancerListDTO_getRecruiterName_8646663157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13315;

    public BookmarkedFreelancerListDTO_getRecruiterName_8646663157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13316 = new Long(-2136893352275781569L);
        term13315 = newInstance(Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO"));
        setField(term13315, term13315.getClass(), "id", term13316);
        setField(term13315, term13315.getClass(), "freelancerName", "VBUahCvyxC");
        setField(term13315, term13315.getClass(), "freelancerUName", "MlzTkzKMCX");
        setField(term13315, term13315.getClass(), "recruiterName", "UqKUbMyPMJ");
        setField(term13315, term13315.getClass(), "recruiterUName", "QpYltHAdyY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterName", argTypes, term13315, args);
    }

};


