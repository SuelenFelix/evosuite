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

public class FeedbackListDTO_getId_13741224841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13883;

    public FeedbackListDTO_getId_13741224841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13884 = new Long(-6001151456088965547L);
        Long term13886 = new Long(1740732617708040141L);
        Long term13912 = new Long(3472971833455746664L);
        Integer term13938 = new Integer(-1530420153);
        term13883 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term13883, term13883.getClass(), "id", term13884);
        setField(term13883, term13883.getClass(), "frId", term13886);
        setField(term13883, term13883.getClass(), "freelancerName", "fbnKvthhOz");
        setField(term13883, term13883.getClass(), "frUName", "PGfCDJTBek");
        setField(term13883, term13883.getClass(), "recId", term13912);
        setField(term13883, term13883.getClass(), "recruiterName", "ZwjARhAtHC");
        setField(term13883, term13883.getClass(), "recUName", "XXvscsYBWv");
        setField(term13883, term13883.getClass(), "rating", term13938);
        setField(term13883, term13883.getClass(), "comments", "uePedtiAfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13883, args);
    }

};


