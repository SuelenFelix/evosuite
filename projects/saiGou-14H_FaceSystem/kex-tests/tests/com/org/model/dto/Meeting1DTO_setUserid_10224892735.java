package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Meeting1DTO_setUserid_10224892735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term316;

    public Meeting1DTO_setUserid_10224892735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term278 = new Integer(-1922583790);
        term277 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term277, term277.getClass(), "userid", term278);
        setField(term277, term277.getClass(), "host", "MxlszYVzRf");
        setField(term277, term277.getClass(), "meetingname", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "meetingroom", "oVcInYnLWB");
        term316 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term316;
        callMethod(klass, "setUserid", argTypes, term277, args);
    }

};


