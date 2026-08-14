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

public class Application_WrappeApplicationRecord_setName_8878169165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3383;

    public Application_WrappeApplicationRecord_setName_8878169165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3410 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3410, term3410.getClass(), "id", "");
        setField(term3410, term3410.getClass(), "name", "");
        setField(term3410, term3410.getClass(), "description", "");
        setField(term3410, term3410.getClass(), "appid", "");
        setField(term3410, term3410.getClass(), "clientid", "");
        setField(term3410, term3410.getClass(), "clientsecret", "");
        setLongField(term3410, term3410.getClass(), "expiry", 6617340557564669657L);
        Object term3418 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3418, term3418.getClass(), "id", "");
        setField(term3418, term3418.getClass(), "name", "");
        setField(term3418, term3418.getClass(), "description", "");
        setField(term3418, term3418.getClass(), "appid", "");
        setField(term3418, term3418.getClass(), "clientid", "");
        setField(term3418, term3418.getClass(), "clientsecret", "");
        setLongField(term3418, term3418.getClass(), "expiry", 1439298019805881866L);
        Object term3426 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3426, term3426.getClass(), "id", "");
        setField(term3426, term3426.getClass(), "name", "");
        setField(term3426, term3426.getClass(), "description", "");
        setField(term3426, term3426.getClass(), "appid", "");
        setField(term3426, term3426.getClass(), "clientid", "");
        setField(term3426, term3426.getClass(), "clientsecret", "");
        setLongField(term3426, term3426.getClass(), "expiry", -8708192233349544946L);
        Object term3434 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3434, term3434.getClass(), "id", "");
        setField(term3434, term3434.getClass(), "name", "");
        setField(term3434, term3434.getClass(), "description", "");
        setField(term3434, term3434.getClass(), "appid", "");
        setField(term3434, term3434.getClass(), "clientid", "");
        setField(term3434, term3434.getClass(), "clientsecret", "");
        setLongField(term3434, term3434.getClass(), "expiry", 5907001541142728739L);
        Object term3442 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3442, term3442.getClass(), "id", "");
        setField(term3442, term3442.getClass(), "name", "");
        setField(term3442, term3442.getClass(), "description", "");
        setField(term3442, term3442.getClass(), "appid", "");
        setField(term3442, term3442.getClass(), "clientid", "");
        setField(term3442, term3442.getClass(), "clientsecret", "");
        setLongField(term3442, term3442.getClass(), "expiry", 4178434741742309755L);
        Object term3450 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3450, term3450.getClass(), "id", "");
        setField(term3450, term3450.getClass(), "name", "");
        setField(term3450, term3450.getClass(), "description", "");
        setField(term3450, term3450.getClass(), "appid", "");
        setField(term3450, term3450.getClass(), "clientid", "");
        setField(term3450, term3450.getClass(), "clientsecret", "");
        setLongField(term3450, term3450.getClass(), "expiry", -2068172595987555756L);
        Object term3458 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3458, term3458.getClass(), "id", "");
        setField(term3458, term3458.getClass(), "name", "");
        setField(term3458, term3458.getClass(), "description", "");
        setField(term3458, term3458.getClass(), "appid", "");
        setField(term3458, term3458.getClass(), "clientid", "");
        setField(term3458, term3458.getClass(), "clientsecret", "");
        setLongField(term3458, term3458.getClass(), "expiry", -6292278961887936280L);
        Object term3466 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3466, term3466.getClass(), "id", "");
        setField(term3466, term3466.getClass(), "name", "");
        setField(term3466, term3466.getClass(), "description", "");
        setField(term3466, term3466.getClass(), "appid", "");
        setField(term3466, term3466.getClass(), "clientid", "");
        setField(term3466, term3466.getClass(), "clientsecret", "");
        setLongField(term3466, term3466.getClass(), "expiry", -6645965768855543712L);
        Object term3474 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3474, term3474.getClass(), "id", "");
        setField(term3474, term3474.getClass(), "name", "");
        setField(term3474, term3474.getClass(), "description", "");
        setField(term3474, term3474.getClass(), "appid", "");
        setField(term3474, term3474.getClass(), "clientid", "");
        setField(term3474, term3474.getClass(), "clientsecret", "");
        setLongField(term3474, term3474.getClass(), "expiry", 4784595517102746672L);
        ArrayList term3408 = new ArrayList();
        ((ArrayList) term3408).add(term3410);
        ((ArrayList) term3408).add(term3418);
        ((ArrayList) term3408).add(term3426);
        ((ArrayList) term3408).add(term3434);
        ((ArrayList) term3408).add(term3442);
        ((ArrayList) term3408).add(term3450);
        ((ArrayList) term3408).add(term3458);
        ((ArrayList) term3408).add(term3466);
        ((ArrayList) term3408).add(term3474);
        term3383 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term3383, term3383.getClass(), "name", "qYzsiuXOgS");
        setField(term3383, term3383.getClass(), "description", "bxrCBbrrct");
        setField(term3383, term3383.getClass(), "clients", term3408);
        setField(term3383, term3383.getClass(), "id", "QSrDQfEsTR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsqusYmejD";
        callMethod(klass, "setName", argTypes, term3383, args);
    }

};


