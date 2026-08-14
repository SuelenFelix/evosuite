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

public class ClientInfoEntry_getUts_213527636717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7264;

    public ClientInfoEntry_getUts_213527636717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7264 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7264, term7264.getClass(), "id", "zNFLXMifnS");
        setField(term7264, term7264.getClass(), "name", "HHQcYMSBVc");
        setField(term7264, term7264.getClass(), "description", "wdoqITnaAP");
        setField(term7264, term7264.getClass(), "appid", "rIPMBcrNqB");
        setField(term7264, term7264.getClass(), "clientid", "UDaboHZHhz");
        setLongField(term7264, term7264.getClass(), "expiry", -1616722610139554082L);
        setField(term7264, term7264.getClass(), "clientsecret", "nRvKihUSPj");
        setLongField(term7264, term7264.getClass(), "mts", 7495904023107549024L);
        setLongField(term7264, term7264.getClass(), "uts", 8802866251294305945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term7264, args);
    }

};


