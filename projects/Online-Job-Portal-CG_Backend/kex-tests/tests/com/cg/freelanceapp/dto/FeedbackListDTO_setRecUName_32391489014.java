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

public class FeedbackListDTO_setRecUName_32391489014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15502;

    public FeedbackListDTO_setRecUName_32391489014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15503 = new Long(7006402814669334483L);
        Long term15505 = new Long(-4003544865306793676L);
        Long term15531 = new Long(-769824408235898287L);
        Integer term15557 = new Integer(-14890619);
        term15502 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15502, term15502.getClass(), "id", term15503);
        setField(term15502, term15502.getClass(), "frId", term15505);
        setField(term15502, term15502.getClass(), "freelancerName", "LXnDNrMsqT");
        setField(term15502, term15502.getClass(), "frUName", "ZLQamJFBmu");
        setField(term15502, term15502.getClass(), "recId", term15531);
        setField(term15502, term15502.getClass(), "recruiterName", "ZWcOCwKNvd");
        setField(term15502, term15502.getClass(), "recUName", "GTmoNrziyc");
        setField(term15502, term15502.getClass(), "rating", term15557);
        setField(term15502, term15502.getClass(), "comments", "LvztehSlhM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "njvnWFTMxN";
        callMethod(klass, "setRecUName", argTypes, term15502, args);
    }

};


