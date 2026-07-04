package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class UserVO_toString_125005211715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44163;

    public UserVO_toString_125005211715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44164 = new Integer(1192737321);
        ArrayList term44202 = new ArrayList();
        term44163 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term44163, term44163.getClass(), "id", term44164);
        setField(term44163, term44163.getClass(), "email", "WkPwMFEfEl");
        setField(term44163, term44163.getClass(), "username", "trTXEUBFFL");
        setField(term44163, term44163.getClass(), "power", "GuOcEiTCIZ");
        setField(term44163, term44163.getClass(), "menus", term44202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term44163, args);
    }

};


