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

public class FeedbackListDTO_setRecId_128042451010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15002;
     Object term15071;

    public FeedbackListDTO_setRecId_128042451010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15003 = new Long(9062006526792682783L);
        Long term15005 = new Long(-7400951017937830861L);
        Long term15031 = new Long(-8993073054427011802L);
        Integer term15057 = new Integer(-817164822);
        term15002 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term15002, term15002.getClass(), "id", term15003);
        setField(term15002, term15002.getClass(), "frId", term15005);
        setField(term15002, term15002.getClass(), "freelancerName", "FIdNVptZpW");
        setField(term15002, term15002.getClass(), "frUName", "rQjxAhisjm");
        setField(term15002, term15002.getClass(), "recId", term15031);
        setField(term15002, term15002.getClass(), "recruiterName", "ZDhASPHjDG");
        setField(term15002, term15002.getClass(), "recUName", "HNVOAXYNEZ");
        setField(term15002, term15002.getClass(), "rating", term15057);
        setField(term15002, term15002.getClass(), "comments", "gbbYBYyfvr");
        term15071 = new Long(2287785643837657068L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term15071;
        callMethod(klass, "setRecId", argTypes, term15002, args);
    }

};


