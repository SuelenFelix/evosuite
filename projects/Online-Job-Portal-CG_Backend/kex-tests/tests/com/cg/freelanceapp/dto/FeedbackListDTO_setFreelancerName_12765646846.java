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

public class FeedbackListDTO_setFreelancerName_12765646846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14482;

    public FeedbackListDTO_setFreelancerName_12765646846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14483 = new Long(-1465819833800717311L);
        Long term14485 = new Long(-8306611953768020559L);
        Long term14511 = new Long(-8692119547314358088L);
        Integer term14537 = new Integer(767834723);
        term14482 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14482, term14482.getClass(), "id", term14483);
        setField(term14482, term14482.getClass(), "frId", term14485);
        setField(term14482, term14482.getClass(), "freelancerName", "ndAITnOsny");
        setField(term14482, term14482.getClass(), "frUName", "CVZnTiJucs");
        setField(term14482, term14482.getClass(), "recId", term14511);
        setField(term14482, term14482.getClass(), "recruiterName", "ecHEQufXoq");
        setField(term14482, term14482.getClass(), "recUName", "btBLMvHzJg");
        setField(term14482, term14482.getClass(), "rating", term14537);
        setField(term14482, term14482.getClass(), "comments", "JdOMfNWgLP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWqXrwAsDU";
        callMethod(klass, "setFreelancerName", argTypes, term14482, args);
    }

};


