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

public class Meeting1DTO_setMeetingname_465974348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3982;

    public Meeting1DTO_setMeetingname_465974348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3983 = new Integer(-1516568587);
        term3982 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term3982, term3982.getClass(), "userid", term3983);
        setField(term3982, term3982.getClass(), "host", "HieTCBVeDD");
        setField(term3982, term3982.getClass(), "meetingname", "cTSwYlchXv");
        setField(term3982, term3982.getClass(), "meetingroom", "QbalcMEEdv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xiYIPdzlXo";
        callMethod(klass, "setMeetingname", argTypes, term3982, args);
    }

};


