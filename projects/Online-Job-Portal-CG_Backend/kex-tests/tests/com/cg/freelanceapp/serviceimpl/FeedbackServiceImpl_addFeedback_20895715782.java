package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FeedbackServiceImpl_addFeedback_20895715782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342;

    public FeedbackServiceImpl_addFeedback_20895715782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term343 = new Integer(1484323161);
        term342 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackDTO"));
        setField(term342, term342.getClass(), "ranges", term343);
        setField(term342, term342.getClass(), "comments", "LQFpaHEwXR");
        setField(term342, term342.getClass(), "recruiterUName", "oVcInYnLWB");
        setField(term342, term342.getClass(), "freelancerUName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.FeedbackServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.FeedbackDTO");
        Object[] args = new Object[1];
        args[0] = term342;
        callMethod(klass, "addFeedback", argTypes, null, args);
    }

};


