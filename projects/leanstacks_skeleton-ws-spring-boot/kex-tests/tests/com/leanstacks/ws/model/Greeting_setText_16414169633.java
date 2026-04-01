package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class Greeting_setText_16414169633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4773;

    public Greeting_setText_16414169633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4786 = new Long(6855071767938501807L);
        Integer term4826 = new Integer(-117576464);
        term4773 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term4840 = newInstance(Class.forName("java.time.Instant"));
        Object term4855 = newInstance(Class.forName("java.time.Instant"));
        setField(term4773, term4773.getClass(), "text", "iNwOJRBEjp");
        setField(term4773, term4773.getClass(), "id", term4786);
        setField(term4773, term4773.getClass(), "referenceId", "5ec461d5-0b3b-4962-b09e-a58fa432c7a3");
        setField(term4773, term4773.getClass(), "version", term4826);
        setField(term4773, term4773.getClass(), "createdBy", "XylxrMBraH");
        setLongField(term4840, term4840.getClass(), "seconds", 1345923503L);
        setIntField(term4840, term4840.getClass(), "nanos", 543000000);
        setField(term4773, term4773.getClass(), "createdAt", term4840);
        setField(term4773, term4773.getClass(), "updatedBy", "pORebkoRdD");
        setLongField(term4855, term4855.getClass(), "seconds", 1838357779L);
        setIntField(term4855, term4855.getClass(), "nanos", 277000000);
        setField(term4773, term4773.getClass(), "updatedAt", term4855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Greeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "setText", argTypes, term4773, args);
    }

};


