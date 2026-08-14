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

public class ClientInfoEntry_setClientid_15986425704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5362;

    public ClientInfoEntry_setClientid_15986425704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5362 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5362, term5362.getClass(), "id", "xvkbvaEGYd");
        setField(term5362, term5362.getClass(), "name", "HBGNxdNURv");
        setField(term5362, term5362.getClass(), "description", "mfCpTPPQQm");
        setField(term5362, term5362.getClass(), "appid", "OcJCIDNIXA");
        setField(term5362, term5362.getClass(), "clientid", "XfRABIFVEp");
        setLongField(term5362, term5362.getClass(), "expiry", 2135754395358000892L);
        setField(term5362, term5362.getClass(), "clientsecret", "MHGKyEnwKc");
        setLongField(term5362, term5362.getClass(), "mts", -8085190702504231560L);
        setLongField(term5362, term5362.getClass(), "uts", 1672578078364590450L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "setClientid", argTypes, term5362, args);
    }

};


