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

public class EmailServiceBean_sendAsync_19137289912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term154;

    public EmailServiceBean_sendAsync_19137289912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("com.leanstacks.ws.service.EmailServiceBean"));
        Long term167 = new Long(6375119433582206027L);
        Integer term207 = new Integer(1162663216);
        term154 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term221 = newInstance(Class.forName("java.time.Instant"));
        Object term236 = newInstance(Class.forName("java.time.Instant"));
        setField(term154, term154.getClass(), "text", "xxtlPwDYFs");
        setField(term154, term154.getClass(), "id", term167);
        setField(term154, term154.getClass(), "referenceId", "3b406700-a402-4972-982a-fd2b0e4f74e1");
        setField(term154, term154.getClass(), "version", term207);
        setField(term154, term154.getClass(), "createdBy", "jJCZpVmanW");
        setLongField(term221, term221.getClass(), "seconds", 1610940182L);
        setIntField(term221, term221.getClass(), "nanos", 830000000);
        setField(term154, term154.getClass(), "createdAt", term221);
        setField(term154, term154.getClass(), "updatedBy", "EGtDIRbSSb");
        setLongField(term236, term236.getClass(), "seconds", 1606045635L);
        setIntField(term236, term236.getClass(), "nanos", 837000000);
        setField(term154, term154.getClass(), "updatedAt", term236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.service.EmailServiceBean");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = term154;
        callMethod(klass, "sendAsync", argTypes, term153, args);
    }

};


