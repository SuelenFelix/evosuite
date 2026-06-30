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

public class FeedbackDTO_getComments_19233652204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public FeedbackDTO_getComments_19233652204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term210 = new Integer(-1922583790);
        term209 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackDTO"));
        setField(term209, term209.getClass(), "ranges", term210);
        setField(term209, term209.getClass(), "comments", "RMFIsYGgne");
        setField(term209, term209.getClass(), "recruiterUName", "NRdvgJlhkX");
        setField(term209, term209.getClass(), "freelancerUName", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term209, args);
    }

};


