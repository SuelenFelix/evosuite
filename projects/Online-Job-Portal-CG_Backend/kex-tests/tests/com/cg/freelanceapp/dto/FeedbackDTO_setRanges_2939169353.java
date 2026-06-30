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
import java.lang.Integer;

public class FeedbackDTO_setRanges_2939169353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term177;

    public FeedbackDTO_setRanges_2939169353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term139 = new Integer(1484323161);
        term138 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackDTO"));
        setField(term138, term138.getClass(), "ranges", term139);
        setField(term138, term138.getClass(), "comments", "SzjVpOQTyS");
        setField(term138, term138.getClass(), "recruiterUName", "MjGYSRKTNF");
        setField(term138, term138.getClass(), "freelancerUName", "hRNSzYYIrc");
        term177 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term177;
        callMethod(klass, "setRanges", argTypes, term138, args);
    }

};


