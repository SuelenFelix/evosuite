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

public class Application_WrappeApplicationRecord_getId_15506977162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3076;

    public Application_WrappeApplicationRecord_getId_15506977162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3103 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3103, term3103.getClass(), "id", "");
        setField(term3103, term3103.getClass(), "name", "");
        setField(term3103, term3103.getClass(), "description", "");
        setField(term3103, term3103.getClass(), "appid", "");
        setField(term3103, term3103.getClass(), "clientid", "");
        setField(term3103, term3103.getClass(), "clientsecret", "");
        setLongField(term3103, term3103.getClass(), "expiry", -4502405999831680926L);
        Object term3111 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3111, term3111.getClass(), "id", "");
        setField(term3111, term3111.getClass(), "name", "");
        setField(term3111, term3111.getClass(), "description", "");
        setField(term3111, term3111.getClass(), "appid", "");
        setField(term3111, term3111.getClass(), "clientid", "");
        setField(term3111, term3111.getClass(), "clientsecret", "");
        setLongField(term3111, term3111.getClass(), "expiry", 1967728129628047933L);
        Object term3119 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3119, term3119.getClass(), "id", "");
        setField(term3119, term3119.getClass(), "name", "");
        setField(term3119, term3119.getClass(), "description", "");
        setField(term3119, term3119.getClass(), "appid", "");
        setField(term3119, term3119.getClass(), "clientid", "");
        setField(term3119, term3119.getClass(), "clientsecret", "");
        setLongField(term3119, term3119.getClass(), "expiry", 2120084523938730454L);
        Object term3127 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3127, term3127.getClass(), "id", "");
        setField(term3127, term3127.getClass(), "name", "");
        setField(term3127, term3127.getClass(), "description", "");
        setField(term3127, term3127.getClass(), "appid", "");
        setField(term3127, term3127.getClass(), "clientid", "");
        setField(term3127, term3127.getClass(), "clientsecret", "");
        setLongField(term3127, term3127.getClass(), "expiry", 6855071767938501807L);
        ArrayList term3101 = new ArrayList();
        ((ArrayList) term3101).add(term3103);
        ((ArrayList) term3101).add(term3111);
        ((ArrayList) term3101).add(term3119);
        ((ArrayList) term3101).add(term3127);
        term3076 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term3076, term3076.getClass(), "name", "JppkknKVOw");
        setField(term3076, term3076.getClass(), "description", "iljANwuEjk");
        setField(term3076, term3076.getClass(), "clients", term3101);
        setField(term3076, term3076.getClass(), "id", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3076, args);
    }

};


