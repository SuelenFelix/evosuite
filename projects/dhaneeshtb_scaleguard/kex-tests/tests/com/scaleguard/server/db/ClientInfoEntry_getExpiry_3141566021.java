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

public class ClientInfoEntry_getExpiry_3141566021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4952;

    public ClientInfoEntry_getExpiry_3141566021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4952 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term4952, term4952.getClass(), "id", "NnpwZBUTvx");
        setField(term4952, term4952.getClass(), "name", "tlQSNgTkQX");
        setField(term4952, term4952.getClass(), "description", "PCipZnmBOF");
        setField(term4952, term4952.getClass(), "appid", "zcorEihhLK");
        setField(term4952, term4952.getClass(), "clientid", "GrqozDKFOk");
        setLongField(term4952, term4952.getClass(), "expiry", 4474998035090263139L);
        setField(term4952, term4952.getClass(), "clientsecret", "CFyoseFGLF");
        setLongField(term4952, term4952.getClass(), "mts", 2848819812340321742L);
        setLongField(term4952, term4952.getClass(), "uts", -8876856890348836498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiry", argTypes, term4952, args);
    }

};


