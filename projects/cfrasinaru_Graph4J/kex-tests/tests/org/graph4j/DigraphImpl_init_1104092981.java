package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class DigraphImpl_init_1104092981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159743;
     Object term159746;
     Object term159748;
     Object term159750;
     Object term159752;
     Object term159754;
     Object term159756;
     Object term159758;

    public DigraphImpl_init_1104092981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159743 = (int[]) newIntArray(2);
        setIntElement(term159743, 0, 2005196001);
        setIntElement(term159743, 1, 1237885526);
        term159746 = new Integer(1815627372);
        term159748 = new Integer(2038078320);
        term159750 = new Boolean(false);
        term159752 = new Boolean(true);
        term159754 = new Boolean(false);
        term159756 = new Integer(-144529119);
        term159758 = new Integer(944374443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term159743;
        args[1] = term159746;
        args[2] = term159748;
        args[3] = term159750;
        args[4] = term159752;
        args[5] = term159754;
        args[6] = term159756;
        args[7] = term159758;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


