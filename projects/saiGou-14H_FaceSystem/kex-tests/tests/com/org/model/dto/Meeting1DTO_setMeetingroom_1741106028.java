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

public class Meeting1DTO_setMeetingroom_1741106028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;

    public Meeting1DTO_setMeetingroom_1741106028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term531 = new Integer(1227103734);
        term530 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term530, term530.getClass(), "userid", term531);
        setField(term530, term530.getClass(), "host", "eZFUvlxvGV");
        setField(term530, term530.getClass(), "meetingname", "BYqFIqCKAV");
        setField(term530, term530.getClass(), "meetingroom", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setMeetingroom", argTypes, term530, args);
    }

};


