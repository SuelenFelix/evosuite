package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AliasResource_getId_19459666162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791;

    public AliasResource_getId_19459666162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term792 = new Long(2486810210675247493L);
        term791 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term818 = newInstance(Class.forName("java.util.Date"));
        Object term820 = newInstance(Class.forName("java.util.Date"));
        setField(term791, term791.getClass(), "id", term792);
        setField(term791, term791.getClass(), "name", "dWRymuLBtr");
        setField(term791, term791.getClass(), "email", "AijpHYOFuy");
        setLongField(term818, term818.getClass(), "fastTime", 1442639565302L);
        setField(term818, term818.getClass(), "cdate", null);
        setField(term791, term791.getClass(), "created", term818);
        setLongField(term820, term820.getClass(), "fastTime", 1515890130018L);
        setField(term820, term820.getClass(), "cdate", null);
        setField(term791, term791.getClass(), "updated", term820);
        setBooleanField(term791, term791.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term791, args);
    }

};


