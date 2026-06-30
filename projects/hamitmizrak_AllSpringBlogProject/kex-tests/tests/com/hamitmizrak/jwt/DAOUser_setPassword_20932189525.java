package com.hamitmizrak.jwt;

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
import static com.hamitmizrak.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class DAOUser_setPassword_20932189525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143;

    public DAOUser_setPassword_20932189525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1170 = new Long(5270370404989704783L);
        term1143 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        Object term1168 = newInstance(Class.forName("java.util.Date"));
        Object term1184 = newInstance(Class.forName("java.util.Date"));
        Object term1198 = newInstance(Class.forName("java.util.Date"));
        setField(term1143, term1143.getClass(), "username", "jDtqGUpnZN");
        setField(term1143, term1143.getClass(), "password", "nGKItKLYNC");
        setLongField(term1168, term1168.getClass(), "fastTime", 1745462962080L);
        setField(term1168, term1168.getClass(), "cdate", null);
        setField(term1143, term1143.getClass(), "date", term1168);
        setField(term1143, term1143.getClass(), "id", term1170);
        setField(term1143, term1143.getClass(), "createdBy", "UiUYnPrcCi");
        setLongField(term1184, term1184.getClass(), "fastTime", 1349069753960L);
        setField(term1184, term1184.getClass(), "cdate", null);
        setField(term1143, term1143.getClass(), "createdDate", term1184);
        setField(term1143, term1143.getClass(), "updateBy", "UoYtihxVaS");
        setLongField(term1198, term1198.getClass(), "fastTime", 1706078172457L);
        setField(term1198, term1198.getClass(), "cdate", null);
        setField(term1143, term1143.getClass(), "updateDate", term1198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "setPassword", argTypes, term1143, args);
    }

};


