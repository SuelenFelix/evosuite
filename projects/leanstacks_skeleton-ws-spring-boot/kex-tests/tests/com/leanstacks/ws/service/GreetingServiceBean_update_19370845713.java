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

public class GreetingServiceBean_update_19370845713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public GreetingServiceBean_update_19370845713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term626 = new Long(7411271909051562686L);
        Integer term666 = new Integer(-1922583790);
        term613 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term680 = newInstance(Class.forName("java.time.Instant"));
        Object term695 = newInstance(Class.forName("java.time.Instant"));
        setField(term613, term613.getClass(), "text", "MxlszYVzRf");
        setField(term613, term613.getClass(), "id", term626);
        setField(term613, term613.getClass(), "referenceId", "1a9e19d8-0042-419e-a13c-54c3b8bbeb76");
        setField(term613, term613.getClass(), "version", term666);
        setField(term613, term613.getClass(), "createdBy", "LQFpaHEwXR");
        setLongField(term680, term680.getClass(), "seconds", 1645834034L);
        setIntField(term680, term680.getClass(), "nanos", 896000000);
        setField(term613, term613.getClass(), "createdAt", term680);
        setField(term613, term613.getClass(), "updatedBy", "oVcInYnLWB");
        setLongField(term695, term695.getClass(), "seconds", 1500721068L);
        setIntField(term695, term695.getClass(), "nanos", 23000000);
        setField(term613, term613.getClass(), "updatedAt", term695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.service.GreetingServiceBean");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = term613;
        callMethod(klass, "update", argTypes, null, args);
    }

};


