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

public class UserDTO_equals_53061500024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13604;
     Object term13687;

    public UserDTO_equals_53061500024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13619 = new Integer(-1226802566);
        Integer term13621 = new Integer(1162813858);
        ArrayList term13617 = new ArrayList();
        ((ArrayList) term13617).add(term13619);
        ((ArrayList) term13617).add(term13621);
        Integer term13625 = new Integer(494596414);
        term13604 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term13604, term13604.getClass(), "Type", "PviulmdPhA");
        setField(term13604, term13604.getClass(), "idList", term13617);
        setField(term13604, term13604.getClass(), "meetingid", term13625);
        setField(term13604, term13604.getClass(), "email", "NAUDTajaNN");
        setField(term13604, term13604.getClass(), "username", "BgJwVzSZYi");
        setField(term13604, term13604.getClass(), "base64Face", "ecRYXrSwPc");
        setField(term13604, term13604.getClass(), "oldpassword", "EgUbHeKEEX");
        setField(term13604, term13604.getClass(), "newpassword", "qdXkDdgkzv");
        term13687 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13687;
        callMethod(klass, "equals", argTypes, term13604, args);
    }

};


