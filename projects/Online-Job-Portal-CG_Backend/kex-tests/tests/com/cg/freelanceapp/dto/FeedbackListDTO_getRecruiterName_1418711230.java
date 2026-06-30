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

public class FeedbackListDTO_getRecruiterName_1418711230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16153;

    public FeedbackListDTO_getRecruiterName_1418711230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16153 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term16153, term16153.getClass(), "id", null);
        setField(term16153, term16153.getClass(), "frId", null);
        setField(term16153, term16153.getClass(), "freelancerName", null);
        setField(term16153, term16153.getClass(), "frUName", null);
        setField(term16153, term16153.getClass(), "recId", null);
        setField(term16153, term16153.getClass(), "recruiterName", null);
        setField(term16153, term16153.getClass(), "recUName", null);
        setField(term16153, term16153.getClass(), "rating", null);
        setField(term16153, term16153.getClass(), "comments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterName", argTypes, term16153, args);
    }

};


