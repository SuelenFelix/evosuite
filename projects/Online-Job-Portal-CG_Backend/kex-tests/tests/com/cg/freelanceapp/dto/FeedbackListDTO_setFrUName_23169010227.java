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

public class FeedbackListDTO_setFrUName_23169010227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16150;

    public FeedbackListDTO_setFrUName_23169010227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16150 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term16150, term16150.getClass(), "id", null);
        setField(term16150, term16150.getClass(), "frId", null);
        setField(term16150, term16150.getClass(), "freelancerName", null);
        setField(term16150, term16150.getClass(), "frUName", null);
        setField(term16150, term16150.getClass(), "recId", null);
        setField(term16150, term16150.getClass(), "recruiterName", null);
        setField(term16150, term16150.getClass(), "recUName", null);
        setField(term16150, term16150.getClass(), "rating", null);
        setField(term16150, term16150.getClass(), "comments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFrUName", argTypes, term16150, args);
    }

};


