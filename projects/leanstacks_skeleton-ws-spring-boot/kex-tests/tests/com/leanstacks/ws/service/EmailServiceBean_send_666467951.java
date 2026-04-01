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

public class EmailServiceBean_send_666467951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public EmailServiceBean_send_666467951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.leanstacks.ws.service.EmailServiceBean"));
        Long term15 = new Long(2442117782898005296L);
        Integer term55 = new Integer(568599855);
        term2 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term69 = newInstance(Class.forName("java.time.Instant"));
        Object term84 = newInstance(Class.forName("java.time.Instant"));
        setField(term2, term2.getClass(), "text", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "id", term15);
        setField(term2, term2.getClass(), "referenceId", "1eae9776-534e-4bc5-8a04-48e63b36c136");
        setField(term2, term2.getClass(), "version", term55);
        setField(term2, term2.getClass(), "createdBy", "sjlJAEtRrb");
        setLongField(term69, term69.getClass(), "seconds", 1345871412L);
        setIntField(term69, term69.getClass(), "nanos", 244000000);
        setField(term2, term2.getClass(), "createdAt", term69);
        setField(term2, term2.getClass(), "updatedBy", "MuLcgQHgqz");
        setLongField(term84, term84.getClass(), "seconds", 1480438351L);
        setIntField(term84, term84.getClass(), "nanos", 369000000);
        setField(term2, term2.getClass(), "updatedAt", term84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.service.EmailServiceBean");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "send", argTypes, term1, args);
    }

};


