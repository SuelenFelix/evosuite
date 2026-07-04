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

public class UserDTO_toString_149006136520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5891;

    public UserDTO_toString_149006136520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5906 = new Integer(729658803);
        Integer term5908 = new Integer(114754804);
        Integer term5910 = new Integer(1687361082);
        Integer term5912 = new Integer(584893196);
        ArrayList term5904 = new ArrayList();
        ((ArrayList) term5904).add(term5906);
        ((ArrayList) term5904).add(term5908);
        ((ArrayList) term5904).add(term5910);
        ((ArrayList) term5904).add(term5912);
        Integer term5916 = new Integer(497269071);
        term5891 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term5891, term5891.getClass(), "Type", "PqtVXXZMqK");
        setField(term5891, term5891.getClass(), "idList", term5904);
        setField(term5891, term5891.getClass(), "meetingid", term5916);
        setField(term5891, term5891.getClass(), "email", "rYbtIDVdnd");
        setField(term5891, term5891.getClass(), "username", "UKAReurpHG");
        setField(term5891, term5891.getClass(), "base64Face", "WVRMUmrljA");
        setField(term5891, term5891.getClass(), "oldpassword", "NTlKJDDWlk");
        setField(term5891, term5891.getClass(), "newpassword", "vOuMEpOQAg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5891, args);
    }

};


