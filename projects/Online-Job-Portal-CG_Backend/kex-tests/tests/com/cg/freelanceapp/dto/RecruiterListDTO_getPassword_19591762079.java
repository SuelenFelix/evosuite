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

public class RecruiterListDTO_getPassword_19591762079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3741;

    public RecruiterListDTO_getPassword_19591762079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3742 = new Long(-4365849114644724155L);
        term3741 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO"));
        setField(term3741, term3741.getClass(), "id", term3742);
        setField(term3741, term3741.getClass(), "userName", "WzFopsaDuG");
        setField(term3741, term3741.getClass(), "firstName", "PapWxkhEWe");
        setField(term3741, term3741.getClass(), "lastName", "smnHEqRFRx");
        setField(term3741, term3741.getClass(), "password", "XYtryyobou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3741, args);
    }

};


