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

public class ClientInfoEntry_getClientsecret_11824549057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5814;

    public ClientInfoEntry_getClientsecret_11824549057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5814 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5814, term5814.getClass(), "id", "bxrCBbrrct");
        setField(term5814, term5814.getClass(), "name", "CKWpJaaaxX");
        setField(term5814, term5814.getClass(), "description", "UBRmXJmfrt");
        setField(term5814, term5814.getClass(), "appid", "WZzvmIHhzZ");
        setField(term5814, term5814.getClass(), "clientid", "doQLHkjpNm");
        setLongField(term5814, term5814.getClass(), "expiry", -5786861555969446503L);
        setField(term5814, term5814.getClass(), "clientsecret", "lCyLIcSuom");
        setLongField(term5814, term5814.getClass(), "mts", 2354625302846375590L);
        setLongField(term5814, term5814.getClass(), "uts", 7276637106827860087L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientsecret", argTypes, term5814, args);
    }

};


