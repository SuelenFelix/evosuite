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

public class ClientInfoEntry_getClientid_11099822863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5226;

    public ClientInfoEntry_getClientid_11099822863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5226 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5226, term5226.getClass(), "id", "qCpEbQDHdF");
        setField(term5226, term5226.getClass(), "name", "AHbZyFOmlo");
        setField(term5226, term5226.getClass(), "description", "TwfWVQGiIj");
        setField(term5226, term5226.getClass(), "appid", "gUvcueTURF");
        setField(term5226, term5226.getClass(), "clientid", "EwQBhZjCIT");
        setLongField(term5226, term5226.getClass(), "expiry", -8463029266761149071L);
        setField(term5226, term5226.getClass(), "clientsecret", "aSkmSwTnEw");
        setLongField(term5226, term5226.getClass(), "mts", 3133860696238261492L);
        setLongField(term5226, term5226.getClass(), "uts", 7247160664318067468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientid", argTypes, term5226, args);
    }

};


