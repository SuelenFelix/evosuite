package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientInfo_WrappeClientInfoRecord_getExpiry_12100211132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657;

    public ClientInfo_WrappeClientInfoRecord_getExpiry_12100211132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term657, term657.getClass(), "id", "TEParAifyi");
        setField(term657, term657.getClass(), "name", "OWDIEULEFu");
        setField(term657, term657.getClass(), "description", "dWRymuLBtr");
        setField(term657, term657.getClass(), "appid", "AijpHYOFuy");
        setField(term657, term657.getClass(), "clientid", "SbAoxhfrkn");
        setField(term657, term657.getClass(), "clientsecret", "kuTXqwMtDB");
        setLongField(term657, term657.getClass(), "expiry", 5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiry", argTypes, term657, args);
    }

};


