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
import java.util.ArrayList;
import java.lang.Integer;

public class UserDTO_getMeetingid_9826345005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;

    public UserDTO_getMeetingid_9826345005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3616 = new Integer(-1963434938);
        ArrayList term3614 = new ArrayList();
        ((ArrayList) term3614).add(term3616);
        Integer term3620 = new Integer(906181092);
        term3601 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term3601, term3601.getClass(), "Type", "HzqpegHiRq");
        setField(term3601, term3601.getClass(), "idList", term3614);
        setField(term3601, term3601.getClass(), "meetingid", term3620);
        setField(term3601, term3601.getClass(), "email", "jwsfVjMoJT");
        setField(term3601, term3601.getClass(), "username", "ZfdXfCCFDf");
        setField(term3601, term3601.getClass(), "base64Face", "MwwjNtdOFT");
        setField(term3601, term3601.getClass(), "oldpassword", "VYkqXKVlAJ");
        setField(term3601, term3601.getClass(), "newpassword", "XkIoWJRNwN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingid", argTypes, term3601, args);
    }

};


