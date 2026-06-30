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

public class FeedbackListDTO_getRecruiterName_1418711211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15123;

    public FeedbackListDTO_getRecruiterName_1418711211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15124 = new Long(-7283193381993602128L);
        Long term15126 = new Long(6351887424140565471L);
        Long term15152 = new Long(6273670659288205855L);
        Integer term15178 = new Integer(-1016503459);
        term15123 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15123, term15123.getClass(), "id", term15124);
        setField(term15123, term15123.getClass(), "frId", term15126);
        setField(term15123, term15123.getClass(), "freelancerName", "SrWMUlbtWV");
        setField(term15123, term15123.getClass(), "frUName", "VePIumgrrU");
        setField(term15123, term15123.getClass(), "recId", term15152);
        setField(term15123, term15123.getClass(), "recruiterName", "DPwIqlszZo");
        setField(term15123, term15123.getClass(), "recUName", "mNgDshwZNc");
        setField(term15123, term15123.getClass(), "rating", term15178);
        setField(term15123, term15123.getClass(), "comments", "pDqgDbJoFw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterName", argTypes, term15123, args);
    }

};


