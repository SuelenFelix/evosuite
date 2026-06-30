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

public class FeedbackListDTO_getRecId_7270784089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14883;

    public FeedbackListDTO_getRecId_7270784089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14884 = new Long(6853972830905120647L);
        Long term14886 = new Long(1442167273909860961L);
        Long term14912 = new Long(6895382576300001141L);
        Integer term14938 = new Integer(1876565163);
        term14883 = newInstance(Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO"));
        setField(term14883, term14883.getClass(), "id", term14884);
        setField(term14883, term14883.getClass(), "frId", term14886);
        setField(term14883, term14883.getClass(), "freelancerName", "epPTwvcoyb");
        setField(term14883, term14883.getClass(), "frUName", "UBPHmOICBs");
        setField(term14883, term14883.getClass(), "recId", term14912);
        setField(term14883, term14883.getClass(), "recruiterName", "IDJUVPgUJf");
        setField(term14883, term14883.getClass(), "recUName", "JmnWRJUxGr");
        setField(term14883, term14883.getClass(), "rating", term14938);
        setField(term14883, term14883.getClass(), "comments", "wgRGBNrTGP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.FeedbackListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecId", argTypes, term14883, args);
    }

};


