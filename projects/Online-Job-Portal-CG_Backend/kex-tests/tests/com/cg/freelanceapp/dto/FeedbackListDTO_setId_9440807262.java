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

public class FeedbackListDTO_setId_9440807262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14002;
     Object term14071;

    public FeedbackListDTO_setId_9440807262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14003 = new Long(3731931947533293029L);
        Long term14005 = new Long(9214973322210954344L);
        Long term14031 = new Long(3662777917800385964L);
        Integer term14057 = new Integer(-469968304);
        term14002 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14002, term14002.getClass(), "id", term14003);
        setField(term14002, term14002.getClass(), "frId", term14005);
        setField(term14002, term14002.getClass(), "freelancerName", "AdSHvysxQB");
        setField(term14002, term14002.getClass(), "frUName", "jlraKkBWFA");
        setField(term14002, term14002.getClass(), "recId", term14031);
        setField(term14002, term14002.getClass(), "recruiterName", "mRBtFTxVdE");
        setField(term14002, term14002.getClass(), "recUName", "IVacFDAZcj");
        setField(term14002, term14002.getClass(), "rating", term14057);
        setField(term14002, term14002.getClass(), "comments", "EEYmuwyVDP");
        term14071 = new Long(-7005300544167632229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term14071;
        callMethod(klass, "setId", argTypes, term14002, args);
    }

};


