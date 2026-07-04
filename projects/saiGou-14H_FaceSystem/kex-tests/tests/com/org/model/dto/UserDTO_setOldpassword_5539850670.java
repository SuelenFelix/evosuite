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

public class UserDTO_setOldpassword_5539850670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2969;

    public UserDTO_setOldpassword_5539850670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2984 = new Integer(-1263114719);
        Integer term2986 = new Integer(-894662986);
        Integer term2988 = new Integer(304775596);
        Integer term2990 = new Integer(-1347665717);
        Integer term2992 = new Integer(-1888585309);
        ArrayList term2982 = new ArrayList();
        ((ArrayList) term2982).add(term2984);
        ((ArrayList) term2982).add(term2986);
        ((ArrayList) term2982).add(term2988);
        ((ArrayList) term2982).add(term2990);
        ((ArrayList) term2982).add(term2992);
        Integer term2996 = new Integer(683666002);
        term2969 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term2969, term2969.getClass(), "Type", "XOiDvlDhdc");
        setField(term2969, term2969.getClass(), "idList", term2982);
        setField(term2969, term2969.getClass(), "meetingid", term2996);
        setField(term2969, term2969.getClass(), "email", "AdxvLJhNLe");
        setField(term2969, term2969.getClass(), "username", "lHfTrWKMPk");
        setField(term2969, term2969.getClass(), "base64Face", "JDaAnsVTGV");
        setField(term2969, term2969.getClass(), "oldpassword", "mLUZFTfjle");
        setField(term2969, term2969.getClass(), "newpassword", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "setOldpassword", argTypes, term2969, args);
    }

};


