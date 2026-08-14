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

public class ClientInfoEntry_getMts_212788819915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6990;

    public ClientInfoEntry_getMts_212788819915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6990 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term6990, term6990.getClass(), "id", "DzHVBMqWtE");
        setField(term6990, term6990.getClass(), "name", "THZSpzBRYP");
        setField(term6990, term6990.getClass(), "description", "ZfBIVGBQOE");
        setField(term6990, term6990.getClass(), "appid", "QSrDQfEsTR");
        setField(term6990, term6990.getClass(), "clientid", "PsqusYmejD");
        setLongField(term6990, term6990.getClass(), "expiry", -6432617521836576658L);
        setField(term6990, term6990.getClass(), "clientsecret", "NTWMiBEaDF");
        setLongField(term6990, term6990.getClass(), "mts", -2255965562447970862L);
        setLongField(term6990, term6990.getClass(), "uts", 148047808219672941L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMts", argTypes, term6990, args);
    }

};


