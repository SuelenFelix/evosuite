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

public class UserDTO_getUsername_12153355097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3893;

    public UserDTO_getUsername_12153355097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3908 = new Integer(-375014958);
        Integer term3910 = new Integer(1107176718);
        ArrayList term3906 = new ArrayList();
        ((ArrayList) term3906).add(term3908);
        ((ArrayList) term3906).add(term3910);
        Integer term3914 = new Integer(480137250);
        term3893 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term3893, term3893.getClass(), "Type", "aWYOWZFyaX");
        setField(term3893, term3893.getClass(), "idList", term3906);
        setField(term3893, term3893.getClass(), "meetingid", term3914);
        setField(term3893, term3893.getClass(), "email", "BRIVNtfUWU");
        setField(term3893, term3893.getClass(), "username", "DbiCVtPPCT");
        setField(term3893, term3893.getClass(), "base64Face", "WzFopsaDuG");
        setField(term3893, term3893.getClass(), "oldpassword", "PapWxkhEWe");
        setField(term3893, term3893.getClass(), "newpassword", "smnHEqRFRx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term3893, args);
    }

};


