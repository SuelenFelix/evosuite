package com.leanstacks.ws.service;

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
import static com.leanstacks.ws.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class EmailServiceBean_sendAsyncWithResult_13889166293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;
     Object term306;

    public EmailServiceBean_sendAsyncWithResult_13889166293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305 = newInstance(Class.forName("com.leanstacks.ws.service.EmailServiceBean"));
        Long term319 = new Long(-8257434502486459194L);
        Integer term359 = new Integer(1484323161);
        term306 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term373 = newInstance(Class.forName("java.time.Instant"));
        Object term388 = newInstance(Class.forName("java.time.Instant"));
        setField(term306, term306.getClass(), "text", "SzjVpOQTyS");
        setField(term306, term306.getClass(), "id", term319);
        setField(term306, term306.getClass(), "referenceId", "661d5b98-c490-4f7d-a2a6-149ae2801fe0");
        setField(term306, term306.getClass(), "version", term359);
        setField(term306, term306.getClass(), "createdBy", "MjGYSRKTNF");
        setLongField(term373, term373.getClass(), "seconds", 1442639565L);
        setIntField(term373, term373.getClass(), "nanos", 302000000);
        setField(term306, term306.getClass(), "createdAt", term373);
        setField(term306, term306.getClass(), "updatedBy", "hRNSzYYIrc");
        setLongField(term388, term388.getClass(), "seconds", 1515890130L);
        setIntField(term388, term388.getClass(), "nanos", 18000000);
        setField(term306, term306.getClass(), "updatedAt", term388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.service.EmailServiceBean");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = term306;
        callMethod(klass, "sendAsyncWithResult", argTypes, term305, args);
    }

};


