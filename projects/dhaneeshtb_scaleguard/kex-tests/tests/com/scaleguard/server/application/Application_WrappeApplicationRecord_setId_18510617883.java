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
import java.util.ArrayList;
import java.lang.Object;

public class Application_WrappeApplicationRecord_setId_18510617883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3179;

    public Application_WrappeApplicationRecord_setId_18510617883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3206 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3206, term3206.getClass(), "id", "");
        setField(term3206, term3206.getClass(), "name", "");
        setField(term3206, term3206.getClass(), "description", "");
        setField(term3206, term3206.getClass(), "appid", "");
        setField(term3206, term3206.getClass(), "clientid", "");
        setField(term3206, term3206.getClass(), "clientsecret", "");
        setLongField(term3206, term3206.getClass(), "expiry", -5892135042702373494L);
        Object term3214 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3214, term3214.getClass(), "id", "");
        setField(term3214, term3214.getClass(), "name", "");
        setField(term3214, term3214.getClass(), "description", "");
        setField(term3214, term3214.getClass(), "appid", "");
        setField(term3214, term3214.getClass(), "clientid", "");
        setField(term3214, term3214.getClass(), "clientsecret", "");
        setLongField(term3214, term3214.getClass(), "expiry", 5262507301787091109L);
        Object term3222 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3222, term3222.getClass(), "id", "");
        setField(term3222, term3222.getClass(), "name", "");
        setField(term3222, term3222.getClass(), "description", "");
        setField(term3222, term3222.getClass(), "appid", "");
        setField(term3222, term3222.getClass(), "clientid", "");
        setField(term3222, term3222.getClass(), "clientsecret", "");
        setLongField(term3222, term3222.getClass(), "expiry", -6823727938421990489L);
        Object term3230 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3230, term3230.getClass(), "id", "");
        setField(term3230, term3230.getClass(), "name", "");
        setField(term3230, term3230.getClass(), "description", "");
        setField(term3230, term3230.getClass(), "appid", "");
        setField(term3230, term3230.getClass(), "clientid", "");
        setField(term3230, term3230.getClass(), "clientsecret", "");
        setLongField(term3230, term3230.getClass(), "expiry", -484994522244390100L);
        Object term3238 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3238, term3238.getClass(), "id", "");
        setField(term3238, term3238.getClass(), "name", "");
        setField(term3238, term3238.getClass(), "description", "");
        setField(term3238, term3238.getClass(), "appid", "");
        setField(term3238, term3238.getClass(), "clientid", "");
        setField(term3238, term3238.getClass(), "clientsecret", "");
        setLongField(term3238, term3238.getClass(), "expiry", 1233889271256172047L);
        ArrayList term3204 = new ArrayList();
        ((ArrayList) term3204).add(term3206);
        ((ArrayList) term3204).add(term3214);
        ((ArrayList) term3204).add(term3222);
        ((ArrayList) term3204).add(term3230);
        ((ArrayList) term3204).add(term3238);
        term3179 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term3179, term3179.getClass(), "name", "NnpwZBUTvx");
        setField(term3179, term3179.getClass(), "description", "tlQSNgTkQX");
        setField(term3179, term3179.getClass(), "clients", term3204);
        setField(term3179, term3179.getClass(), "id", "UKAReurpHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "setId", argTypes, term3179, args);
    }

};


