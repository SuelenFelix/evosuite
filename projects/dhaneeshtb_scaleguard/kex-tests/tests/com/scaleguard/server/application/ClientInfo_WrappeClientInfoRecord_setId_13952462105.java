package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientInfo_WrappeClientInfoRecord_setId_13952462105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1061;

    public ClientInfo_WrappeClientInfoRecord_setId_13952462105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1061 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1061, term1061.getClass(), "id", "LvtrsXUliU");
        setField(term1061, term1061.getClass(), "name", "xLbjWUgOIL");
        setField(term1061, term1061.getClass(), "description", "jDtqGUpnZN");
        setField(term1061, term1061.getClass(), "appid", "nGKItKLYNC");
        setField(term1061, term1061.getClass(), "clientid", "UiUYnPrcCi");
        setField(term1061, term1061.getClass(), "clientsecret", "UoYtihxVaS");
        setLongField(term1061, term1061.getClass(), "expiry", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "setId", argTypes, term1061, args);
    }

};


