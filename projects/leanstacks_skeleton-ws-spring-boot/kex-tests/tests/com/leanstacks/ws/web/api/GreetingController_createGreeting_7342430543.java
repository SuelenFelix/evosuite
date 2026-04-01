package com.leanstacks.ws.web.api;

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
import static com.leanstacks.ws.web.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class GreetingController_createGreeting_7342430543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360;
     Object term361;

    public GreetingController_createGreeting_7342430543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360 = newInstance(Class.forName("com.leanstacks.ws.web.api.GreetingController"));
        setField(term360, term360.getClass(), "greetingService", null);
        setField(term360, term360.getClass(), "emailService", null);
        Long term374 = new Long(6375119433582206027L);
        Integer term414 = new Integer(568599855);
        term361 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term428 = newInstance(Class.forName("java.time.Instant"));
        Object term443 = newInstance(Class.forName("java.time.Instant"));
        setField(term361, term361.getClass(), "text", "EGtDIRbSSb");
        setField(term361, term361.getClass(), "id", term374);
        setField(term361, term361.getClass(), "referenceId", "69b842e3-7471-4455-b057-468bca5fbb0b");
        setField(term361, term361.getClass(), "version", term414);
        setField(term361, term361.getClass(), "createdBy", "SzjVpOQTyS");
        setLongField(term428, term428.getClass(), "seconds", 1480438351L);
        setIntField(term428, term428.getClass(), "nanos", 369000000);
        setField(term361, term361.getClass(), "createdAt", term428);
        setField(term361, term361.getClass(), "updatedBy", "MjGYSRKTNF");
        setLongField(term443, term443.getClass(), "seconds", 1610940182L);
        setIntField(term443, term443.getClass(), "nanos", 830000000);
        setField(term361, term361.getClass(), "updatedAt", term443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.GreetingController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = term361;
        callMethod(klass, "createGreeting", argTypes, term360, args);
    }

};


