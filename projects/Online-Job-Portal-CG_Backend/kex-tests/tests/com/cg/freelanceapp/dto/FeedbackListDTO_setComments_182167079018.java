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

public class FeedbackListDTO_setComments_182167079018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16002;

    public FeedbackListDTO_setComments_182167079018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16003 = new Long(-6771377873268167033L);
        Long term16005 = new Long(1278107327214302894L);
        Long term16031 = new Long(3104349415269466587L);
        Integer term16057 = new Integer(-1048298087);
        term16002 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term16002, term16002.getClass(), "id", term16003);
        setField(term16002, term16002.getClass(), "frId", term16005);
        setField(term16002, term16002.getClass(), "freelancerName", "fRujHWvXjJ");
        setField(term16002, term16002.getClass(), "frUName", "EAIAAStlTz");
        setField(term16002, term16002.getClass(), "recId", term16031);
        setField(term16002, term16002.getClass(), "recruiterName", "yIWXcOQTgy");
        setField(term16002, term16002.getClass(), "recUName", "xAWekqanqc");
        setField(term16002, term16002.getClass(), "rating", term16057);
        setField(term16002, term16002.getClass(), "comments", "GSOWFHMlbF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vpZIqpFbKM";
        callMethod(klass, "setComments", argTypes, term16002, args);
    }

};


