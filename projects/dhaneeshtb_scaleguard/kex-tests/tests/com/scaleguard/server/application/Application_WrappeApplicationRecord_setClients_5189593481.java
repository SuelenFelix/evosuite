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
import java.util.LinkedList;

public class Application_WrappeApplicationRecord_setClients_5189593481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2970;
     Object term3043;

    public Application_WrappeApplicationRecord_setClients_5189593481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2997 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2997, term2997.getClass(), "id", "");
        setField(term2997, term2997.getClass(), "name", "");
        setField(term2997, term2997.getClass(), "description", "");
        setField(term2997, term2997.getClass(), "appid", "");
        setField(term2997, term2997.getClass(), "clientid", "");
        setField(term2997, term2997.getClass(), "clientsecret", "");
        setLongField(term2997, term2997.getClass(), "expiry", -4365849114644724155L);
        Object term3005 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3005, term3005.getClass(), "id", "");
        setField(term3005, term3005.getClass(), "name", "");
        setField(term3005, term3005.getClass(), "description", "");
        setField(term3005, term3005.getClass(), "appid", "");
        setField(term3005, term3005.getClass(), "clientid", "");
        setField(term3005, term3005.getClass(), "clientsecret", "");
        setLongField(term3005, term3005.getClass(), "expiry", 2486810210675247493L);
        Object term3013 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3013, term3013.getClass(), "id", "");
        setField(term3013, term3013.getClass(), "name", "");
        setField(term3013, term3013.getClass(), "description", "");
        setField(term3013, term3013.getClass(), "appid", "");
        setField(term3013, term3013.getClass(), "clientid", "");
        setField(term3013, term3013.getClass(), "clientsecret", "");
        setLongField(term3013, term3013.getClass(), "expiry", 7009926388951271268L);
        Object term3021 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term3021, term3021.getClass(), "id", "");
        setField(term3021, term3021.getClass(), "name", "");
        setField(term3021, term3021.getClass(), "description", "");
        setField(term3021, term3021.getClass(), "appid", "");
        setField(term3021, term3021.getClass(), "clientid", "");
        setField(term3021, term3021.getClass(), "clientsecret", "");
        setLongField(term3021, term3021.getClass(), "expiry", -7672528020740371001L);
        ArrayList term2995 = new ArrayList();
        ((ArrayList) term2995).add(term2997);
        ((ArrayList) term2995).add(term3005);
        ((ArrayList) term2995).add(term3013);
        ((ArrayList) term2995).add(term3021);
        term2970 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term2970, term2970.getClass(), "name", "hMmaoREuCK");
        setField(term2970, term2970.getClass(), "description", "VeDtgDzGAN");
        setField(term2970, term2970.getClass(), "clients", term2995);
        setField(term2970, term2970.getClass(), "id", "YpJbIgJWWv");
        term3043 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3043;
        callMethod(klass, "setClients", argTypes, term2970, args);
    }

};


