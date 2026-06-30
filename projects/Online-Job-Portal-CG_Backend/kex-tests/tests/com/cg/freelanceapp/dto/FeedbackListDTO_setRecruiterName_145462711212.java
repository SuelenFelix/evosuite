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
import java.lang.Integer;

public class FeedbackListDTO_setRecruiterName_145462711212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15242;

    public FeedbackListDTO_setRecruiterName_145462711212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15243 = new Long(-4776514981294468834L);
        Long term15245 = new Long(-7273680182770718108L);
        Long term15271 = new Long(-421166328269063791L);
        Integer term15297 = new Integer(-1968847291);
        term15242 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15242, term15242.getClass(), "id", term15243);
        setField(term15242, term15242.getClass(), "frId", term15245);
        setField(term15242, term15242.getClass(), "freelancerName", "iVOvTzOxwt");
        setField(term15242, term15242.getClass(), "frUName", "BjZQdecXvB");
        setField(term15242, term15242.getClass(), "recId", term15271);
        setField(term15242, term15242.getClass(), "recruiterName", "iUkOOQhEkw");
        setField(term15242, term15242.getClass(), "recUName", "wmVoFoUVmU");
        setField(term15242, term15242.getClass(), "rating", term15297);
        setField(term15242, term15242.getClass(), "comments", "lLiSiPCciB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsMKIIEwdR";
        callMethod(klass, "setRecruiterName", argTypes, term15242, args);
    }

};


