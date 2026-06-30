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

public class FeedbackListDTO_getFrUName_10431711267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14623;

    public FeedbackListDTO_getFrUName_10431711267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14624 = new Long(-2083524977884307536L);
        Long term14626 = new Long(-2691996476200751382L);
        Long term14652 = new Long(-3806202176947356197L);
        Integer term14678 = new Integer(-602026508);
        term14623 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14623, term14623.getClass(), "id", term14624);
        setField(term14623, term14623.getClass(), "frId", term14626);
        setField(term14623, term14623.getClass(), "freelancerName", "hgFbWAUtsu");
        setField(term14623, term14623.getClass(), "frUName", "HqoTWlkbwF");
        setField(term14623, term14623.getClass(), "recId", term14652);
        setField(term14623, term14623.getClass(), "recruiterName", "CwNELDTAPP");
        setField(term14623, term14623.getClass(), "recUName", "GSzQdbHLHw");
        setField(term14623, term14623.getClass(), "rating", term14678);
        setField(term14623, term14623.getClass(), "comments", "IkfarsYNJO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrUName", argTypes, term14623, args);
    }

};


