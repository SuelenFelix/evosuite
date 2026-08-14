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

public class ClientInfoEntry_getName_127210858513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6696;

    public ClientInfoEntry_getName_127210858513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6696 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term6696, term6696.getClass(), "id", "vKitydDVnM");
        setField(term6696, term6696.getClass(), "name", "urCiQnUFBM");
        setField(term6696, term6696.getClass(), "description", "EKjQdtKxAM");
        setField(term6696, term6696.getClass(), "appid", "TXZAIPQJHt");
        setField(term6696, term6696.getClass(), "clientid", "DIbeDHICho");
        setLongField(term6696, term6696.getClass(), "expiry", 1084801489398441516L);
        setField(term6696, term6696.getClass(), "clientsecret", "dJGPlmSRnz");
        setLongField(term6696, term6696.getClass(), "mts", 6273754186658578034L);
        setLongField(term6696, term6696.getClass(), "uts", 3620247240684476031L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6696, args);
    }

};


