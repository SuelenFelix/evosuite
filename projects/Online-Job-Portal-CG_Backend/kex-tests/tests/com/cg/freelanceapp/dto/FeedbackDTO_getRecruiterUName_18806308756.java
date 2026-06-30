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

public class FeedbackDTO_getRecruiterUName_18806308756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public FeedbackDTO_getRecruiterUName_18806308756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term370 = new Integer(-1955890973);
        term369 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackDTO"));
        setField(term369, term369.getClass(), "ranges", term370);
        setField(term369, term369.getClass(), "comments", "ZiaGIbnzTs");
        setField(term369, term369.getClass(), "recruiterUName", "tbcdzjIfER");
        setField(term369, term369.getClass(), "freelancerUName", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterUName", argTypes, term369, args);
    }

};


