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

public class UserDTO_setBase64Face_9754495323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13425;

    public UserDTO_setBase64Face_9754495323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13440 = new Integer(-395396657);
        Integer term13442 = new Integer(1677171453);
        Integer term13444 = new Integer(-2108979704);
        Integer term13446 = new Integer(1629835601);
        Integer term13448 = new Integer(1866184476);
        Integer term13450 = new Integer(-17998574);
        Integer term13452 = new Integer(145080354);
        Integer term13454 = new Integer(-2087321012);
        Integer term13456 = new Integer(-1613074612);
        ArrayList term13438 = new ArrayList();
        ((ArrayList) term13438).add(term13440);
        ((ArrayList) term13438).add(term13442);
        ((ArrayList) term13438).add(term13444);
        ((ArrayList) term13438).add(term13446);
        ((ArrayList) term13438).add(term13448);
        ((ArrayList) term13438).add(term13450);
        ((ArrayList) term13438).add(term13452);
        ((ArrayList) term13438).add(term13454);
        ((ArrayList) term13438).add(term13456);
        Integer term13460 = new Integer(1054908502);
        term13425 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term13425, term13425.getClass(), "Type", "yXKOrgWdes");
        setField(term13425, term13425.getClass(), "idList", term13438);
        setField(term13425, term13425.getClass(), "meetingid", term13460);
        setField(term13425, term13425.getClass(), "email", "LIssGNIAFq");
        setField(term13425, term13425.getClass(), "username", "MqkrVMSgoi");
        setField(term13425, term13425.getClass(), "base64Face", "mBvhIZezxE");
        setField(term13425, term13425.getClass(), "oldpassword", "sswCagQpqo");
        setField(term13425, term13425.getClass(), "newpassword", "LrwYiZGGQg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ugFOXAltBR";
        callMethod(klass, "setBase64Face", argTypes, term13425, args);
    }

};


