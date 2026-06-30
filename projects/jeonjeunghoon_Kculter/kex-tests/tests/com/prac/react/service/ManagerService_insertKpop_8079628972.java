package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerService_insertKpop_8079628972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1382;
     Object term1383;

    public ManagerService_insertKpop_8079628972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1382 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1382, term1382.getClass(), "md", null);
        setField(term1382, term1382.getClass(), "logger", null);
        term1383 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term1383, term1383.getClass(), "keyNum", 865208305);
        setField(term1383, term1383.getClass(), "name", "tShwQLRGNe");
        setIntField(term1383, term1383.getClass(), "likeCount", -1275173084);
        setIntField(term1383, term1383.getClass(), "status", -244121226);
        setField(term1383, term1383.getClass(), "explain", "LvtrsXUliU");
        setField(term1383, term1383.getClass(), "fileUrl", "xLbjWUgOIL");
        setField(term1383, term1383.getClass(), "keyHash", "jDtqGUpnZN");
        setIntField(term1383, term1383.getClass(), "spot", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Celebrity");
        Object[] args = new Object[1];
        args[0] = term1383;
        callMethod(klass, "insertKpop", argTypes, term1382, args);
    }

};


