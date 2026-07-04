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

public class UserDTO_getBase64Face_15472660818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4036;

    public UserDTO_getBase64Face_15472660818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4051 = new Integer(-341152642);
        Integer term4053 = new Integer(-2015854073);
        Integer term4055 = new Integer(538259104);
        Integer term4057 = new Integer(96566506);
        Integer term4059 = new Integer(-343325701);
        Integer term4061 = new Integer(107945604);
        ArrayList term4049 = new ArrayList();
        ((ArrayList) term4049).add(term4051);
        ((ArrayList) term4049).add(term4053);
        ((ArrayList) term4049).add(term4055);
        ((ArrayList) term4049).add(term4057);
        ((ArrayList) term4049).add(term4059);
        ((ArrayList) term4049).add(term4061);
        Integer term4065 = new Integer(-1963464809);
        term4036 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4036, term4036.getClass(), "Type", "XYtryyobou");
        setField(term4036, term4036.getClass(), "idList", term4049);
        setField(term4036, term4036.getClass(), "meetingid", term4065);
        setField(term4036, term4036.getClass(), "email", "OYbzXylRWW");
        setField(term4036, term4036.getClass(), "username", "DSNsTGYXDF");
        setField(term4036, term4036.getClass(), "base64Face", "sQvGcVjdEx");
        setField(term4036, term4036.getClass(), "oldpassword", "rLHAoqXgPh");
        setField(term4036, term4036.getClass(), "newpassword", "zUlRdimJtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBase64Face", argTypes, term4036, args);
    }

};


