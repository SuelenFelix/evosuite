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

public class FeedbackListDTO_setComments_182167079037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16160;

    public FeedbackListDTO_setComments_182167079037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16160 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term16160, term16160.getClass(), "id", null);
        setField(term16160, term16160.getClass(), "frId", null);
        setField(term16160, term16160.getClass(), "freelancerName", null);
        setField(term16160, term16160.getClass(), "frUName", null);
        setField(term16160, term16160.getClass(), "recId", null);
        setField(term16160, term16160.getClass(), "recruiterName", null);
        setField(term16160, term16160.getClass(), "recUName", null);
        setField(term16160, term16160.getClass(), "rating", null);
        setField(term16160, term16160.getClass(), "comments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setComments", argTypes, term16160, args);
    }

};


