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

public class FeedbackDTO_setRecruiterUName_14898650917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;

    public FeedbackDTO_setRecruiterUName_14898650917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term439 = new Integer(-2038273078);
        term438 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackDTO"));
        setField(term438, term438.getClass(), "ranges", term439);
        setField(term438, term438.getClass(), "comments", "pCTimMblYc");
        setField(term438, term438.getClass(), "recruiterUName", "hNxWaHcfhY");
        setField(term438, term438.getClass(), "freelancerUName", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setRecruiterUName", argTypes, term438, args);
    }

};


