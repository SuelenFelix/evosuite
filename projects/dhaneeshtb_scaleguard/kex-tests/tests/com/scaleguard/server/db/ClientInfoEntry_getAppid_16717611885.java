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

public class ClientInfoEntry_getAppid_16717611885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5520;

    public ClientInfoEntry_getAppid_16717611885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5520 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5520, term5520.getClass(), "id", "IpQuOGMgmj");
        setField(term5520, term5520.getClass(), "name", "pJbnHTYrxn");
        setField(term5520, term5520.getClass(), "description", "iIRsCSYqXH");
        setField(term5520, term5520.getClass(), "appid", "nghfqDXyCG");
        setField(term5520, term5520.getClass(), "clientid", "WBAOTqErtm");
        setLongField(term5520, term5520.getClass(), "expiry", 4949335493504695457L);
        setField(term5520, term5520.getClass(), "clientsecret", "PqtVXXZMqK");
        setLongField(term5520, term5520.getClass(), "mts", -5216789073301458893L);
        setLongField(term5520, term5520.getClass(), "uts", -1832940336320585644L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppid", argTypes, term5520, args);
    }

};


