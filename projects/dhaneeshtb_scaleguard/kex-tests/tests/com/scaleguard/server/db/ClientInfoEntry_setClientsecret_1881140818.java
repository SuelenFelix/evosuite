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

public class ClientInfoEntry_setClientsecret_1881140818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5950;

    public ClientInfoEntry_setClientsecret_1881140818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5950 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5950, term5950.getClass(), "id", "CGOpQSZZwI");
        setField(term5950, term5950.getClass(), "name", "ypEdrstygY");
        setField(term5950, term5950.getClass(), "description", "sNQFlATEeQ");
        setField(term5950, term5950.getClass(), "appid", "ZKMLioamsY");
        setField(term5950, term5950.getClass(), "clientid", "WVbxuoDBcn");
        setLongField(term5950, term5950.getClass(), "expiry", -3936701866695933852L);
        setField(term5950, term5950.getClass(), "clientsecret", "pvDEABOxLt");
        setLongField(term5950, term5950.getClass(), "mts", 1215116475929634177L);
        setLongField(term5950, term5950.getClass(), "uts", 1597484336218508869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beAMpkroCQ";
        callMethod(klass, "setClientsecret", argTypes, term5950, args);
    }

};


