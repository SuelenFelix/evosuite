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

public class ClientInfo_WrappeClientInfoRecord_getClientsecret_2865903940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;

    public ClientInfo_WrappeClientInfoRecord_getClientsecret_2865903940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term367, term367.getClass(), "id", "ZiaGIbnzTs");
        setField(term367, term367.getClass(), "name", "tbcdzjIfER");
        setField(term367, term367.getClass(), "description", "HyxfbSQYBe");
        setField(term367, term367.getClass(), "appid", "pCTimMblYc");
        setField(term367, term367.getClass(), "clientid", "hNxWaHcfhY");
        setField(term367, term367.getClass(), "clientsecret", "RkybSrpybU");
        setLongField(term367, term367.getClass(), "expiry", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientsecret", argTypes, term367, args);
    }

};


