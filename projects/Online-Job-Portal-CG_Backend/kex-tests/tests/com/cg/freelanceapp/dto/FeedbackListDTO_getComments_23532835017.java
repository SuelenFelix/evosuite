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

public class FeedbackListDTO_getComments_23532835017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15883;

    public FeedbackListDTO_getComments_23532835017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15884 = new Long(-8211859616692114655L);
        Long term15886 = new Long(7487838449539103993L);
        Long term15912 = new Long(7010148136855890340L);
        Integer term15938 = new Integer(2055867847);
        term15883 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15883, term15883.getClass(), "id", term15884);
        setField(term15883, term15883.getClass(), "frId", term15886);
        setField(term15883, term15883.getClass(), "freelancerName", "xypryEkUPF");
        setField(term15883, term15883.getClass(), "frUName", "zyZTzHNjQr");
        setField(term15883, term15883.getClass(), "recId", term15912);
        setField(term15883, term15883.getClass(), "recruiterName", "YSrFKQQwXE");
        setField(term15883, term15883.getClass(), "recUName", "qxhOsmyyjm");
        setField(term15883, term15883.getClass(), "rating", term15938);
        setField(term15883, term15883.getClass(), "comments", "DuKcNfVVYR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term15883, args);
    }

};


