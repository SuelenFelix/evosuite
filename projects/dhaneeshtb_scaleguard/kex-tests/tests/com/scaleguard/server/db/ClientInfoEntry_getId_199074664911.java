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

public class ClientInfoEntry_getId_199074664911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6402;

    public ClientInfoEntry_getId_199074664911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6402 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term6402, term6402.getClass(), "id", "OcfNzHYdki");
        setField(term6402, term6402.getClass(), "name", "uPuCVuZYOI");
        setField(term6402, term6402.getClass(), "description", "TweMFhxNdj");
        setField(term6402, term6402.getClass(), "appid", "NBrvVzvQHe");
        setField(term6402, term6402.getClass(), "clientid", "FjOiNAfBOc");
        setLongField(term6402, term6402.getClass(), "expiry", -4822736661741380518L);
        setField(term6402, term6402.getClass(), "clientsecret", "iCCsaLHohG");
        setLongField(term6402, term6402.getClass(), "mts", -5386201758403679145L);
        setLongField(term6402, term6402.getClass(), "uts", -7268507582722666254L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6402, args);
    }

};


