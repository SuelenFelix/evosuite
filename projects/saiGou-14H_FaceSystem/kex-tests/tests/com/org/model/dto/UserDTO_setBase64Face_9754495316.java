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

public class UserDTO_setBase64Face_9754495316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5275;

    public UserDTO_setBase64Face_9754495316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5290 = new Integer(1384592638);
        Integer term5292 = new Integer(-1002370457);
        Integer term5294 = new Integer(-2014576105);
        Integer term5296 = new Integer(1296895584);
        Integer term5298 = new Integer(628918458);
        Integer term5300 = new Integer(-1274456137);
        Integer term5302 = new Integer(1041916673);
        ArrayList term5288 = new ArrayList();
        ((ArrayList) term5288).add(term5290);
        ((ArrayList) term5288).add(term5292);
        ((ArrayList) term5288).add(term5294);
        ((ArrayList) term5288).add(term5296);
        ((ArrayList) term5288).add(term5298);
        ((ArrayList) term5288).add(term5300);
        ((ArrayList) term5288).add(term5302);
        Integer term5306 = new Integer(-601863069);
        term5275 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term5275, term5275.getClass(), "Type", "CFyoseFGLF");
        setField(term5275, term5275.getClass(), "idList", term5288);
        setField(term5275, term5275.getClass(), "meetingid", term5306);
        setField(term5275, term5275.getClass(), "email", "SFqCrhEWLm");
        setField(term5275, term5275.getClass(), "username", "GZdcJyZntS");
        setField(term5275, term5275.getClass(), "base64Face", "OIHoJeysUi");
        setField(term5275, term5275.getClass(), "oldpassword", "WXMWFDGcLB");
        setField(term5275, term5275.getClass(), "newpassword", "wKWbJssZuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NzBMMhkhpT";
        callMethod(klass, "setBase64Face", argTypes, term5275, args);
    }

};


