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

public class UserDTO_setType_70791375311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4481;

    public UserDTO_setType_70791375311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4496 = new Integer(1555897383);
        Integer term4498 = new Integer(202001407);
        Integer term4500 = new Integer(158873461);
        Integer term4502 = new Integer(-430151637);
        Integer term4504 = new Integer(-1697741339);
        Integer term4506 = new Integer(98922530);
        ArrayList term4494 = new ArrayList();
        ((ArrayList) term4494).add(term4496);
        ((ArrayList) term4494).add(term4498);
        ((ArrayList) term4494).add(term4500);
        ((ArrayList) term4494).add(term4502);
        ((ArrayList) term4494).add(term4504);
        ((ArrayList) term4494).add(term4506);
        Integer term4510 = new Integer(-1388471422);
        term4481 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4481, term4481.getClass(), "Type", "YpJbIgJWWv");
        setField(term4481, term4481.getClass(), "idList", term4494);
        setField(term4481, term4481.getClass(), "meetingid", term4510);
        setField(term4481, term4481.getClass(), "email", "JppkknKVOw");
        setField(term4481, term4481.getClass(), "username", "iljANwuEjk");
        setField(term4481, term4481.getClass(), "base64Face", "kNqaJKIATy");
        setField(term4481, term4481.getClass(), "oldpassword", "vKQukfbJUd");
        setField(term4481, term4481.getClass(), "newpassword", "lFRJFUMVbx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sZdUNdggUW";
        callMethod(klass, "setType", argTypes, term4481, args);
    }

};


