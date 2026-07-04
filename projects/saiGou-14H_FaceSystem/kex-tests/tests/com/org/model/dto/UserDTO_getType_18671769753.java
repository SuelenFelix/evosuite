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

public class UserDTO_getType_18671769753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3309;

    public UserDTO_getType_18671769753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3324 = new Integer(-615654495);
        Integer term3326 = new Integer(-1476117762);
        Integer term3328 = new Integer(-341962980);
        ArrayList term3322 = new ArrayList();
        ((ArrayList) term3322).add(term3324);
        ((ArrayList) term3322).add(term3326);
        ((ArrayList) term3322).add(term3328);
        Integer term3332 = new Integer(1532716628);
        term3309 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term3309, term3309.getClass(), "Type", "VMeAzAHwZj");
        setField(term3309, term3309.getClass(), "idList", term3322);
        setField(term3309, term3309.getClass(), "meetingid", term3332);
        setField(term3309, term3309.getClass(), "email", "PznxWXsZME");
        setField(term3309, term3309.getClass(), "username", "ZzIujlwVsw");
        setField(term3309, term3309.getClass(), "base64Face", "LWyEaeIyAo");
        setField(term3309, term3309.getClass(), "oldpassword", "yVMkkQhvmN");
        setField(term3309, term3309.getClass(), "newpassword", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term3309, args);
    }

};


