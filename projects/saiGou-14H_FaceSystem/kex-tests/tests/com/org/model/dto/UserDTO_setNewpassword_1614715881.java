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

public class UserDTO_setNewpassword_1614715881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3140;

    public UserDTO_setNewpassword_1614715881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3155 = new Integer(1596213415);
        Integer term3157 = new Integer(-268815336);
        Integer term3159 = new Integer(-1210583429);
        Integer term3161 = new Integer(-663691365);
        ArrayList term3153 = new ArrayList();
        ((ArrayList) term3153).add(term3155);
        ((ArrayList) term3153).add(term3157);
        ((ArrayList) term3153).add(term3159);
        ((ArrayList) term3153).add(term3161);
        Integer term3165 = new Integer(339854490);
        term3140 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term3140, term3140.getClass(), "Type", "OJJtVNPyKZ");
        setField(term3140, term3140.getClass(), "idList", term3153);
        setField(term3140, term3140.getClass(), "meetingid", term3165);
        setField(term3140, term3140.getClass(), "email", "AKNapTAfmD");
        setField(term3140, term3140.getClass(), "username", "xJgPlLxpgC");
        setField(term3140, term3140.getClass(), "base64Face", "EYtfuJaxiM");
        setField(term3140, term3140.getClass(), "oldpassword", "gCWtLVKVVe");
        setField(term3140, term3140.getClass(), "newpassword", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        callMethod(klass, "setNewpassword", argTypes, term3140, args);
    }

};


