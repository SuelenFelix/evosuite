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

public class UserDTO_setEmail_514202121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13097;

    public UserDTO_setEmail_514202121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13112 = new Integer(-709130701);
        Integer term13114 = new Integer(86144663);
        Integer term13116 = new Integer(-1480903995);
        ArrayList term13110 = new ArrayList();
        ((ArrayList) term13110).add(term13112);
        ((ArrayList) term13110).add(term13114);
        ((ArrayList) term13110).add(term13116);
        Integer term13120 = new Integer(-2111772603);
        term13097 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term13097, term13097.getClass(), "Type", "RMAILvTevE");
        setField(term13097, term13097.getClass(), "idList", term13110);
        setField(term13097, term13097.getClass(), "meetingid", term13120);
        setField(term13097, term13097.getClass(), "email", "xKATihyOsy");
        setField(term13097, term13097.getClass(), "username", "uinyvocUGz");
        setField(term13097, term13097.getClass(), "base64Face", "mhGOBiEPDs");
        setField(term13097, term13097.getClass(), "oldpassword", "BtaROXxZYZ");
        setField(term13097, term13097.getClass(), "newpassword", "LjyAsUkMpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVYbmAKfrT";
        callMethod(klass, "setEmail", argTypes, term13097, args);
    }

};


