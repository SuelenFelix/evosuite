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

public class FeedbackListDTO_getRecUName_126242755013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15383;

    public FeedbackListDTO_getRecUName_126242755013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15384 = new Long(4811527754205378980L);
        Long term15386 = new Long(9174730812791817537L);
        Long term15412 = new Long(8024477479047145752L);
        Integer term15438 = new Integer(579005622);
        term15383 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15383, term15383.getClass(), "id", term15384);
        setField(term15383, term15383.getClass(), "frId", term15386);
        setField(term15383, term15383.getClass(), "freelancerName", "RbQmXqfXAT");
        setField(term15383, term15383.getClass(), "frUName", "fcCAsvfBbe");
        setField(term15383, term15383.getClass(), "recId", term15412);
        setField(term15383, term15383.getClass(), "recruiterName", "mUNcKUxghj");
        setField(term15383, term15383.getClass(), "recUName", "lnvLKbtveE");
        setField(term15383, term15383.getClass(), "rating", term15438);
        setField(term15383, term15383.getClass(), "comments", "FfrrEhTHzQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecUName", argTypes, term15383, args);
    }

};


