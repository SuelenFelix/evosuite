package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientInfoEntry_setName_44776798314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6832;

    public ClientInfoEntry_setName_44776798314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6832 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term6832, term6832.getClass(), "id", "DPskuFUobI");
        setField(term6832, term6832.getClass(), "name", "wBGfLpNNiZ");
        setField(term6832, term6832.getClass(), "description", "yUGCjlqgJE");
        setField(term6832, term6832.getClass(), "appid", "PXdVZyoJyC");
        setField(term6832, term6832.getClass(), "clientid", "vLerpqavFM");
        setLongField(term6832, term6832.getClass(), "expiry", 8313800941204938919L);
        setField(term6832, term6832.getClass(), "clientsecret", "qnvxzwuGKX");
        setLongField(term6832, term6832.getClass(), "mts", -1214968196781083707L);
        setLongField(term6832, term6832.getClass(), "uts", -1804015692891701666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EdPAvpluZg";
        callMethod(klass, "setName", argTypes, term6832, args);
    }

};


