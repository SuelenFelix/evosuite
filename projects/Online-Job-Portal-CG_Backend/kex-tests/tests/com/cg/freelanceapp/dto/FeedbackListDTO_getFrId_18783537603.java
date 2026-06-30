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

public class FeedbackListDTO_getFrId_18783537603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14123;

    public FeedbackListDTO_getFrId_18783537603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14124 = new Long(-278716491237139968L);
        Long term14126 = new Long(-629491722907628764L);
        Long term14152 = new Long(-5552123402871285352L);
        Integer term14178 = new Integer(-1145578966);
        term14123 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14123, term14123.getClass(), "id", term14124);
        setField(term14123, term14123.getClass(), "frId", term14126);
        setField(term14123, term14123.getClass(), "freelancerName", "EWFbEDAVrE");
        setField(term14123, term14123.getClass(), "frUName", "EMiMtYgfvr");
        setField(term14123, term14123.getClass(), "recId", term14152);
        setField(term14123, term14123.getClass(), "recruiterName", "OyYyYYnJuF");
        setField(term14123, term14123.getClass(), "recUName", "aYLvcxZohT");
        setField(term14123, term14123.getClass(), "rating", term14178);
        setField(term14123, term14123.getClass(), "comments", "mnHyQbMyld");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrId", argTypes, term14123, args);
    }

};


