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

public class UserDTO_equals_53061500017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5450;
     Object term5531;

    public UserDTO_equals_53061500017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5465 = new Integer(663292551);
        ArrayList term5463 = new ArrayList();
        ((ArrayList) term5463).add(term5465);
        Integer term5469 = new Integer(-1885090354);
        term5450 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term5450, term5450.getClass(), "Type", "qCpEbQDHdF");
        setField(term5450, term5450.getClass(), "idList", term5463);
        setField(term5450, term5450.getClass(), "meetingid", term5469);
        setField(term5450, term5450.getClass(), "email", "AHbZyFOmlo");
        setField(term5450, term5450.getClass(), "username", "TwfWVQGiIj");
        setField(term5450, term5450.getClass(), "base64Face", "gUvcueTURF");
        setField(term5450, term5450.getClass(), "oldpassword", "EwQBhZjCIT");
        setField(term5450, term5450.getClass(), "newpassword", "aSkmSwTnEw");
        term5531 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5531;
        callMethod(klass, "equals", argTypes, term5450, args);
    }

};


