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

public class FeedbackListDTO_setRating_201623532616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15762;
     Object term15831;

    public FeedbackListDTO_setRating_201623532616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15763 = new Long(-4058686252500969842L);
        Long term15765 = new Long(6077991958696417121L);
        Long term15791 = new Long(-5004803270846838598L);
        Integer term15817 = new Integer(454281060);
        term15762 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15762, term15762.getClass(), "id", term15763);
        setField(term15762, term15762.getClass(), "frId", term15765);
        setField(term15762, term15762.getClass(), "freelancerName", "HEaTkWYBgv");
        setField(term15762, term15762.getClass(), "frUName", "MpJsPKLTIU");
        setField(term15762, term15762.getClass(), "recId", term15791);
        setField(term15762, term15762.getClass(), "recruiterName", "IiNCZfdouL");
        setField(term15762, term15762.getClass(), "recUName", "AhOHzCsHKW");
        setField(term15762, term15762.getClass(), "rating", term15817);
        setField(term15762, term15762.getClass(), "comments", "UqgLPaaAHi");
        term15831 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term15831;
        callMethod(klass, "setRating", argTypes, term15762, args);
    }

};


